public class App {
    public static  int mur =3;

    private static boolean blocked(SimpleRobot r) {
        return r.getForward() == mur;
    }

    public static  void charge(SimpleRobot r, int maxDist) {
        // you write this part
          int i =0;
        while (i <= maxDist && blocked(r)) {
            r.right();
            r.forward();
            i++;
        }
        System.out.println("le robot a avancé de "+r.forward());
      }
   

    public static void main(String[] args) throws Exception {
        SimpleRobot r = new SimpleRobot();
        
        charge(r, 3);


    }
}
