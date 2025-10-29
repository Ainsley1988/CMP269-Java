package other;
/*
 * CMP
 * 
 * 09/04/2025
 * 
 * 
 * 
*/



public class ArrayExamples {




    public static int sumScores(int [] scores){

        int total = 0;

        for(int i =0; i < scores.length; i++){
            total = total + scores[i];
        }




        return total;


    }

    public static void doubleScores(int [] scores){
        for(int i =0; i < scores.length; i++){
            scores[i] = 2* scores[i];
        }

    }

    public static  void main(String[] args){

     //Declaring  an array of in of size 5
        int [] scores = new int[5];
// store some values into a basic array
scores[0]= 10;
scores[1] = 15;
scores[2] = 30;

        scores[3] = 90;
        scores[4] = 80;

System.out.println("Below are score before change");
        for(int i = 0; i < scores.length;i++){
            System.out.println(scores[i]);

        }
System.out.println("Below are scores after change");

for(int i = 0; i < scores.length;i++){
    System.out.println(scores[i]);

}



    } 
    
}

