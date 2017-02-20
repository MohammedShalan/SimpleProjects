
public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
		System.out.println(Fib(i));
		}

	}
	
	public static int Fib(int num){
		if (num <2 ){
			return num;
		
		}else{
			return  ( Fib(num-1) + Fib(num-2) ) ;
			
		} 
		
	}

}
