package peaksoft.components;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import peaksoft.config.SpringConfig;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@SuppressWarnings("Lombok")
@Getter
@Setter
@NoArgsConstructor
@ToString
//@AllArgsConstructor
//@Component
//@Scope("prototype")
public class Person {

    @Autowired
    @Qualifier("dolphin")
    private Animal animal;
    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;
    @Value ("${person2.name}")
    private String name2;

    @Value("${person2.age}")
    private Integer age2;
    public void methodsOfDolphin(){
        animal.animalPlus();
        animal.animalMinus();
    }
    public Person(Animal animal) {
        this.animal = animal;
//        this.name = this.name2;
//        this.age = this.age2;
 }
    public Person(String name2, Integer age2) {
        this.name2 = name2;
        this.age2 = age2;
    }
        @PostConstruct
                private void construct(){
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            Person person = context.getBean("person", Person.class);
            System.out.println(person);
        }
    @Override
    public String toString() {
        return "Person{" +
                "animal=" + animal +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
