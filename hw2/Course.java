// package hw2;

public class Course implements  CourseInterface{
    private String name;
    private String code;
    private int credits;

    public Course(){
        this.name = "UN";

        this.code = "UN";
        this.credits = 0;
    }

    public Course(String code,String name, int credits){
       this.name = name;
       this.credits = credits;
       this.code = code ;

    }


    public String getName(){

        return this.name;
    }

    public void setName(String name){

        this.name = name;
    }

    public int getCredits(){

        return this.credits;
    }
    public void setCredits(int credits){
        
        
        this.credits = credits;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        
        return this.code;
    }



    
}
