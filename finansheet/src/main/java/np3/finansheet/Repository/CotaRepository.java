package np3.finansheet.Repository;

import np3.finansheet.model.Cota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CotaRepository extends JpaRepository<Cota,Integer> {
    @Query("SELECT id, cota FROM Cota WHERE cota= (:cota)")
    public Cota findByCota(@Param("cota") String cota);
}
