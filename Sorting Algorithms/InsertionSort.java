
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 38, 1, 47, 0, 36, 26, 27, 2, 46, 5, 19, 50, 48} ; 
		InsertionSort(arr) ;
		
		for (int i=0;i<arr.length ; i++){
			System.out.print(arr[i]+ " ");
			
		}
	}
	
	public static int[] InsertionSort(int[] array ){
		
		for (int i=1 ; i<array.length ; i++) {
			
			int j = i-1 ;
			int current_element = array[i] ;
			while (j>=0 && array[j] > current_element) {
				array[j+1] = array[j] ;
				j-- ;
			}
			array[j+1] = current_element ;
				
		}
		return array ;
	}

}
