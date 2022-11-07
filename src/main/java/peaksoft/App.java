package peaksoft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import peaksoft.model.Dog;
import peaksoft.model.Person;
import peaksoft.model.Tiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        try (InputStream input = new FileInputStream("/Users/macbook_air/IdeaProjects/HomeWork8Animal/src/main/resources/application.properties")) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

            Properties prop = new Properties();
            prop.load(input);

            Person person = context.getBean("person", Person.class);
            person.setName(prop.getProperty("person.name"));
            person.setAge(Integer.parseInt(prop.getProperty("person.age")));
            Dog dog = context.getBean("dog", Dog.class);
            person.setAnimal(dog);
            System.out.println(person);
            person.getAnimal().animalPlus();
            person.getAnimal().animalMinus();

            System.out.println("-------------------------------------");

            Person person2 = context.getBean("person", Person.class);
            person2.setName(prop.getProperty("person2.name"));
            person2.setAge(Integer.parseInt(prop.getProperty("person2.age")));
            Tiger tiger = context.getBean("tiger", Tiger.class);
            person.setAnimal(tiger);
            System.out.println(person2);
            person.getAnimal().animalPlus();
            person.getAnimal().animalMinus();

        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }
}
