import { Component, OnInit } from '@angular/core';
import { TapesService } from '../../services/tapes.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-findlink',
  templateUrl: './findlink.component.html',
  styleUrls: ['./findlink.component.css']
})
export class FindlinkComponent implements OnInit {

  public tapeFind; //wrong!

  constructor(private service: TapesService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.getTape(this.tapeFind); //SO wrong!
  }

  getTape(tapeFind:String) {
    this.service.getTapeByName(tapeFind).subscribe(
      data => {
        this.tapeFind = data;
      },
      err => console.error(err),
      () => console.log("Tape is ready.") //COULD I BE ANY MORE WRONG!?
    )
  }
}
