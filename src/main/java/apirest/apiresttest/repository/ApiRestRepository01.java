package apirest.apiresttest.repository;

import apirest.apiresttest.model.TarefaToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repositorio para acessar.
@Repository
public interface ApiRestRepository01 extends JpaRepository<TarefaToDo, Long> {
}
