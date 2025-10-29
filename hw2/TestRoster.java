

public class TestRoster {


    public static void main(String[] args) {
        Course cmp = new Course();
        CourseSection cs = new CourseSection(cmp); // dummy course section
        CourseSection mp = new CourseSection(cmp);
        CourseSection[] cp ={cs,mp};
        ArrayBasedStudentRoster roster = new ArrayBasedStudentRoster(cs, 3);

        Student s1 = new Student(2024,"137-19-1145","Alice",20, "2028",cp);
        Student s2 = new Student(2024,"137-19-1145","Bob",20, "2028",cp);
        Student s3 = new Student(2024,"137-19-1145","Charlie",20, "2028",cp);
        Student s4 = new Student(2024,"137-19-1145","Diana",20, "2028",cp);

        // Test add()
        roster.add(s1);
        roster.add(s2);
        roster.add(s3);
        

        System.out.println("Number of students (expect 3): " + roster.getCurrentNumberOfStudents());

        // Test remove()
        Student removed = roster.remove();
        System.out.println("Removed student (expect Charlie): " + removed.getName());
        System.out.println("Number of students (expect 2): " + roster.getCurrentNumberOfStudents());

        // Test remove(index)
        roster.add(s4); // now roster = Alice, Bob, Diana
        removed = roster.remove(0); // remove Alice, last student Diana should move to index 0
        System.out.println("Removed student (expect Alice): " + removed.getName());
        System.out.println("Student at index 0 (expect Diana): " + roster.get(0).getName());
        System.out.println("Number of students (expect 2): " + roster.getCurrentNumberOfStudents());

        // Test clear()
        roster.clear();
        System.out.println("Number of students after clear (expect 0): " + roster.getCurrentNumberOfStudents());
        System.out.println("Is empty (expect true): " + roster.isEmpty());
    }
}
