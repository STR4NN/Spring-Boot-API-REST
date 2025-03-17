package apirest.apiresttest.services;

import apirest.apiresttest.model.TarefaToDo;
import apirest.apiresttest.repository.ApiRestRepository01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiRestService01 {

    public ApiRestRepository01 repository;
    @Autowired
    public ApiRestService01(ApiRestRepository01 repository) {
        this.repository = repository;
    }

    // CRUD - Create
     public List<TarefaToDo> create(TarefaToDo model){
       repository.save(model);
       return list();
    }
    public List<TarefaToDo> list(){
        // Organiza a lista, pela prioridade e pelo nome.
        Sort sort = Sort.by("prioridades").descending().and(
                Sort.by("nome").ascending());

       return repository.findAll();
    }
    public List<TarefaToDo> update(TarefaToDo model){
        repository.save(model);
        return list();
    }
    public List<TarefaToDo> delete(Long id){
        repository.deleteById(id);
    return list();
    }
}
