package apirest.apiresttest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiRestService01 {


    public ApiRestRepository01 repository;

    @Autowired
    public ApiRestService01(ApiRestRepository01 repository) {
        this.repository = repository;
    }


     public List<ApiModel01> create(ApiModel01 model){
       repository.save(model);
       return list();
    }
    public List<ApiModel01> list(){
        Sort sort = Sort.by("prioridades").descending().and(
                Sort.by("nome").ascending());
       return repository.findAll();
    }
    public List<ApiModel01> update(ApiModel01 model){
        repository.save(model);
        return list();
    }
    public List<ApiModel01> delete(Long id){
        repository.deleteById(id);
return list();
    }
}
