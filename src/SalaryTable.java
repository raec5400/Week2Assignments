import java.util.Scanner;

public class SalaryTable {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double old=0, raise=40000, newsal=0;
        System.out.format("%s%20s%15s%20s\n", "YEAR", "OLD SALARY", "RAISE", "NEW SALARY");
        System.out.format("%s%20s%15s%20s\n", "----", "----------", "-----", "----------");
        
        for (int i = 1; i < 11; i++) {           
            old = newsal;
            raise = old*0.03;
            newsal = old + raise;
            System.out.format("%2d%18.2f%18.2f%18.2f\n", i, old, raise, newsal);
        }
    }
    
}
