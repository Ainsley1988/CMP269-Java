// package hw2;



public class Student extends Person implements StudentInterface {
    private int emplid;
    private String yearOfStudy;
    private CourseSection[] courseSections = null;


    public Student(int emplid,String ssn,String name,int age, String yearOfStudy,CourseSection[] courseSections){
        super(name,age,ssn);

        this.emplid = emplid;
        this.yearOfStudy = yearOfStudy;
        this.courseSections = courseSections;


    }

    public int getEmplid(){

        return this.emplid;
    }
    public void setEmplid(int emplid){
        this.emplid = emplid;
    }

    public String getYearOfStudy(){

        return this.yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }

    public CourseSection[] getCourseSections(){

        return this.courseSections;
    }

    public void setCourseSections(CourseSection[] courseSections){

        this.courseSections = courseSections;
    }



    
    
}
