public class App {
    public static void main(String[] args) throws Exception {
        PairOfDice dée = new PairOfDice();
        int i =0;
        do {
            //lance les dées
            dée.play();
            i++;
        } while (dée.somme() != 2);
        System.out.println("les dée ont ete lances "+i+" fois avant que le total ne soit egal a 2");
    }
}
