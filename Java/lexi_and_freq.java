public class Main {  
   public static void main(String[] args) {  
       
        String[] str = {"a","b","c","a"};  
        int n = 4;  
        int count = 1;
        
        for(int i = 0; i < n; i++) {  
        System.out.print(str[i] + " ");  
        }  
      
        for(int i = 0; i < n-1; ++i) {  
            for (int j = i + 1; j < n; ++j) {  
                if (str[i].compareTo(str[j]) > 0) {  
                    String temp = str[i];  
                    str[i] = str[j];  
                    str[j] = temp;  
                }
            }  
        }  
        System.out.println();
        for(int i = 0; i < n; i++) {  
            System.out.print(str[i] + " ");  
        }
        int i = 0;
        System.out.println();
        
        for( i = 0; i < n ; i++) { 
            count = 1;
            for( int j = i + 1; j < n  ; j++) {
                if(str[i] == str[j]){
                    count += 1;
                    str[j] = "0";
                }
            }
            
            if(count != 0 && str[i] != "0"){
                System.out.println(str[i] + " " + count);
            }
        }
    }  
} 
