import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(); 

        int Y = scanner.nextInt(); 

        double requiredWaterLevel = X * 0.8;
        int requiredMinWater = (int) Math.ceil(requiredWaterLevel);
        
        int currentWater = 0;
        int bucketsPoured = 0;
        
        while (scanner.hasNextInt()) {
            int bucketAmount = scanner.nextInt();
            
            bucketsPoured++;
            
            currentWater += bucketAmount;
            
            if (currentWater >= requiredMinWater) {
                System.out.println(bucketsPoured);
                scanner.close();
                return;
            }
        }

        System.out.println("TANK NOT FULL");

        scanner.close();
    }
}
