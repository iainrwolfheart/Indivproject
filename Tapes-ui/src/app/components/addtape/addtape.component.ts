import { Component, OnInit } from '@angular/core';
import { TapesService } from 'src/app/services/tapes.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-addtape',
  templateUrl: './addtape.component.html',
  styleUrls: ['./addtape.component.css']
})
export class AddtapeComponent implements OnInit {

  tapeform: FormGroup;
  validMessage: string = '';

  constructor(private tapesService: TapesService) { }

  ngOnInit() {
    this.tapeform = new FormGroup ({
      id: new FormControl(''),
      songName: new FormControl('', Validators.required),
      trackNo: new FormControl('', Validators.required),
      urlLink: new FormControl('', Validators.required)
    });
  }
  submitTape() {
    if (this.tapeform.valid) {
      this.validMessage = "This tape has been submitted!";
      this.tapesService.addTape(this.tapeform.value).subscribe(
        data => {
          this.tapeform.reset();
          return true;
        },
        error => {
          return Observable.throw(error);
        }
      )
    } 
    else {
      this.validMessage = "Please fill me out!";
    }
  }
}
