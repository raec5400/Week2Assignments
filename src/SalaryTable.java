import java.util.Scanner;

public class SalaryTable {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double old=40000, raise=0, newsal=0;
        System.out.format("%s%20s%15s%20s\n", "YEAR", "OLD SALARY", "RAISE", "NEW SALARY");
        System.out.format("%s%20s%15s%20s\n", "----", "----------", "-----", "----------");
        System.out.format("%2s%17s%21s%18s\n", "1", "-", "$40000", "$40000");
        for (int i = 2; i < 11; i++) {           
            raise = old*0.03;
            newsal = old + raise;
            System.out.format("%2d%21.2f%17.2f%18.2f\n", i, old, raise, newsal);
            old = newsal;
        }
    }
    
}
