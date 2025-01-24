
public class MathRoundDemo {

	public static void main(String[] args) {
		System.out.println("Math.round(1.349765)---->"+
	Math.round(1.349765));
		float num=1.349765f;
		int m=(int)(num*10);
		int r=m/10;

		if(r > 5) {
			m=m+1;
		}
		System.out.println(m);


	}

}
