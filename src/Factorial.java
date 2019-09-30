

public class Factorial {

   private int array[] = {17,14,26,37,83};

   // Recursive definition of method factorial
   public static int factorial( int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result = n * factorial(n-1); 
         return result;
      }
   }

   public int smallest(){
      if (array.length == 0)
         return 0;
      else
         return smallest(array.length-1);
   }

   private int smallest(int index){

      int smallest;
      if (index == 0){
         return array[index];
      }
      else{
         smallest = smallest(index-1);
      }
      if (array[index] < smallest)
         smallest = array[index];
      return smallest;
   }


}

