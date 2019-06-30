import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Mae } from '../Model/Mae';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/mae';
  getMaes(){
    return this.http.get<Mae[]>(this.Url);

  }
  createMae(mae:Mae){
      console.log("Entrou CreateMaeAngular");
      console.log(mae);
    // mae.nome = "Nome mãe";
    // mae.qtd_filho = 3;
    // mae.sobrenome ="VaiOK";
    // mae.disponivel = true;
    return this.http.post<Mae>(this.Url, mae);
  }

  getMaeId(id:number){
    return this.http.get<Mae>(this.Url+"/"+id);
  }

  updateMae(mae:Mae){
      return this.http.put<Mae>(this.Url+"/"+mae.id,mae);
  }

  deleteMae(mae:Mae){
    return this.http.delete<Mae>(this.Url+"/"+mae.id);
  }
}
