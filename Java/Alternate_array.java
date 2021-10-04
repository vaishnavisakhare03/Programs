import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    
	    int[] arr = {6, 2, 1, 4, 3, 5, 7};
	    
	    for(int i=0 ; i<arr.length ; i++){
	        System.out.print(arr[i] + " ");
	    }
	    
	    Arrays.sort(arr);
	    System.out.println();
	    
	    for(int i=0 ; i<arr.length ; i++){
	        System.out.print(arr[i] + " ");
	    }
	    
	    System.out.println();
	    	    
	    int i = 0;
	    int j = 6;
	    
	    while(i<j){
	        System.out.print(arr[j] + " ");
	        j--;
	        System.out.print(arr[i] + " ");
	        i++;
	    }
	    if(arr.length%2 != 0){
	        System.out.println(arr[i] + " ");
	    }
	}
}
