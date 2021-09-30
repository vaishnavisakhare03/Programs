public class Main
{
	public static void main(String[] args) {
	    
	    int[] arr = {15, 18, 2, 3, 6, 12};
	    int min = 1000;
	    int min_index=0;
	    int i=0;
	    for(i=0 ; i<arr.length ; i++){
	        if(min > arr[i]){
	            min = arr[i];
	            min_index = i;
	        }
	    }
	    System.out.println(min_index);
    }
}
