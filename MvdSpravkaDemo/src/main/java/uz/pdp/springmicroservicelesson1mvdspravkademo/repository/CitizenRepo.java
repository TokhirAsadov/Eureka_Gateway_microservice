package uz.pdp.springmicroservicelesson1mvdspravkademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.springmicroservicelesson1mvdspravkademo.entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Long> {
    Citizen findByPassportSerialAndPassportNumber(String passportSerial, Integer passportNumber2);
}
