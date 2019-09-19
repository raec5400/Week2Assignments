import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours;
        double reg = 0, over = 0, total = 0;
        double totalreg=0, totalover=0, grandtotal=0;
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter number of hours for employee " + (i + 1) + ": ");
                hours = s.nextInt();
                if (hours <= 0 || hours >= 71) {
                    System.out.println("Enter number between 1 and 70.");
                } else {
                    break;
                }
            }
            if (hours > 40) {
                reg = 15 * 40;
                over = 22.5 * (hours - 40);
            } else {
                reg = 15 * hours;
                over = 0;
            }

            total = reg + over;
            System.out.format("Regular Pay: $%9.2f\n", reg);
            System.out.format("Overtime Pay: $%8.2f\n", over);
            System.out.format("Total Pay: $%11.2f\n", total);
            System.out.format("-----------------------------------------\n");            
        
        }
        
        
        System.out.format("Grand Total: \n", totalreg);

    }

}
