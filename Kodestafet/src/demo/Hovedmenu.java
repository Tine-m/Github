package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hovedmenu {
	static Scanner scan = new Scanner(System.in);
	static String ynglingsRet = "";

	public static void main(String[] args) {
        run();
    }

    public static void run() {
        int tal = 0;
        while (true) {
        	udskrivMenu();

            tal = indtastTal();
            scan.nextLine();

            switch (tal) {
				case 1:
					indlæsYnglingsRet();
					break;
				case 2:
					udskrivYnglingsRet();
					break;
				case 3:
					udskrivDato();
					break;
				default: System.exit(1);
            }
			System.out.println("tryk enter for at returnere til hovedmenu");
			scan.nextLine();

            }

        }
    public static void udskrivMenu() {
		System.out.println("Hovedmenu - 9 afslutter programmet");
		System.out.println("1. Indtast ynglingsret");
		System.out.println("2. Udskriv ynglingsret");
		System.out.println("3. Udskriv dato");
		System.out.print("Indtast menu nummer: ");
	}

	public static int indtastTal(){
    	int tal = 0;
    	while(!scan.hasNextInt()){
			System.out.println("\nDu skal skrive et tal!");
			System.out.print("Indtast menu nummer: ");
			scan.nextLine();
		}
		tal = scan.nextInt();
		return tal;
	}

    public static void indlæsYnglingsRet() {
		System.out.println();
        System.out.print("Hvad er din yndlingsret? ");
        ynglingsRet = scan.nextLine();
    }

	public static void udskrivYnglingsRet() {
		System.out.println();
    	System.out.println("Din ynglingsret er: " + ynglingsRet);

	}

	public static void udskrivDato() {
		System.out.println();
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
	}
}
