
public class ques1 {
    
    public static int noofseven(int matrix[][]){
         
        
      
        int count = 0;
        int key = 7;
     

    
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <  matrix[0].length; j++) {
                if(matrix[i][j] == key){
                System.out.println("7 found at position: (" + i + ", " + j + ")");
                count++;

            }
              
            }
        }
        if(count >=2){
             return count;

             
           
        }
        return -1;
        
    }
    public static void main(String[] args) {
          int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 7, 16}
        };
        
       int result = noofseven(matrix);
      System.out.println("Number of 7's present in matrix is: " + result);

    }
}
