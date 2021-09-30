//put elements in array after riro put elements in arr after lero
public class Main
{
	public static void main(String[] args) {
	    
	    int[] arr = {1, 2, 3, 4, 5};
	    int[] array = new int[arr.length];
	    int Ri_Ro = 1;
	    int Le_Ro = 3;
	    int i=0;
	    for(i=0 ; i<arr.length ; i++){
	        if(i+Ri_Ro < arr.length){
	            array[i+Ri_Ro]=arr[i];
	        }else{
	            array[i+Ri_Ro - arr.length]=arr[i];
	        }
	    }
	    for(i=0 ; i<array.length ; i++){
	        if(i-Le_Ro >= 0){
	            arr[i-Le_Ro]=array[i];
	        }else{
	            arr[i-Le_Ro + arr.length]=array[i];
	        }
	    }
	    for(i=0 ; i<arr.length ; i++){
	        System.out.print(arr[i] + " ");
	    }
    }
}
