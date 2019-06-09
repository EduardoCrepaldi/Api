import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import{ ServiceService }from '../../Service/service.service'
import { Mae } from 'src/app/Model/Mae';
@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  maes:Mae[];
  constructor(private service:ServiceService, private router:Router ) { }

  ngOnInit() {
    this.service.getMaes()
    .subscribe(data=>{
        this.maes=data;
    })
  }

}
