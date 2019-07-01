import { Component, OnInit } from '@angular/core';
import { TapesService } from '../../services/tapes.service';

@Component({
  selector: 'app-viewtapes',
  templateUrl: './viewtapes.component.html',
  styleUrls: ['./viewtapes.component.css']
})
export class ViewtapesComponent implements OnInit {
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
