import java.util.Scanner;
import java.util.TimeZone;
import java.util.Timer;

public class HappyNumbers {

	public HappyNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter a number from 0 to 999 :");
		int num = new Scanner(System.in).nextInt();
		checkNum(num);

	}
	public static boolean checkNum(int num){
		int sum = num ;
		int counter =0;
		while (sum != 1){
				if (sum < 9)
					sum *= sum;
				if(sum <100){
					int num1 = sum % 10 ;
					int num2 = sum / 10 ;
					sum = (int) (Math.pow(num2, 2) + Math.pow(num1, 2)) ; 
				}
				if(sum >100){
					int num1 = sum / 100 ;
					int num2 = (sum-num1*100) / 10 ;
					int num3 = (sum-num1*100) % 10 ;
					sum = (int) ( Math.pow(num2, 2) + Math.pow(num1, 2) + (Math.pow(num3, 2)) ) ; 
				}
				counter++;
				if (counter==100)
					break;
				
			
		}
		if (sum ==1 ){
			System.out.println("Happy number");
			return true ;}
		else{
			System.out.println("Not a happy number");
			return false;
			
		}
	}

}
