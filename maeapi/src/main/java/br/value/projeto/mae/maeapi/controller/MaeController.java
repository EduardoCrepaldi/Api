package br.value.projeto.mae.maeapi.controller;


import br.value.projeto.mae.maeapi.model.Mae;
import br.value.projeto.mae.maeapi.reponse.ErrorResponse;
import br.value.projeto.mae.maeapi.repository.MaeRepository;
import br.value.projeto.mae.maeapi.service.MaeService;

import java.io.Console;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/mae")
public class MaeController {

    private MaeService service;
    private MaeRepository repository;

    @Autowired
    public MaeController(MaeService service, MaeRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Mae> buscarMaes(){
        return service.buscarMaes();
    }

//    @RequestMapping(method = RequestMethod.GET,  path="/", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Mae findById(@QueryParam("id") long id){
//        return service.findById(id);
//    }

    @GetMapping(path = "/{id}")
    public Mae listarID(@PathVariable("id")long id){
        return service.findById(id);
    }

//    @RequestMapping(method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<String> incluirMae(@RequestBody Mae mae){
//        System.out.println("Entrou com: " + mae.toString());
//        try {
//            return new ResponseEntity<>(service.incluirMae(mae), HttpStatus.OK);
//        } catch(Exception e) {
//            return new ResponseEntity<>(montarObjetoErroResponse(e.getMessage()), HttpStatus.CONFLICT);
//        }
//    }

    @PostMapping
    public Mae inserir(@RequestBody Mae mae){
        return service.incluirMae(mae);
    }


//    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> update(@RequestBody Mae mae) {
//        try {
//            return new ResponseEntity<>(service.atualizarMae(mae), HttpStatus.OK);
//        } catch(Exception e) {
//            return new ResponseEntity<>(montarObjetoErroResponse(e.getMessage()), HttpStatus.CONFLICT);
//        }
//    }

    @PutMapping(path = {"/{id}"})
    public Mae update(@RequestBody Mae mae, @PathVariable("id") long id)
    {
        mae.setId(id);
        System.out.println("Entrou aqui");
        System.out.println(mae.toString());
        return service.atualizarMae(mae);
    }
//    @RequestMapping(method = RequestMethod.DELETE)
//    public ResponseEntity<?> delete(@PathVariable long id) {
//        return repository.findById(id)
//                .map(record -> {
//                    service.deletar(id);
//                    return ResponseEntity.ok().build();
//                }).orElse(ResponseEntity.notFound().build());
//    }

    @DeleteMapping(path = {"/{id}"})
    public Mae delete(@PathVariable("id")long id)
    {
        return service.deletar(id);
    }

    private String montarObjetoErroResponse(String errorDescription) {
        Gson gson = new Gson();
        return gson.toJson(new ErrorResponse(errorDescription, HttpStatus.CONFLICT));
    }
}