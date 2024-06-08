import {Component, OnDestroy, OnInit} from '@angular/core';
import {AuthService} from "../../services/user/auth.service";
import {PublicationsService} from "../../services/publications/publications.service";
import {Params, Router} from "@angular/router";
import {cAlert} from "../../services/custom-alert/custom-alert.service";
import {PublicationMin} from "../../models/publication/publication-min";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit,OnDestroy{

  private subs: Subscription = new Subscription();
  list: PublicationMin[] = [
  ];
  countTotal=1;
  constructor(public service:AuthService, private pubService: PublicationsService,
              private router: Router) {

  }


  ngOnDestroy(): void {
    this.subs.unsubscribe();
  }

  ngOnInit(): void {
    this.charge()
  }
  charge(){

    this.subs.add(
      this.pubService.getRecomm(5).subscribe(
        {
          next: value => {
            this.countTotal=value["countTotal"]
            this.list=value["list"]
          },
          error: err => {
            cAlert("error","Error inesperado en el servidor, revise su conexion a internet");
          }
        }
      )
    );
  }

  go(id:number){
    this.router.navigate(["/pub/"+id])

  }
}
