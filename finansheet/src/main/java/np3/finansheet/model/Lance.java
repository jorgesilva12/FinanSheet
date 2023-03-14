package np3.finansheet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data//Cria os Get and Seters
@NoArgsConstructor //Cria contrutor vazio
@AllArgsConstructor //Cria contrutor com todos atributos
@Entity
@Table(name = "np3_lance")
public class Lance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private int tipo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subcategoria_id")
    private SubCategoria subcategoria;

    private float valor;

    private Date data;

    private boolean efetivado;

    private boolean recorrente;

    private int quantidade;

    private String lance;

}
