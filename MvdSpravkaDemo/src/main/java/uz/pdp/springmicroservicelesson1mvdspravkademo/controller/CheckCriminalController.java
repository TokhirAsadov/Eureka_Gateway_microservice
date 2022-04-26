package uz.pdp.springmicroservicelesson1mvdspravkademo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.springmicroservicelesson1mvdspravkademo.service.CheckCriminalService;

@RestController
@RequestMapping("/api/v1/mvd/checkCriminal")
@RequiredArgsConstructor
public class CheckCriminalController {

    private final CheckCriminalService checkCriminalService;

    @GetMapping
    public Boolean checkCriminal(@RequestParam String passportSerial,
                              @RequestParam Integer passportNumber){
        return checkCriminalService.checkCitizenCriminal(passportSerial, passportNumber);

    }
}