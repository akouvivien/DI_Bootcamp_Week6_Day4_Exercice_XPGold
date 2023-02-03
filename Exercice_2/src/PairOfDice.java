import java.util.Random;

public class PairOfDice {
    public int die1;
    public int die2;


    public PairOfDice() {
    }


    public PairOfDice(int die1, int die2) {
        this.die1 = die1;
        this.die2 = die2;
    }


    public int getDie1() {
        return this.die1;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public int getDie2() {
        return this.die2;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }

    void play(){
        Random rand = new Random();
        die1 = rand.nextInt(6);
        die1 = rand.nextInt(6);
    }
    int somme(){
    return die1 + die2;
    }


}