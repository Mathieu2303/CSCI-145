import java.util.Random;


public class Wheel {
    private final String[] superCarOptions = {"Ferrari", "Lamborghini", "Bugatti", "McLaren", "Koenigsegg", "Maserati"};
    public final int rows = 4;

     
    public int spinWheel(int credit) {
        Random rand = new Random();
        int newBalance = 0;
        //double for loop to have 6 random cars for 4 rows
        for (int i = 0; i < rows; i++) {
            System.out.print("Row: " + (i + 1) + ": ");
            for(int j = 0; j < 6; j++){
                int randomIndex = rand.nextInt(6);
                
                System.out.print(superCarOptions[randomIndex] + " ");
            }
            System.out.println();
        }
        return newBalance;
    }
    
}

