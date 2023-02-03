public class SimpleRobot {

    public int right;
    public int forward;


    public SimpleRobot() {
        this.right = 1;
        this.forward = 1;
    }


    public SimpleRobot(int right, int forward) {
        this.right = right;
        this.forward = forward;
    }


    public int getRight() {
        return this.right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getForward() {
        return this.forward;
    }

    public void setForward(int forward) {
        this.forward = forward;
    }

    public int forward(){
        return forward++;
    }
    public int right(){
       return right++;
    }



    
}