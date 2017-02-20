
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 44, 38, 5, 47, 15, 36,6,8,2,40} ; 
		SelectionSort(array) ;
		
		for (int i=0;i<array.length ; i++){
			System.out.print(array[i]+ " ");
			
		}
	}
	
	public static int[] SelectionSort(int[] array){
		
		for (int i=0 ; i< array.length ; i++) {
			int num = 0;
			int CurrentMin = array[i] ;
			for (int j=i+1 ; j<array.length ; j++) {
				if (array[j] < CurrentMin){
					CurrentMin = array[j] ;
					num = j ;
				}
					
			}
			if (CurrentMin < array[i]) {
				
				int temp = array[i] ; 
				array[i] = array[num] ; 
				array[num] = temp ;
			}
				
		}
		
		return array ;
	}
	

}
