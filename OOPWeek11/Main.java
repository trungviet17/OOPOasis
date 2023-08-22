import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nguyen A", 22, "shfjs");
        Person p2 = new Person("Nguyen A", 20, "jhsjhd");
        Person p3 = new Person("Le B", 20, "sdhfjhs");
        List<Person> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        List<Person> check = Week11.sortGeneric(arr);
        for (Person p : check) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}