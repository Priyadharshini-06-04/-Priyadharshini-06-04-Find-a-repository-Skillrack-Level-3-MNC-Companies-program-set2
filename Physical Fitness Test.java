import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalOxygenC1 = 0;
        int totalOxygenC2 = 0;
        int totalOxygenC3 = 0;

        totalOxygenC1 += scanner.nextInt(); 
        totalOxygenC2 += scanner.nextInt();
        totalOxygenC3 += scanner.nextInt();

        totalOxygenC1 += scanner.nextInt(); 
        totalOxygenC2 += scanner.nextInt();
        totalOxygenC3 += scanner.nextInt();

        totalOxygenC1 += scanner.nextInt(); 
        totalOxygenC2 += scanner.nextInt();
        totalOxygenC3 += scanner.nextInt();

        int maxTotal = Math.max(totalOxygenC1, Math.max(totalOxygenC2, totalOxygenC3));

        if (totalOxygenC1 == maxTotal) {
            System.out.println("Candidate Number: 1");
        }
        if (totalOxygenC2 == maxTotal) {
            System.out.println("Candidate Number: 2");
        }
        if (totalOxygenC3 == maxTotal) {
            System.out.println("Candidate Number: 3");
        }

        scanner.close();
    }
}
