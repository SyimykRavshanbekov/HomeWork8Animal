package peaksoft.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.service.Animal;

@Setter
@Getter
@ToString
@Component
public class Dog implements Animal {
    @Value("${animal.name}")
    private String name;
    @Value("${animal.breed}")
    private String breed;


    @Override
    public void animalPlus() {
        System.out.println("it adamdyn dosu");
    }

    @Override
    public void animalMinus() {
        System.out.println("no minus");
    }
}
