package Sample;

public class DivBy11And5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		//%/
		
		int num = 10;
		if((num % 5 == 0)&&(num % 11 == 0)) {
		System.out.println("not div by 5 and 11");
		}
		else {
			System.out.println("not");
		}


	}

}
