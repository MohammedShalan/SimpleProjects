
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] array = {9,0,1,8,5,7,3,2} ;
		System.out.println(Divid(array));
		int[] arr = Divid(array).clone() ;
		*/
		int[] unsorted =  {5,1,4,2,8 , 1 , 18 ,9,6,15,12};
		
		Divid(unsorted) ;
		
		for (int i=0;i<unsorted.length ; i++){
			System.out.print(unsorted[i]+ " ");
			
		}
		
	}
	
	public static int[] Divid(int[] array){
		int len = array.length ; 
		if (len > 1 ){
			int first_array = array.length / 2 ;
			int second_array = array.length - first_array ;
			int[] First = new int[first_array]; 
			int[] Second = new int[second_array] ; 
			
			for (int i : First){
				First[i] = array[i] ;
			}
			for (int i : Second){
				Second[i] = array[i+ first_array] ;
			} 
			
			
			Divid(First) ;
			Divid(Second) ;
			merge(First,Second,array) ; 
		}
		return array ;
	}
	
	public static int[] merge(int[] arr1,int[] arr2,int[] original_array){
		int L = 0 ;
		int R = 0 ;
		int O = 0 ;
		
		while (L <arr1.length && R <arr2.length) {
			if (arr1[L] <= arr2[R]) {
				original_array[O] = arr1[L] ; 
				L++ ; 
				O++ ; 
			}else {
				original_array[O] = arr1[R] ; 
				R++ ; 
				O++ ; 
			}
			
		}
		
		return original_array ;
	}

}
