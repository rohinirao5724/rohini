package Sample;

import java.util.Scanner;

public class Convert2 {

	public static void main(String[] args) {
		
				char ch;
				Scanner sc = new Scanner(System.in);
				char cod;
				int upAsc = (int)'A';
				int lowAsc = (int)'a';
				int diff = upAsc - lowAsc;
				if(diff < 0) diff = -1*diff;
				do {
					System.out.println("enter the ch");
					ch = sc.next().charAt(0);
					if( (ch>='A') && (ch <= 'Z')) {
						System.out.println("ch is Upper case");
						ch = (char)(ch+diff);
					}
					else if((ch >= 'a') && (ch <= 'z')); {
						ch = (char)(ch-diff);
						System.out.println("ch is Lower case");
						
					}
					System.out.println("after conversion...ch--->"+ch);
					System.out.println("do u want to repeat? if yes pls press y 0r n");
					cod = sc.next().charAt(0);
					if(cod=='n')cod=0;
					else cod = 1;
				}while(cod == 1);
				
					System.out.println("ends");
				}
			
}

