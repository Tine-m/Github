package exercise;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // spørg bruger
        String answer = askUser();
        // flip coin
        int coinSide = flipCoin();
        // sammenlign svar
        boolean result = compareResult(answer, coinSide);
        // udskriv resultat
        printResult(result);
    }

    public static String askUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose Heads or Tails: ");
        String answer = scanner.nextLine();
        return answer;
    }

    public static int flipCoin() {
        Random random = new Random();
        // 0 is head and 1 is tail
        int result = random.nextInt(2);
        return result;
    }

    public static boolean compareResult(String user, int coin) {
        return true;
    }

    public static void printResult(boolean result) {
        System.out.println(result);
        System.out.println("vundet");
    }
}
