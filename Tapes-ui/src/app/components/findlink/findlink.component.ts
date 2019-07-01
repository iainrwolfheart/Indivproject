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
    this.getTape(this.route.snapshot.params.songName);
    //songName may need to be changed to route on routing.module
  }

  getTape(songName:String) {
    this.tapesService.getTapeByName(songName).subscribe(
      data => {
        this.tapeFind = data;
      },
      err => console.error(err),
      () => console.log("Tape is ready.")
    );
  }
}
