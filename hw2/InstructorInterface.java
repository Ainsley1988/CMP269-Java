
/**
 * This interface is implements by the Instructor class, which
 * extends the Person class.
 */
public interface InstructorInterface {
	
	/**
	 * 
	 * The following method is used to get and return the emplid of the instructor.
	 * @return emplid of the instructor
	 */
	public int getEmplid();
	
	/**
	 * This method is used to set the emplid of the instructor.
	 * @param emplid
	 */
	public void setEmplid(int emplid);
	
	/**
	 * This method returns the year of hire of the instructor.
	 * @return the year of hire of the instructor
	 */
	public int getYearOfHire();
	
	/**
	 * This method is used to set the year of hire of the instructor.
	 * @param yearOfHire year of hire the instructor
	 */
	public void setYearOfHire(int yearOfHire);

}
