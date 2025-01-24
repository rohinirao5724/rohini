import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a char");
		char input= sc.next().charAt(0);
		if(Character.isAlphabetic(input)) {
			System.out.println(input+" is an Alphabet");
		}
		else if(Character.isDigit(input)) {
			System.out.println(input+"is an Digit");
		}
		else {
			System.out.println(input+"is an Special character");
		}
	}
	
}		
