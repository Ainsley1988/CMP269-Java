/**
 * This StudentInterface is implemented by the Student.java class.
 * @author Steven Fulakeza
 *
 */
public interface StudentInterface {
	/**
	 * Retrieves the employee ID of the person.
	 *
	 * @return the employee ID as an integer.
	 *         The employee ID is a unique identifier assigned to the person.
	 */
	public int getEmplid();

	/**
	 * Sets the employee ID for the person.
	 *
	 * @param emplid the employee ID to be assigned to the person.
	 *        The employee ID should be a positive integer representing the unique identifier for the person.
	 * @throws IllegalArgumentException if the provided employee ID is less than or equal to 0.
	 */
	public void setEmplid(int emplid);

	/**
	 * Retrieves the year of study of the person (for example, in an academic context, this could represent the person's current year in a program).
	 *
	 * @return the year of study as a string, e.g., "Freshman", "Sophomore", "Junior", "Senior".
	 *         The value returned should reflect the person's academic status or progression.
	 */
	public String getYearOfStudy();

	/**
	 * Sets the year of study for the person.
	 *
	 * @param yearOfStudy the year of study to be assigned to the person.
	 *        This should be a string representing the person's academic year (e.g., "Freshman", "Sophomore").
	 * @throws IllegalArgumentException if the provided yearOfStudy is null or an empty string.
	 */
	public void setYearOfStudy(String yearOfStudy);

	/**
	 * Retrieves the course sections that the person is enrolled in.
	 *
	 * @return an array of {@link CourseSection} objects representing the course sections.
	 *         Each element in the array corresponds to a course section the person is currently enrolled in.
	 */
	public CourseSection[] getCourseSections();

	/**
	 * Sets the course sections for the person.
	 *
	 * @param courseSections an array of {@link CourseSection} objects representing the course sections to be assigned.
	 *        Each element in the array corresponds to a specific course section.
	 * @throws IllegalArgumentException if the provided array is null or contains any null elements.
	 */
	public void setCourseSections(CourseSection[] courseSections);

	/**
	 * Compares this person to the specified object for equality.
	 * The comparison is based on the relevant fields (such as employee ID, name, etc.) that define the uniqueness of the person.
	 *
	 * @param obj the object to be compared with this person.
	 * @return {@code true} if the specified object is equal to this person, {@code false} otherwise.
	 * @throws NullPointerException if the object being compared is null.
	 */
	public boolean equals(Object obj);

}
