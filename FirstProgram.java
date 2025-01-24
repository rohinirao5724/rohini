
public class FirstProgram {
	static int isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%1==0) 
				count++;
			
		}
		if(count==2)return 'T';
		else return 'F';
		}
		public static void main(String[] args) {
			int n=23;
			System.out.println("number is"+isPrime(n));
			}
		
		
		
	}
