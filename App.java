import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {


        System.out.println("\nWelcome To My Zoo Keeper Challenge Project\n");

        Animal myNewAnimal = new Animal();

        System.out.println("The first animals information is: " + myNewAnimal.toString());

        Animal myNewAnimal2 = new Animal();
        myNewAnimal2.setAniSex("Female");
        myNewAnimal2.setAniID("abcd123");
        LocalDate arrivalDateTime = LocalDate.of(2025, Month.NOVEMBER, 25); // Dec 25, 2025, 2:30 PM
        myNewAnimal2.setAniBirthdate(arrivalDateTime);
        myNewAnimal2.setAniColor("Tan");
        myNewAnimal2.setAniWeight(70);
        myNewAnimal2.setAniOrigin("Friguia Park,Tunisia");
        LocalDate arrivalDateTime2 = LocalDate.of(2025, Month.NOVEMBER, 25); // Dec 25, 2025, 2:30 PM
        myNewAnimal2.setAniArrivalDate(arrivalDateTime2);
        myNewAnimal2.setAniName("Kiara");
        myNewAnimal2.setAniSound("HAHA");
        myNewAnimal2.setAniSex("Female");


        System.out.println("The second animals information is: " + myNewAnimal2.toString());
        System.out.println("We have " + Animal.getNumOfAnimal() + " animals in our zoo");



        Lions myLion = new Lions();

        Lions myLion2 = new Lions();
        System.out.println("\nWe have " + Lions.getNumOfLions() + " lions in our zoo");
        myLion2.setAniID("aaa111");
        System.out.println( myLion2.toString());

        Hyenas myHyenas = new Hyenas();
        System.out.println("We have " + Hyenas.getNumOfHyenas() + " hyenas in our zoo");


        Tigers myTigers = new Tigers();
        System.out.println("We have " + Tigers.getNumOfTigers() + " Tigers in our zoo");


        Bears myBears = new Bears();
        System.out.println("We have " + Bears.getNumOfBears() + " Bears in our zoo");

    }
}

