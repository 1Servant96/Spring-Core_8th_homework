package peaksoft.components;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Cat implements Animal {
    @Value("${cat.breed}")
    private String breed;
    @Value("${cat.age}")
    private Integer age;
    @Value("${cat.color}")
    private String color;
    @Value("${cat.nickname}")
    private String nickname;

    public void animalPlus() {
        System.out.println("plus of cat");
    }

    public void animalMinus() {
        System.out.println("minus of cat");
    }
}
