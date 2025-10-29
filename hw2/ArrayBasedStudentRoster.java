// package hw2;

public class ArrayBasedStudentRoster implements ArrayBasedStudentRosterInterface {
    CourseSection courseSection;
    private int capacity = 0;
    int numberOfStudents=0;
    
    Student [] studentRoster;


    /*
     * 
     * A constructor that only takes course section as a parameter. This course section is associated with this roster.
    */
    public ArrayBasedStudentRoster(CourseSection  coursesections){
        
        this.courseSection = coursesections;
        this.capacity = 10; // or some initial size
        this.studentRoster = new Student[this.capacity];

    }

/*
 * Another constructor that takes course section as a parameter and capacity of the roster. This course section is associated with this roster. ArrayBasedStudentRoster(CourseSection courseSection, int capacity)


 * 
*/
    public ArrayBasedStudentRoster(CourseSection  coursesecctions, int capacity){

        this.courseSection = coursesecctions;

        this.capacity = capacity;
        studentRoster = new Student[this.capacity];

    }

    public CourseSection getCourseSection(){
        return this.courseSection;
    }
    public void setCourseSection(CourseSection courseSection){
        this.courseSection = courseSection;
    }

    public void add(Student student){
        
        if(student == null) return;
        

       for(int i=0; i < studentRoster.length; i++){

        if(studentRoster[i] == null){
            studentRoster[i] = student;

            numberOfStudents++;

            return;
        }
       }

       

        Student[] newRoster = new Student[studentRoster.length * 2];
    for (int i = 0; i < studentRoster.length; i++) {
        newRoster[i] = studentRoster[i];
    }
    newRoster[studentRoster.length] = student; // add the new student
   
    studentRoster = newRoster;
    numberOfStudents++;

       
        

        
    }

    public Student get(int index){


        return studentRoster[index];

    }

    public Student replace(Student student, int index){

        if(student == null || index < 0 || index >= studentRoster.length || studentRoster[index] == null){

            return null;
        }

        Student replaced = studentRoster[index];

        studentRoster[index] = student;


        return replaced;



    }

    public boolean contains(Student student){

        if(isEmpty() || student == null) return false;


        for(Student s : studentRoster ){

            if(student.equals(s)){

                return true;

            }
        }




        return false;

    }

    public void clear(){
        if(studentRoster == null) return;
       
        for(int i =0; i < studentRoster.length; i++){


            studentRoster[i] = null;
        }
        numberOfStudents = 0;
        

        

    }

    public Student getYoungestStudent(){

        if(isEmpty()) return null;

        Student youngest = null;
        for(Student s: studentRoster){


            if(s != null){
                if(youngest == null || s.getAge() < youngest.getAge()){
                    youngest = s;
                }
            }
        }



        return youngest;

    }

    public Student getOldestStudent(){
        if(isEmpty()) return null; // check if the roster is empty
        Student oldest = null; 
        for(Student s: studentRoster){

            if(s != null){
                if(oldest == null || s.getAge() > oldest.getAge()){
                    oldest = s;
                }
            }
        }


        return oldest;

    }

    public int getCurrentNumberOfStudents(){

        


        return this.numberOfStudents;

    }


    public Student remove(){
        if (isEmpty()) return null;
        Student removed = studentRoster[numberOfStudents - 1];
        studentRoster[numberOfStudents - 1] = null;
        numberOfStudents--;
        return removed;

    }

    public Student[] getStudentsRoster(){

        return this.studentRoster;

    }

    public void setStudentsRoster(Student[] studentsRoster){

        this.studentRoster = studentsRoster;

    }

    public boolean isEmpty(){

        
    
        return numberOfStudents == 0;
    }

    public Student remove(int index){
        
        if (isEmpty() || index < 0 || index >= numberOfStudents) return null;

        Student removed = studentRoster[index];
    
        if (index != numberOfStudents - 1) {
            studentRoster[index] = studentRoster[numberOfStudents - 1];
        }
        studentRoster[numberOfStudents - 1] = null;
        
        numberOfStudents--;
       
    
        return removed;

        

    }

    public boolean isFull(){

        return getCurrentNumberOfStudents() == studentRoster.length;

    }






    
}
