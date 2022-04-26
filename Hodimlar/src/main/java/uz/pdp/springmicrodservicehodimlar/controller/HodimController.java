package uz.pdp.springmicrodservicehodimlar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.springmicrodservicehodimlar.entity.Hodim;
import uz.pdp.springmicrodservicehodimlar.payload.HodimDto;
import uz.pdp.springmicrodservicehodimlar.service.HodimService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hodim")
@RequiredArgsConstructor
public class HodimController {

    private final HodimService hodimService;

    @PostMapping("/save")
    public HttpEntity<?> saveHodim(@RequestBody HodimDto hodimDto){
        hodimService.savedHodim(hodimDto);
        return ResponseEntity.status(201).body("Saved");
    }

}
