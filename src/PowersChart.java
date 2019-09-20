import java.util.Scanner;

public class PowersChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int exp;
        int result;
        int x =2;
        while(true){
        System.out.print("Enter exponent (0 to 10): ");
        exp = s.nextInt();
        if(exp<0 || exp >10) System.out.println("Error - must enter number between 0 to 10.");
        else break;
        }
        
        System.out.format("%s%10s\n", "X", "2^X");
            System.out.format("%s%10s\n", "--", "----");  
            
        for (int i = 0; i < exp+1; i++) {                      
            result = (int)(Math.pow(x, i));
            System.out.format("%2d%10d\n", i, result);
        }
        
    }
    
}
