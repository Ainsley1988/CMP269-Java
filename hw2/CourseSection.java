// package hw2;

public class CourseSection {


    private static int nextId =0;
    private int id;
    private boolean isSemesterFinished;
    private Instructor instructor;
    private Course course;


    public CourseSection(){

        this.id = nextId++;
        this.course = null;
        this.instructor = null;
        this.isSemesterFinished = false;

    }

    public CourseSection(Course course){

        this.id = nextId++;
        this.course = course;
        this.instructor = null;
        this.isSemesterFinished = false;

    }

    public CourseSection(Course course,Instructor instructor){
        this.id = nextId++;
        this.course = course;
        this.instructor = instructor;
        this.isSemesterFinished = false;
    }

    public CourseSection(Course course, Instructor instructor, boolean isSemesterFinished){
        this.id = nextId++;
        this.course = course;
        this.instructor = instructor;
        this.isSemesterFinished = isSemesterFinished;
    }


    public Course getCourse(){

        return this.course;
    }

    public void setCourse(Course course){

        this.course = course;

    }

    public void setIsSemesterFinished(boolean isSemesterFinished){
        this.isSemesterFinished = isSemesterFinished;
    }

    public boolean isSemesterFinished(){
        return this.isSemesterFinished;
    }


    public int getId(){

        return this.id;
    }

    public void setInstructor(Instructor instructor){

        this.instructor = instructor;
    }

    public Instructor getInstructor(){

        return this.instructor;
    }



    
}
