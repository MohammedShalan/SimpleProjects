
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsorted =  {5,1,4,2,8 , 1 , 18 ,9,6,15,12};
		
		bubble(unsorted) ;
		
		for (int i=0;i<unsorted.length ; i++){
			System.out.print(unsorted[i]+ " ");
			
		}
		
	}
	
	public static int[] bubble(int[] array){
		int sorted[] = array ; 
		for (int i=0 ;i < array.length ; i++){
				for (int j=0 ; j< array.length -1 ; j++ ){
					if(sorted[j] > sorted[j+1]){
						int temp = sorted[j] ; 
						temp = sorted[j] ; 
						sorted[j] = sorted[j+1] ; 
						sorted[j+1] = temp ;
					}
				}
		}
		return sorted ;
	}
	

}
