
public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args) {
		//Using Recursion 
		System.out.println(Factorial_R(9));
		
		//Using LOOP
		System.out.println(Factorial_L(9));

	}
	public static int Factorial_R(int num){
		if (num < 2 ){
			return 1 ;
		}else {
			
			return ( num * Factorial_R(num-1) ); 
		}
		
		
	}
	public static int Factorial_L(int num){
		int NUM = 1;
		for(int i=1; i<=num ; i++){
			NUM *= i;
		}
		return NUM;		
		
	}
}
