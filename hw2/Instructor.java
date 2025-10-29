// package hw2;



public class Instructor extends Person implements InstructorInterface{

    private int emplid;
    private int yearOfHire;


    public Instructor(){
       super();
    this.emplid = -1;
    this.yearOfHire = 2025;
    }

    public Instructor(String name,int emplid, int age, String ssn,int yearOfHire){

        super(name,age,ssn);
        this.emplid = emplid;
        this.yearOfHire = yearOfHire;

    }


    public int getEmplid(){

        return this.emplid;
    }

    public void setEmplid(int emplid){
        this.emplid = emplid;
    }

    public int getYearOfHire(){


        return this.yearOfHire;
    }

    public void setYearOfHire(int yearOfHire){
        this.yearOfHire = yearOfHire;
    }
    
}
