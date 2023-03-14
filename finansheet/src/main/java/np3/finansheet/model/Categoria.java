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
@Table(name = "np3_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(nullable = false)
    private String categoria;

    @OneToMany(mappedBy = "categoria", fetch =  FetchType.LAZY)
    private List<Lance> lances = new ArrayList<>();

    @OneToMany(mappedBy = "categoria", fetch =  FetchType.LAZY)
    private List<SubCategoria> subCategorias = new ArrayList<>();

}
