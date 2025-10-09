import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {


        System.out.println("\nWelcome To My Zoo Keeper Challenge Project\n");

        Animal myNewAnimal = new Animal();
        myNewAnimal.setAniSex("Male");
        myNewAnimal.setAniID("abcd123");
        myNewAnimal.setAniArrivalDate(LocalDate.ofEpochDay(0));
        System.out.println(myNewAnimal.getAniSex());
        System.out.println("myNewAnimal object's ID is: " + myNewAnimal.getAniID());


        Animal myNewAnimal2 = new Animal();
        myNewAnimal2.setAniSex("Female");

        System.out.println(myNewAnimal2.getAniSex());

        System.out.println("\nWe have " + Animal.getNumOfAnimal() + " animals in our zoo");


        LocalDate arrivalDateTime = LocalDate.of(2025, Month.NOVEMBER, 25); // Dec 25, 2025, 2:30 PM
        System.out.println("\nArrival Date and Time: " + arrivalDateTime);


        System.out.println(myNewAnimal2.toString());

        Lion myLion = new Lion();

        System.out.println(Lion.getNumOfLion() + " Lion is in our zoo");


    }
} 

 

 