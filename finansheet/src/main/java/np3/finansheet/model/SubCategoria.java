package np3.finansheet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data//Cria os Get and Seters
@NoArgsConstructor //Cria contrutor vazio
@AllArgsConstructor //Cria contrutor com todos atributos
@Entity
@Table(name = "np3_subcategoria")
public class SubCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20, nullable = false)
    private String subcategoria;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "subcategoria")
    private List<Lance> lances = new ArrayList<>();

}
