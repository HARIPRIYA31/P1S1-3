

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER DIGITS TO REVERSE");
		int digit=sc.nextInt();
		int rem=0,c=0;
		int arr[]=new int[10];
		while(digit>0)
		{
			rem=digit%10;
			arr[c++]=rem;
			digit=digit/10;
		}
		System.out.println("REVERSED DIGIT:");
		for(int i=0;i<c;i++)
			System.out.print(arr[i]);
		sc.close();

	}

}
