package peaksoft.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import peaksoft.components.Animal;
import peaksoft.components.Cat;
import peaksoft.components.Dolphin;
import peaksoft.components.Person;

@Configuration
@ComponentScan("peaksoft")
@PropertySource("classpath:application.properties")

public class SpringConfig {
    //for first person
    @Value(value = "person.age")
    private String person1;

    public String getPerson1(){
        return person1;
    }
    //for second person
    @Value(value = "person2.age")
    private String person2;

    public String getPerson2(){
        return person2;
    }


    @Bean
    public Animal dolphinBean() {
        return new Dolphin();
}
//    @Bean
//    public Person personBean() {
//        return ApplicationContext.class;
//    }
}
