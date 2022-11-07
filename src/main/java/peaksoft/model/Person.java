package peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.service.Animal;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component
public class Person {
    private Animal animal;
   @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

}
