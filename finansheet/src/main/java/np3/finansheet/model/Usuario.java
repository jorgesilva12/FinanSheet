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
@Table(name = "np3_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;


    @Column(length = 10, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<Lance> lances = new ArrayList<>();


}
