package uz.pdp.springmicrodservicehodimlar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.springmicrodservicehodimlar.entity.Hodim;

public interface HodimRepo extends JpaRepository<Hodim, Long> {
}
