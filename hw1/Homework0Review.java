// package hw1;



import java.util.Random;
public class Homework0Review {
   

    public static double getRectangleArea(double length, double width) {

        if (length < 0 || width < 0) {
            
            return -1.0;
            
        } else {
            return length * width;
            
        }
    }
 //question 2
    public static int sum(int n){
       /**
 * Calculates the sum of the first n natural numbers.
 *
 * Pre-Condition: Takes a positive integer n.
 * Post-Condition: Returns the sum of the first n natural numbers as a double.
 *                 Returns 0.0 if n is zero or negative.
 */

      
        if(n > 0){
            return  n*(n+1)/2; //  

        } 
        else{
            

            return  0;
        }
    }

    // question 3

    public static  double getCircleArea(double radius){
        /**
 * Calculates the area of a circle.
 *
 * Pre-Condition: Takes a positive double radius.
 * Post-Condition: Returns the area of the circle as a double.
 *                 Returns 0.0 if the radius is zero or negative.
 */
       
        if(radius > 0){

            return  Math.PI * Math.pow(radius,2);

        }else{
            return 0.0;
        }



       
    }
//question 4 
   public static String getBinaryFromDecimal(int n) {
    if (n < 0) {
        return null; // correct binary representation
    } else {
        return Integer.toBinaryString(n); // return null for zero or negative numbers
    }
}

    //qustion 5
    public static int linearSearch(int [] n,int k){
        /**
 * Performs a linear search for a key in an integer array.
 *
 * Pre-Condition: Takes an integer array and an integer key.
 * Post-Condition: Returns the index of the first occurrence of key.
 *                 Returns -1 if the key is not found or if the array is null.
 */

// if the array is uninitialized 
        if (n == null){
            return -1;
        }
  //search through the array  until k is found 
        for(int i=0; i < n.length; i++){

            if(k == n[i]){
                return i;
            }


        }
        return -1;




    }
//question  6
    public static void squareNums(int [] n){
        /**
 * Squares each element of the array in place.
 *
 * Pre-Condition: Takes an integer array.
 * Post-Condition: Modifies the original array so that each element
 *                 becomes its square (value * value).
 */

        if(n == null){
            return;
        }
        for(int i=0; i < n.length;i++){
            n[i] = n[i] * n[i];
        }

    }


    //question 7
    public static int sum(int [] n){
/**
 * Calculates the sum of all integers in an array.
 *
 * Pre-Condition: Takes an integer array.
 * Post-Condition: Returns the sum of the elements in the array.
 *                 Returns -1 if the array is null.
 */

        
// if the array is uninitialized 
if(n == null){
    return -1; 
}

int total=0; // initized and assigned to total to 0

        for(int i=0; i < n.length;i++){// loop through the array
            total += n[i];

        }

        return total;

    }
    //question 8
    public static int factorial(int n){
        /**
 * Computes the factorial of a number using recursion.
 *
 * Pre-Condition: Takes an integer n.
 * Post-Condition: Returns n! (n factorial) as an int.
 *                 Returns -1 if n is negative.
 */

         if(n < 0){

            return -1; // invalid input 

        }
        else if(n == 0 || n == 1){

            return 1;
 
        }  else{

            return n * factorial(n-1);// recursive case 

        }

        
        

    }

//question 9
    public void shuffle(String [] arr,int k){
        if(arr == null || k < 0 || k >= arr.length){
            return ; // inlvaid index return the orginal
        }

// loop through the array and shift each String to the left and last should null
        for(int i = k; i < arr.length-1;i ++){
            arr[i] = arr[i + 1];
        }
     // set the last value in the string to null
        arr[arr.length -1] = null;


        // shuffle the new array
        Random rand = new Random();
        int validElementCount = arr.length -1;

        for(int i = validElementCount - 1; i  > 0; i--){ // loop through the array
            int j = rand.nextInt( i + 1);
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

       





    }



    public static void main(String [] args){
        // Homework0Review hw = new Homework0Review();

       



        int[] arr = {1, 2, 3};

        int total = sum(arr);

        System.out.println("The area is " + total);



        System.out.println();


        //Testing  question 6
int[] numbers = {1,2,3,4,5};
        System.out.println("Before the squaring:");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();

        // call the squareNums method

        squareNums(numbers);


        //print the modified values
        System.out.println("After squaring");
        for(int num: numbers){
            System.out.print(num +" ");
        }

        System.out.println();




// //Testing question 9
// System.out.println();

// String[] Stringarr = {"A", "B", "C", "D", "E"};

//         System.out.println("Before shuffle:");
//         for (String s : Stringarr) System.out.print(s + " ");
//         System.out.println();

//         hw.shuffle(Stringarr, 2); // remove "C" at index 2 and shuffle

//         System.out.println("After shuffle:");
//         for (String s : Stringarr) System.out.print(s + " ");
//         System.out.println();







    }
    
}
