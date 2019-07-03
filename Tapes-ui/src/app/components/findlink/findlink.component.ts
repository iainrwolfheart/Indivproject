import { Component, OnInit } from '@angular/core';
import { TapesService } from '../../services/tapes.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-findlink',
  templateUrl: './findlink.component.html',
  styleUrls: ['./findlink.component.css']
})
export class FindlinkComponent implements OnInit {

  public tapeFind;

  constructor(private tapesService: TapesService, private route: ActivatedRoute) { }

  ngOnInit() {
  }

  getTape(tapeFind:String) {
    this.tapesService.getTapeByName(tapeFind).subscribe(
      data => {
        this.tapeFind = data;
      },
      err => console.error(err),
      () => console.log("Tape is ready.")
    )
  }
}
