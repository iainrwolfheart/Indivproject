import { Component, OnInit } from '@angular/core';
import { TapesService } from '../../services/tapes.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  public tapes;

  constructor(private service: TapesService) { }

  ngOnInit() {
    this.getTapes();
  }

  getTapes() {
    this.service.getTapes().subscribe(
      data => { this.tapes = data },
      err => console.error(err),
      () => console.log("Just so long as these tapes loaded")
    );
  }
}
