
public class Gameplay {
    private float credit;
    private float bettingAmount;
    Wheel gameActivate = new Wheel();

    public Gameplay() { //setting default constructor to have 0 balance
        credit = 0;
        bettingAmount = 0;
    }

    public void startGame() {  
        System.out.println("Welcome to Supercar slots");
       
        gameActivate.spinWheel();
    }
}


