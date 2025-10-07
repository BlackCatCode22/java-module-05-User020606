import java.time.LocalDate;
public class Animal {

    static int numOfAnimal = 0;

    // Constructor
    public Animal(String anilD, LocalDate aniBirthdate, String aniColor, int aniWeight,
                  String aniOrigin, LocalDate aniArrivalDate, String aniName,
                  String aniSound, String aniSex) {
        this.anilD = anilD;
        this.aniBirthdate = aniBirthdate;
        this.aniColor = aniColor;
        this.aniWeight = aniWeight;
        this.aniOrigin = aniOrigin;
        this.aniArrivalDate = aniArrivalDate;
        this.aniName = aniName;
        this.aniSound = aniSound;
        this.aniSex = aniSex;


    }

    public Animal() {
        numOfAnimal++;
    }

    public static int getNumOfAnimal() {
        return numOfAnimal;
    }

    // Make field private

    private int numOfAnimals;

    private String anilD;

    private LocalDate aniBirthdate;       // Use LocalDate for ISO 8601 date format

    private String aniColor;

    private int aniWeight;

    private String aniOrigin;

    private LocalDate aniArrivalDate;     // Also LocalDate for ISO 8601

    private String aniName;

    private String aniSound;

    private String aniSex;

    // Getter and Setter for anilD

    public String getAnilD() {return anilD;}
    public void setAnilD(String anilD) {this.anilD = anilD;}

    // Getter and Setter for birthdate

    public LocalDate getAniBirthdate() {return aniBirthdate;}
    public void setAniBirthdate(LocalDate aniBirthdate) {this.aniBirthdate = aniBirthdate;}

    // Getter and Setter for color

    public String getAniColor() {return aniColor;}
    public void setAniColor(String aniColor) {this.aniColor = aniColor;}

    // Getter and Setter for weight

    public int getAniWeight() {return aniWeight;}
    public void setAniWeight(int aniWeight) {this.aniWeight = aniWeight;}

    public String getAniOrigin() {return aniOrigin;}
    public void setAniOrigin(String aniOrigin) {this.aniOrigin = aniOrigin;}

    public LocalDate getAniArrivalDate() {return aniArrivalDate;}
    public void setAniArrivalDate(LocalDate aniArrivalDate) {this.aniArrivalDate = aniArrivalDate;}

    public String getAniName() {return aniName;}
    public void setAniName(String aniName) {this.aniName = aniName;}

    public String getAniSound() {return aniSound;}
    public void setAniSound(String aniSound) {this.aniSound = aniSound;}

    public String getAniSex() {return aniSex;}
    public void setAniSex(String aniSex) {this.aniSex = aniSex;}


}