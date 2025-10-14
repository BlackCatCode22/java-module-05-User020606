public class Lions  extends Animal{

    private static int numOfLions = 0;

    public Lions() {
        numOfLions++;
    }

    public static int getNumOfLions() {
        return numOfLions;
    }





}
