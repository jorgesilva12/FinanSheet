package np3.finansheet.init;

import jakarta.transaction.Transactional;
import np3.finansheet.Repository.CotaRepository;
import np3.finansheet.model.Cota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartAplication implements CommandLineRunner {
    @Autowired
    private CotaRepository cotaRepository;
    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Cota cota =cotaRepository.findByCota("10%");
        if(cota == null){
            cota = new Cota();
            cota.setCota("10%");
            cotaRepository.save(cota);
        }
        cota =cotaRepository.findByCota("35%");
        if(cota == null){
            cota = new Cota();
            cota.setCota("35%");
            cotaRepository.save(cota);
        }
        cota =cotaRepository.findByCota("55%");
        if(cota == null){
            cota = new Cota();
            cota.setCota("55%");
            cotaRepository.save(cota);
        }
    }
}
