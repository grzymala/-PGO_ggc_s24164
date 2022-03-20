package zad7;
import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        int num = 0;
        while(!isCorrect) {
            try {
                System.out.println("Choose number > 5 and odd.");
                int res = Integer.parseInt(scanner.nextLine());
                boolean isBigEnough = res >= 5;
                boolean isOdd = (res % 2) == 1;
                isCorrect = isBigEnough && isOdd;
                if(!isCorrect) {
                    System.out.println("Bad user input.");
                } else {
                    num = res;
                }
            } catch(NumberFormatException e) {
                System.out.println("Bad user input.");
                isCorrect = false;
            }
        }
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(i == 0 || j == 0 || i == (num-1) || j == (num-1) || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
