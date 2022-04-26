package uz.pdp.springmicrodservicehodimlar.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Hodim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fio;

    private String email;

    private String passportSerial;

    private Integer passportNumber;

    public Hodim(String fio, String email, String passportSerial, Integer passportNumber) {
        this.fio = fio;
        this.email = email;
        this.passportSerial = passportSerial;
        this.passportNumber = passportNumber;
    }
}
