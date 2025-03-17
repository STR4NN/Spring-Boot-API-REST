package apirest.apiresttest;


import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
// Essas duas anotações andam juntas sempre.
// @RequestMapping
@RestController
@RequestMapping("/todos")
public class ApiRestController01 {
    ApiRestService01 service;

    public ApiRestController01(ApiRestService01 service) {
        this.service = service;
    }

    @PostMapping
        List<ApiModel01> create(@RequestBody  ApiModel01 model){
      return service.create(model);
        }

        @GetMapping
    List<ApiModel01> list(){
        return service.list();
    }

    @PutMapping
    List<ApiModel01> update(@RequestBody  ApiModel01 model){
        return service.update(model);
    }
    @DeleteMapping("{id}")
    List<ApiModel01> delete(@PathVariable("id") Long id){
        return service.delete(id);
    }


}

    // @PostMapping // Envia informações para a api
    // @PutMapping muda informações da API
    // @PatchMapping muda também
    // @DeleteMapping deleta informações





