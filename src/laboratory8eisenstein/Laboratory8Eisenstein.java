package laboratory8eisenstein;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Laboratory8Eisenstein {

	public static void main(String[] args) {
	
		boolean run = true;
		while (run) {
		
		                           // 0         1           2          3          4         5       6     TOTAL LENGTH 7
		String[] namesOfStudents = {"Apple", "Banana", "Cantelope", "Daikon", "Edemame", "Fanta", "Goop"};
		
		
		                                                  //    0          1          2          3          4          5          6
		String[] studentsLeastFavoriteGermanCityInSaxony = {"Leipzig", "Dresden", "Chemnitz", "Zwickau", "Plauen", "Freiberg", "Pirna"};
		
		
															// 0                          1                         2                    3                         4                         5                      6                   
		String[] studentsFavoriteAncientWorldWonder = {"Great Pyramid at Giza", "Hanging Gardens of Babylon", "Statue of Zeus", "Temple of Artemis", "Mausoleum at Halicarnassus", "Collossus of Rhodes", "Lighthouse of Alexandria"};
		
		System.out.println("Welcome to THE LIST!\n");
		System.out.println("THE LIST! is super-ultra-mega-awesome and includes powerful information.");
		System.out.println("\nPrinted below are the secret names of people on THE LIST!");
		System.out.println("\nEnter a corresponding number to select said person.\n");
		
		for(int i = 0; i< namesOfStudents.length; i++) {
			System.out.println(i+1+". "+namesOfStudents[i]);
		}
		
		Scanner scnr = new Scanner(System.in);
		int input = 0;
		String input2 = "";
		
		
		//END OF FIRST PROMPT
		
		int validNumber = readValidNumber(scnr, input);
		
		
		
		System.out.println("\n"+validNumber+". " +namesOfStudents[validNumber]);
		System.out.println("Would you like to know " +namesOfStudents[validNumber]+ "'s least favorite German City in Saxony?");
		System.out.println("Or");
		System.out.println("Would you like to know " +namesOfStudents[validNumber]+ "'s favorite ancient world wonder?");
		System.out.println("\nPlease type 'Least favorite German City' or 'favorite ancient world wonder.'");
		
		//Poorly named. 
		String readGermanCity = readGermanCity(scnr, "German City");
		
			if(readGermanCity.endsWith("city")) {
				System.out.println("\n"+validNumber+"'s least favorite German City is"+studentsLeastFavoriteGermanCityInSaxony[validNumber]);
				System.out.println("\nWould you like to know their favorite world wonder?");
		
			}else {
				System.out.println("\n"+validNumber+"'s favorite ancient world wonder is"+studentsFavoriteAncientWorldWonder[validNumber]);
				System.out.println("\nWould you like to know their least favorite German City?");
			}
		
		System.out.println("\nWould you like to return to THE LIST!? y/n");
		
		String getUserChoice1 = scnr.next() ;
		if (getUserChoice1.startsWith("y"))
			run = true;
		
		if (getUserChoice1.startsWith("n")) {
			run = false;
		System.out.println("Thank you for using this program.");
	}
	}
}
	
	
	public static String readGermanCity(Scanner scnr, String input) {
		do {
			input = scnr.nextLine();
			boolean valid = input.matches("\"[A-Z]+[a-z]");
			System.out.println(valid ? " " : "You are going to have to re-enter that.");
		}while(!input.matches("\"[A-Z]+[a-z]"));
		return input;
	}
	
	public static int readValidNumber(Scanner scnr, int input) {
	boolean valid = true;
		//Infinite Loop when non int. 
		do {
			try {
			input = scnr.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Sorry that's not a number.");
				System.out.println(ex.getClass().getSimpleName());
				
			
			} catch (ArithmeticException ex) {
				System.out.println("You can't enter zero.");
			}
			
			 if(input > 0 && input < 8) {
				valid = true;
			}else {
				System.out.println("Are you even looking at THE LIST!? Enter a valid number");
				valid = false;
			}
			
		
	}while(!valid);
		return input;
		
}
	}


