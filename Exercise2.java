
public class Exercise2 {

	public static void main(String[] args) {
		
		int num = 8885,max=0,min=9;
		//%
		while(num!=0) {
		int r = num%10;//7
		if(r>max)max=r;
		if(r<min)min=r;
		
		num = num /10;

		System.out.println("max--->"+max);
		System.out.println("min--->"+min);
		
	}
}
}