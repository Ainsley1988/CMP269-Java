/**
 *
 * This interface will be implemented by the Course.java class.
 *
 * @author Steven Fulakeza
 *
 */
public interface CourseInterface {

	/**
	 * Retrieves the code (identifier) of the course.
	 * <p>
	 * This method returns the unique code associated with the course,
	 * which is typically used to identify and distinguish courses within
	 * a catalog or schedule. The course code is often alphanumeric and
	 * serves as a shorthand representation of the course.
	 * </p>
	 *
	 * @return the code of the course, typically used as a unique identifier.
	 */
	public String getCode();

	/**
	 * Sets the code (identifier) for the course.
	 * <p>
	 * This method assigns a unique code to the course, which is typically used
	 * to identify and distinguish courses within a catalog or schedule. The
	 * course code is often alphanumeric and serves as a shorthand reference
	 * for the course.
	 * </p>
	 *
	 * @param code the new code to be assigned to the course, typically used
	 *             as a unique identifier.
	 * @throws IllegalArgumentException if the provided code is null or
	 *                                  empty.
	 */
	public void setCode(String code);

	/**
	 * Retrieves the name of the course.
	 * <p>
	 * This method returns the name of the course as a string. The name of the
	 * course is typically used to identify the course and is often displayed
	 * in the course catalog or schedule.
	 * </p>
	 *
	 * @return the name of the course.
	 */
	public String getName();

	/**
	 * Sets the name of the course.
	 * <p>
	 * This method allows you to update or assign a new name to the course.
	 * The name of the course is an important identifier and should be
	 * descriptive of the course content.
	 * </p>
	 *
	 * @param name the new name to be assigned to the course.
	 * @throws IllegalArgumentException if the provided name is null or empty.
	 */
	public void setName(String name);


	/**
	 * Retrieves the number of credits assigned to the course.
	 * <p>
	 * This method returns the number of credits associated with the course.
	 * The number of credits generally represents the workload or value of the
	 * course in terms of time and effort required to complete.
	 * </p>
	 *
	 * @return the number of credits assigned to the course.
	 */
	public int getCredits();

	/**
	 * Sets the number of credits for the course.
	 * <p>
	 * This method allows you to update or assign the number of credits associated
	 * with the course. The number of credits typically represents the workload
	 * or the value of the course in terms of time and effort required to complete.
	 * </p>
	 *
	 * @param credits the number of credits to be assigned to the course.
	 * @throws IllegalArgumentException if the provided credits value is less than or equal to zero.
	 */
	public void setCredits(int credits);

	/**
	 * Compares this course with another course for equality.
	 * <p>
	 * This method compares two `Course` objects based on their course number,
	 * name, and credits. If all these attributes are the same for both courses,
	 * the method returns `true`, indicating that the courses are considered equal.
	 * </p>
	 *
	 * @param obj the object to be compared with this course.
	 * @return {@code true} if the courses are considered equal (i.e., have the
	 *         same course number, name, and credits); {@code false} otherwise.
	 * @throws ClassCastException if the specified object is not an instance of
	 *         the {@code Course} class.
	 */
	@Override
	public boolean equals(Object obj);

}
