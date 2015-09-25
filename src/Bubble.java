
public class Bubble {

	public static void main(String[] args) {
		
		int[] arr = {24,65,1,8,4};
		
		printArray(bubble(arr));
	}
	
	public static void printArray(int[] arr){
		
		for(Integer i: arr){
			
			System.out.print(i+ " ");
		}
	}

	public static int[] bubble(int[] arr){
		
		for(int i = 1; i < arr.length; i ++){
			
			for(int j = 0; j < arr.length - i; j++){
				
				if(arr[j] > arr[j + 1]){
					
					int temp = arr[j];
					
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;
	}
}
