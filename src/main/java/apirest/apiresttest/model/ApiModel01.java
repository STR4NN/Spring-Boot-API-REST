package apirest.apiresttest.model;


import jakarta.persistence.*;

 @Entity // Entity ele trasforma uma classe em uma entidade no BD
 @Table(name = "tb_cadastro")
public class ApiModel01 {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int idade;

    public ApiModel01() {
    }

    public ApiModel01(String email, String name, int idade) {
        this.email = email;
        this.name = name;
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
