package uz.pdp.springmicroservicelesson1mvdspravkademo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.TreeSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passportSerial;

    private Integer passportNumber;

    private boolean criminal;
}
