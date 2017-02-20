import java.util.Scanner;

public class Fast_exp {

	public Fast_exp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two digit a^b.");
		
		System.out.println("a = ");
		int a = new Scanner(System.in).nextInt();
		System.out.println("b = ");
		int b = new Scanner(System.in).nextInt();
		System.out.println(power(a,b));
		
	}
	public static int power(int base,int power){
		if (power <=1){
			return base;}
		else{
			return ( base*power(base,power-1) );
		}
	}

}
