package uz.pdp.springmicroservicelesson1mvdspravkademo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.springmicroservicelesson1mvdspravkademo.repository.CitizenRepo;

@Service
@RequiredArgsConstructor
public class CheckCriminalService {
    private final CitizenRepo citizenRepo;

    public boolean checkCitizenCriminal(String passportSerial, Integer passportNumber){

        return citizenRepo.findByPassportSerialAndPassportNumber(passportSerial, passportNumber).isCriminal();
    }

}
