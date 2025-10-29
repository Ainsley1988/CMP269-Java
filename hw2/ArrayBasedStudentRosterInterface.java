
public interface ArrayBasedStudentRosterInterface {

	/**
	 * This method is used to set a course section associated with this roster.
	 */
	public void setCourseSection(CourseSection courseSection);

	/**
	 * This method is used to get the course section associated with this roster.
	 * @return
	 */
	public CourseSection getCourseSection();

	/**
	 * This method returns the total number of students that are currently stored in the studentsRoster array.
	 * <br>Notice that this is just the value of numberOfStudents
	 * @return
	 */
	public int getCurrentNumberOfStudents();

	/**
	 * This method returns true if the studentsRoster array is full with students.
	 * @return
	 */
	public boolean isFull();

	/**
	 * This method returns true if the studentsRoster array has no students.
	 * @return
	 */
	public boolean isEmpty();

	/**
	 * This method is used to add a new student to the studentsRoster array. Once a new student has been added the value of numberOfStudents is supposed to go up.
	 *
	 * <br>
	 * You cannot add a null parameter.
	 * If the roster is full, resize it.
	 * Note all that a student can be added to a roster if they are taking this course for this roster with that instructor for that roster.
	 * @param student
	 * @return
	 */
	public void add(Student student);

	/**
	 * This method is used to remove and return a student that is at the back (end) of the studentsRoster array. This means we are removing the most recently added student first. Notice that when a student is removed, the value of numberOfStudents is supposed to decrease since we have removed one student from the array.
	 * <br>If the studentsRoster is empty, this means there is no student to remove. The method just returns a null.

	 * @return
	 */
	public Student remove();


	/**
	 * This method is used to remove and return a student that is at the specified index studentsRoster array. The value of numberOfStudents is supposed to decrease since we have removed one student from the array. Once we have removed an element in the array, we need to avoid having a gap in the array.
	 * <br>We avoid the gap by moving the element that is at the end of the array to the index where we have removed the other element.
	 * @param index
	 * @return
	 */
	public Student remove(int index);


	/**
	 * This method returns a student at the specified index.
	 * If the index is not valid, the method returns null.
	 * The method also returns null if the roster is empty.
	 * @param index
	 * @return
	 */
	public Student get(int index);

	/**
	 * Replaces the student at the specified index in the roster with the given student.
	 *
	 * This method updates the student at the specified index of the array-based roster
	 * with the provided student object. If the index is valid (within the bounds of the array),
	 * the student at that index is replaced with the new student. If the index is invalid, 
	 * appropriate handling (such as throwing an exception or returning null) should be considered 
	 * depending on the implementation.
	 *
	 * @param student The student object that will replace the existing student at the specified index.
	 * @param index The index at which the student should be replaced.
	 * @return The student that was replaced, or {@code null} if the index was out of bounds.
	 * 
	 * 
	 */
	public Student replace(Student student, int index);
	
	/**
	 * Removes all students in the studentsRoster
	 */
	public void clear();


	/**
	 * This method returns true if the specified student is in the studentRoster.
	 *
	 * Otherwise, this returns false.
	 * The method also return false if the roster is empty or if the parameter students is null.
	 * @param student
	 * @return
	 */
	public boolean contains(Student student);



	/**
	 * This method returns an array representing students that are in the roster.
	 * @return the studentsRoster - an array representing students
	 */
	public Student[] getStudentsRoster();


	/**
	 * @param studentsRoster the studentsRoster to set
	 */
	public void setStudentsRoster(Student[] studentsRoster);


	/**
	 * This method is used to get a student with the highest gpa.
	 * If the roster is empty, the method return a null
	 * If there are multiple students with highest GPAs, only return the first student with the highest GPA in the array.

	 * @return
	 */
	//public Student getStudentWithHighestGPA();


	/**
	 * This method is used to get a student with the lowest gpa.
	 * If the roster is empty, the method returns a null;
	 * If there are multiple students with lowest GPAs, only return the first student with the lowest GPA in the array
	 *
	 * @return
	 */
	//public Student getStudentWithLowestGPA();


	/**
	 * This method is used to get the oldest student in the roster.
	 * If the roster is empty, the method returns null.
	 * If there are multiple oldest students, only return the first oldest student in the array.
	 * @return
	 */
	public Student getOldestStudent();

	/**
	 * This method is used to get the youngest student in the roster.
	 * If the roster is empty, the method returns null.
	 * If there are multiple youngest students, only return the first youngest student in the array.
	 * @return
	 */
	public Student getYoungestStudent();
}
