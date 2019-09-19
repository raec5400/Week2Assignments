import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;   
        int quo, remain;
            System.out.print("Enter 1st number: ");
            num1=s.nextInt();           
            System.out.print("Enter 2nd number: ");
            num2=s.nextInt();
            if(num1>num2){
                quo = num1/num2;
                remain = num1 - quo*num2;
            }
            else{
                quo = num2/num1;
                remain = num2-quo*num1;
            }
        System.out.format("Quotient: %d\n", quo);
        System.out.format("Remainder: %d\n", remain);
        
    }
    
}
