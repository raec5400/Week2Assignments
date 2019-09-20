import java.util.Scanner;

public class PowersChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int exp;
        int x =2;
        while(true){
        System.out.print("Enter exponent (0 to 10): ");
        exp = s.nextInt();
        if(exp<0 || exp >10) System.out.println("Error - must enter number between 0 to 10.");
        else break;
        }
        System.out.format("%s%10", "X", "2^X");
        System.out.format("%s%10", "--", "----");
        System.out.println(Math.pow(x,exp));
    }
    
}
