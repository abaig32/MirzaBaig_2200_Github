/*****
 * 
 * @author Mirza Baig 
 * Date: 11/16/2022 [W]
 * 		 11/18/2022 [F] Modify solution from last Monday
 *
 */


import java.util.Scanner;

public class Exercise06_04v2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		reverse(number);
		
		
		input.close();

	}
	
	public static void reverse(int n) {
		if (n == 0) {
			
			System.out.print(n);
		}
		
		if (n < 0) {
			
			System.out.print("-");
			n = n * -1;
		
		}
		
		while( n != 0) {
			
			System.out.print(n % 10);
			n = n / 10; 
			
		}
		
		
	}

}
