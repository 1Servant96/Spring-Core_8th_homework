package peaksoft.components;

import lombok.*;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation.Value;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
@AllArgsConstructor

public class Dolphin implements Animal {
    @Value("${dolphin.breed}")
    private String breed;
    @Value("${dolphin.age}")
    private Integer age;
    @Value("${dolphin.color}")
    private String color;
    @Value("${dolphin.nickname}")
    private String nickname;

    public void animalPlus() {
        System.out.println("plus of dolphin");
    }

    public void animalMinus() {
        System.out.println("minus of dolphin");
    }
}
