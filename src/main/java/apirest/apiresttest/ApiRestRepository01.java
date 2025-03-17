package apirest.apiresttest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ApiRestRepository01 extends JpaRepository<ApiModel01, Long> {
}
