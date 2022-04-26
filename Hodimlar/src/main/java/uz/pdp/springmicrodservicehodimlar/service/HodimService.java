package uz.pdp.springmicrodservicehodimlar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import uz.pdp.springmicrodservicehodimlar.entity.Hodim;
import uz.pdp.springmicrodservicehodimlar.payload.HodimDto;
import uz.pdp.springmicrodservicehodimlar.repository.HodimRepo;

@Service
@RequiredArgsConstructor
public class HodimService {
    private final HodimRepo hodimRepo;

    private final RestTemplate restTemplate;

    @Transactional
    public void savedHodim(HodimDto hodimDto){

        //todo validate(email and passport info)
        //todo check MVD

        //todo sava DB

        Boolean criminal = restTemplate.getForObject("http://MVD/api/v1/mvd/checkCriminal?passportSerial="+hodimDto.getPassportSerial()
                        +"&passportNumber="+hodimDto.getPassportNumber(),
                Boolean.class);

        if (Boolean.TRUE.equals(criminal)){
            throw  new IllegalStateException("obboooo");
        }
        Hodim hodim=(Hodim.builder()
                .fio(hodimDto.getFio())
                .email(hodimDto.getEmail())
                .passportSerial(hodimDto.getPassportSerial())
                .passportNumber(hodimDto.getPassportNumber()).build());
        //todo send Notification
        hodimRepo.saveAndFlush(hodim);

    }
}