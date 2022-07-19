import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Serialization {
    public static void main(String[] args) {
        List<Person> people1 = new ArrayList<>();
        people1.add(new Person("John Doe", 21));
        people1.add(new Person("Jane Doe", 22));
        people1.add(new Person("Jack Doe", 23));

        // Writing to a file
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people1);

            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Person> people2 = (List<Person>) ois.readObject();

            ois.close();
            fis.close();

            for (Person person : people2) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        File f = new File("people.bin");
        f.delete();
    }

}

class Person implements Serializable {
    private String name;
    private int age;
    transient private String address = "black address";   // transient keyword is used to make the field not serializable

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person Details: " + "\tname- " + name + "\tage: " + age + "\taddress: " + address;
    }
}
