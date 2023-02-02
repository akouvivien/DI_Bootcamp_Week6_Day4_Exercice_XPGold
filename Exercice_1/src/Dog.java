public class Dog {

    public int DrinkTime;

    public Dog() {
        super();
    }

    public Dog(int DrinkTime) {
        super();
        this.DrinkTime = DrinkTime;
    }


    public int getDrinkTime() {
        return this.DrinkTime;
    }

    public void setDrinkTime(int DrinkTime) {
        this.DrinkTime = DrinkTime;
    }


    public boolean needsToGo() {
        return DrinkTime > 4;
    }
}