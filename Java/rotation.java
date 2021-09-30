public class Main
{
	public static void main(String[] args) {
	    
	    int[] arr = {1, 2, 3, 4, 5};
	    int[] array = new int[arr.length];
	    int rotation = 3;
	    System.out.println("rotation " + rotation);
	    int i=0;
	    for(i=0 ; i<arr.length ; i++){
	        if(i-rotation >= 0){
	            array[i-rotation]=arr[i];
	        }else{
	            array[i-rotation + arr.length]=arr[i];
	        }
	    }for(i=0 ; i<arr.length ; i++){
	        System.out.print(array[i] + " ");
	    }
    }
}
