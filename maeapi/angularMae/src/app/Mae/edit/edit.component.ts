import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Mae } from 'src/app/Model/Mae';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  mae:Mae = new Mae();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
    this.Editar();
  }

  Editar(){
    let id =localStorage.getItem("id");
    
    this.service.getMaeId(+id)
    .subscribe(data=>{
      this.mae = data;
    })

    
  }

  Atualizar(mae:Mae){
    this.service.updateMae(mae)
    .subscribe(data=>{
      this.mae = mae;
      alert("Mãe foi atualizada com Sucesso!");
      this.router.navigate(["listar"]);
      
    })
  }
}
