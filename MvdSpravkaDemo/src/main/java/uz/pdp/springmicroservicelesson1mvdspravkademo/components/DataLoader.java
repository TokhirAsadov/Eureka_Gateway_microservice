package uz.pdp.springmicroservicelesson1mvdspravkademo.components;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.pdp.springmicroservicelesson1mvdspravkademo.entity.Citizen;
import uz.pdp.springmicroservicelesson1mvdspravkademo.repository.CitizenRepo;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {


    @Value("${spring.sql.init.mode}")
    private String mode;
    private final CitizenRepo citizenRepo;


    @Override
    public void run(String... args) throws Exception {
        if (mode.equals("always")) {
            citizenRepo.save(Citizen.builder()
                    .criminal(false)
                    .passportSerial("AB")
                    .passportNumber(1234567)
                    .build());

            citizenRepo.save(Citizen.builder()
                    .criminal(true)
                    .passportSerial("BA")
                    .passportNumber(7654321)
                    .build());
        }
    }
}
