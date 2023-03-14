package np3.finansheet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data//Cria os Get and Seters
@NoArgsConstructor //Cria contrutor vazio
@AllArgsConstructor //Cria contrutor com todos atributos
@Entity
@Table(name = "np3_cota")
public class Cota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String cota;

}
