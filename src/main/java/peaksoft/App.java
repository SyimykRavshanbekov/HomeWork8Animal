package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.model.Dog;
import peaksoft.model.Person;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("person", Person.class);
        Dog dog = context.getBean("dog", Dog.class);
        person.setAnimal(dog);
        System.out.println(person);
        person.getAnimal().animalPlus();
        person.getAnimal().animalMinus();
    }
}
