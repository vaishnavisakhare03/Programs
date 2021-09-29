package Basic;
public class QuickSort
{
	public static void main(String[] args) {
	    System.out.println("Given Array :");
	    
        int[] arr = {1, 20, 2, 10};
        
        int n = arr.length;
        
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
        
        Qsort(arr , 0 , n - 1);
        
        System.out.println("After Sorting");
        
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    static void Qsort(int[] array ,int low ,int high){
        int j;
        if(low < high){
            j = partition(array , low , high);
            System.out.println(j + " j "  );

            Qsort(array, low , j - 1);
            Qsort(array , j+1 , high);
        }
    }

    static int partition(int[] array ,int low ,int high){
        System.out.println(low + " low " +high + " high "  );

        int temp, key, k, j;
        key = array[low];
        k = low + 1;
        j = high;

        while(k <= j){

            while(k<4 && array[k] <= key){
                System.out.println(k + " k " +j + " j "  );

                k++;
            }while(array[j]>key){
                j--;
            }
            if(k<j){
                temp = array[k];
                array[k] = array [j];
                array[j] = temp;
            }

        }
        key = array[low];
        array[low] = array[j];
        array[j] = key;
        return j;
    }
}
