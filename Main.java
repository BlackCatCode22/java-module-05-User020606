public class Main {
    public static void main(String[] args) {


        System.out.println("\nWelcome To My Zoo Keeper Challenge Project\n");

        Animal myNewAnimal = new Animal();
        myNewAnimal.setAniSex("Male");
        myNewAnimal.setAnilD("abcd123");


        System.out.println("First animal is a " + myNewAnimal.getAniSex());
        System.out.println("\nmyNewAnimal object's age is: " + myNewAnimal.getAnilD());

        Animal myNewAnimal2 = new Animal();
        myNewAnimal2.setAniSex("Female");

        System.out.println("\nSecond animals is a " + myNewAnimal2.getAniSex());




        System.out.println("\nWe have " + Animal.numOfAnimal + " animals in our zoo");

    }
}