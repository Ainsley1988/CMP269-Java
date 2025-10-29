
/**
 *
 * @author Steven Fulakeza
 *
 */
public interface CourseSectionInterface {

	/**
	 * Retrieves the course associated with this course section.
	 * <p>
	 * This method returns the `Course` object that is linked to the current
	 * course section. A course section typically refers to a specific
	 * instance or offering of a course, such as a particular semester or
	 * schedule, and this method provides access to the underlying course
	 * details (e.g., course code, name, credits).
	 * </p>
	 *
	 * @return the `Course` object associated with this course section.
	 */
	public Course getCourse();

	/**
	 * Sets the course associated with this course section.
	 * <p>
	 * This method allows you to assign a `Course` object to the current
	 * course section. A course section typically refers to a specific
	 * instance or offering of a course (e.g., a specific semester or schedule),
	 * and this method links the section to the course details.
	 * </p>
	 *
	 * @param course the `Course` object to be assigned to this course section.
	 * @throws IllegalArgumentException if the provided course is {@code null}.
	 */
	public void setCourse(Course course);

	/**
	 * Retrieves the grade for a student in this course section.
	 * <p>
	 * This method returns the grade assigned to a student for the specific
	 * course section. The grade represents the student's performance in the
	 * course section, which may be based on assignments, exams, or other
	 * evaluation methods used throughout the course.
	 * </p>
	 *
	 * @return the grade assigned to the student for this course section,
	 *         which could be a letter grade (e.g., "A", "B", "C").
	 */
	//public String getGrade();

	/**
	 * Sets the grade for a student in this course section.
	 * <p>
	 * This method allows you to assign a grade to a student for the specific
	 * course section. The grade is typically used to evaluate the student's
	 * performance in the course section and may be based on assignments,
	 * exams, or overall course performance.
	 * </p>
	 *
	 * @param grade the grade to be assigned to the student. The grade can
	 *              be a letter grade (e.g., "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F", "INC", "WU", "W") , depending on the grading system used.
	 * @throws IllegalArgumentException if the provided grade is not valid
	 */
	//public void setGrade(String grade);

	/**
	 *
	 * This method is used to calculate GPA
	 *
	 *Grade Quality points (QP) are calculated by multiplying the credit value of each course by the numerical value of the grade received, 4.0 to 1.7 for grades A through C-, and 0 for F or WU.
	 *Please refer to this description from Lehman College:
	 *https://lehman-graduate.catalog.cuny.edu/graduate-programs-and-policies/grading-system/gpa
	 *https://www.lehman.edu/academics/advising/gpa-calculate.php
	 *
	 *
	 *
	 * @return
	 */
	//public double getGradeQualityPoints();


	/**
	 * Retrieves the status indicating whether the semester for this course section
	 * has been finished.
	 * <p>
	 * This method returns a boolean value that indicates whether the semester
	 * or term for the course section is complete. This can be used to check if
	 * the course section has concluded or if it is still in progress, potentially
	 * affecting final grading and evaluations.
	 * </p>
	 *
	 * @return {@code true} if the semester has been completed,
	 *         {@code false} if the semester is still ongoing.
	 */
	public boolean isSemesterFinished();

	/**
	 * Sets the status indicating whether the semester for this course section
	 * has been finished.
	 * <p>
	 * This method allows you to update the status of the course section,
	 * marking whether the semester or term has been completed. Typically,
	 * this status is used to indicate whether grading and final evaluations
	 * for the section are finalized or if the course section is still ongoing.
	 * </p>
	 *
	 * @param semesterFinished {@code true} if the semester has been completed,
	 *                         {@code false} if the semester is still in progress.
	 * @throws IllegalArgumentException if the provided value is {@code null}.
	 */
	public void setIsSemesterFinished(boolean isSemesterFinished);

	/**
	 * Retrieves the instructor assigned to this course section.
	 * <p>
	 * This method returns the `Instructor` object associated with the current
	 * course section. The instructor typically represents the faculty member
	 * responsible for teaching the course section, and this method provides access
	 * to the instructor's details, such as name, office hours, and contact information.
	 * </p>
	 *
	 * @return the `Instructor` object assigned to this course section, or {@code null}
	 *         if no instructor is currently assigned.
	 */
	public Instructor getInstructor();

	/**
	 * Sets the instructor for this course section.
	 * <p>
	 * This method allows you to assign an `Instructor` object to the current
	 * course section. The instructor typically represents the faculty member
	 * responsible for teaching the course section, and this method links the
	 * course section to the instructor's details, such as their name, office hours,
	 * and contact information.
	 * </p>
	 *
	 * @param instructor the `Instructor` object to be assigned to this course section.
	 *                   If the value is {@code null}, it implies that no instructor
	 *                   is assigned to the course section.
	 * @throws IllegalArgumentException if the provided instructor is {@code null}
	 *                                  (if the system requires an instructor to be assigned).
	 */
	public void setInstructor(Instructor instructor);

	/**
	 *
	 * @return
	 */
	public int getId();

	/**
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj);


	/**
	 *
	 * @return
	 */
	@Override
	public String toString();

}
