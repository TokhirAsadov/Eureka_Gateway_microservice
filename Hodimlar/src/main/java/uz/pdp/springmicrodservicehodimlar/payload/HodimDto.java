package uz.pdp.springmicrodservicehodimlar.payload;

import lombok.Data;

@Data
public class HodimDto {
    private Long id;

    private String fio;

    private String email;

    private String passportSerial;

    private int passportNumber;


}
