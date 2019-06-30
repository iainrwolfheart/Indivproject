import { Component, OnInit } from '@angular/core';
import { TapesService } from '../../services/tapes.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private tapesService: TapesService) { }

  ngOnInit() {
  }

}
