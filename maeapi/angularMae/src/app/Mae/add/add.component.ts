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

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  Salvar(mae:Mae){
    this.service.createMae(mae)
    .subscribe(data=>{
      alert("Mãe cadastrada com Sucesso!");
      this.router.navigate(["listar"]);
    }
      
      )

  }

}
