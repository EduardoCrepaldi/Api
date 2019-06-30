import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/Service/service.service';
import { Router } from '@angular/router';
import { Mae } from 'src/app/Model/Mae';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  mae:Mae;
  salvesalve:Boolean;

  constructor(private router:Router, private service:ServiceService) {
    this.mae = new Mae();
  }

  ngOnInit() {
  }

  Salvar(){
    console.log(this.salvesalve)
    this.service.createMae(this.mae)
    .subscribe(data=>{
      alert("Mãe cadastrada com Sucesso!");
      this.router.navigate(["listar"]);
    }
      
      )

  }

}
