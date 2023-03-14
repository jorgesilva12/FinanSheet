package np3.finansheet.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cota")
public class CotaController {
    @GetMapping()
    public String cota(){ return "Teste de cota";}
}
