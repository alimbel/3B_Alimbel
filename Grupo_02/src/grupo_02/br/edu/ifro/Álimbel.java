
package grupo_02.br.edu.ifro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationTypr;
import javax.persistence.id;

@Entity
public class Álimbel {
    @id
    @GeneratedValue(atrategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
