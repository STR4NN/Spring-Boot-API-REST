package apirest.apiresttest.controller;


import apirest.apiresttest.model.TarefaToDo;
import apirest.apiresttest.services.ApiRestService01;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
// Essas duas anotações andam juntas sempre.
// @RequestMapping
@RestController
@RequestMapping("/todos")
public class ApiRestController01 {

    ApiRestService01 service; // Construtor para não precisar instanciar sempre
    public ApiRestController01(ApiRestService01 service) {
        this.service = service;
    }

    // Metodo HTTP POST da lista
    @PostMapping
    List<TarefaToDo> create(@RequestBody TarefaToDo model){
      return service.create(model);
        }

    // Metodo HTTP Get da lista de tarefas
    @GetMapping
    List<TarefaToDo> list(){
        return service.list();
    }

    // Metodo HTTP PUT da lista
    @PutMapping
    List<TarefaToDo> update(@RequestBody TarefaToDo model){
        return service.update(model);
    }

    // Metodo HTTP delete da lista
    @DeleteMapping("{id}")
    List<TarefaToDo> delete(@PathVariable("id") Long id){
        return service.delete(id);
    }
    // PathVariable faz uma variavel, onde a tarefa é excluida pelo ID

}
    // @PostMapping // Envia informações para a api
    // @PutMapping muda informações da API
    // @PatchMapping muda também
    // @DeleteMapping deleta informações





