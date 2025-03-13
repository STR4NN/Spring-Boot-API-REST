package apirest.apiresttest.controller;


import apirest.apiresttest.model.ApiModel01;
import org.springframework.web.bind.annotation.*;

@RestController
// Essas duas anotações andam juntas sempre.
@RequestMapping
public class ApiRestController01 {


    // @PostMapping // Envia informações para a api
    // @PutMapping muda informações da API
    // @PatchMapping muda também
    // @DeleteMapping deleta informações

    @PostMapping("/oi")
    public String ganharPrimeiraMensagem(){
        ApiModel01 apiModel01 = new ApiModel01("Nome", "Top", 10);

        return apiModel01.getName().toString();
    }
    @GetMapping("/boas-vindas") //Seria como localhost:8080/boas-vindas / Puxa informações da API
    public String boasVindas(){
        return "Essa é a primeira mensagem nessa rota";
    }
}
