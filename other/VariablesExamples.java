package other;
class VariableExamples{
 
    /* Class notes 08/28/2025 
    
    
    if statements
    an  if satatement executes  the if body if the condition is true. otherwise it skips the body

    syntax
    if([condition]) <-- boolean expression{
    [if body]
    }
    a boolean expression is an expression that evalutae to a true or false

    semantics
    (1) Evaluate the  [condition]
    (2) if the [condition] is true you execute the [if body]
    otherwise it skips over the  [if body]


    Branches(Conditional Statement )
    (1) if statements
    (2) if-else statements
    (3) if -else statements
    (4) switch statement 
     * 
     * 
     * 
    */
    public static void main(String[] args){


        int count;
        count = 11;
        System.out.println(count);

        // if statement 

        if(count == 10){ 
            System.out.println("Count is ten");
        }

        // if else statement 

        if(count > 10){
            System.out.println("Count is greatger than 10");
        } 
        else{
            System.out.println("Count is less than or equal to ten");
        }

        // switch statement 

        switch(count){
            case 1:
            //body of case 1 
            System.out.println("Count is one");
            break;
            case 2:
            // body of case 2
            System.out.println("count is two");
            break;

            default:
            System.out.println("Count is not one or two");
            


        }


        // examples of when to use a switch 
        int score = 10;

        switch(score){
            case 1:
            System.out.print("step 1");
            break;
        }



        for(int m = 1; m <= 5;m++){
            System.out.println(m);

        }





    }



}

/* More class notes 
Tracing  the program in memory 
--------------------------------------------
Memory
--count
[# 21]
int


screen
-----------
21
------------------------------------------------------

More notes:

if else  if statements.
-> A Multiway decision Statement 

syntax
----------

if([condition 1]){
[Body 1]

}
 else if([Condition 2]){
 [body 2]
 }
 else if ([Condition 3]){
 [body 3]
 
 }
 else{

 [ else body]
 
 
 }


 Semantics
 ------------------
 (1) Evaluate [condition 1] if true
 you execute [body 1]. if [condition]
 if false move to  step 2 

 (2) Evalute [Condition 2] if it is true execute [body 2],
 if [condition 3] is false move to step 3

 (3) Evalute [Condition 3] if  it is true execute [Body 3],
  if [condition 3] is false move to next step
  (4) if all condition are small execute the body of the else statement 
 * 
 * 
 * Switch case statement
 * ----------------------------------
 * 
 * switch( [expression]){
 * 
 * case [value 1]:
 * [body 1]
 * 
 * break; 
 * 
 * case [value 2]:
 * [body 2]
 * break;
 * 
 * case [value 3]:
 * 
 * [body 3]
 * break;
 * default:
 * [default body]
 * 
 * 
 * }
 * 
 * More notes 
 * 
 * Loops
 * -------------------------------
 * 
 * (1) while loop
 * (2) for loop
 * (3) do -while loop
 * 
 * while loop
 * -----------------
 * A while loop is is used to execute a loop body  repeatedly provide a loop condition is true 
 * when the loop condition becomes false, the loop skips the body and continues execution passs the loop body
 * 
 * 
 * 
 * syntax
 * ---------
 * 
 * while([Condition]){
 * 
 * [loop body]
 * 
 * 
 * }
 * 
 * Semantics
 * ----------------
 * (1) Evalute the [condition]
 * 
 * (2) if the [contiion] is true 
 * execute the [loop body] if
 * the [condition] is false skip the loop body and continue executaion after the loop
 * 


 for loop
 --------------------------------

 for([initialization]; [condition]; update){

 loop body
 
 
 }


 Semantics
 ------------------
 (1) execute the  [initialization]
 (2) Evalute the [condition] if the condition is  true  you fo to the step 3  if the condition is false you  move to step 6
 (3) Execute the loop body and go to the step 4
 (4) Execute the update and go to the step 5 after 
 (5) go back to the step 2
 (6) Exit the loop
 * 
 * 
 * 
 * 
*/






