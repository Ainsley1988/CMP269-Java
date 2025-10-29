
/**
 * 
 * This PersonInterface will be implemented by the Person class.
 * 
 * This interface is for creating a person.
 *
 *@author Steven Fulakeza.
 */
public interface PersonInterface {



	/**
	 * This method makes a deep copy of the Person. This involves making a new instance of
	 * the Person which contains duplicates of all the instance variables of the Person.
	 *  
	 * @return A deep copy of the object implementing this interface.
	 * 
	 */	
	public PersonInterface copy() ;	


	/**
	 * Retrieves the age of the person.
	 *
	 * @return the age of the person as an integer.
	 */
	public int getAge();

	/**
	 * Sets the age of the person.
	 *
	 * @param age the age to be set for the person.
	 * @throws IllegalArgumentException if the provided age is less than 0.
	 */
	public void setAge(int age);

	/**
	 * Retrieves the Social Security Number (SSN) of the person.
	 *
	 * @return the SSN of the person as a string.
	 */
	public String getSsn();

	/**
	 * Sets the Social Security Number (SSN) of the person.
	 *
	 * @param ssn the SSN to be set for the person.
	 * @throws IllegalArgumentException if the provided SSN is invalid or does not match the expected format.
	 */
	public void setSsn(String ssn);


	/**
	 * The equals method returns true if the person objects are equal. Returns false otherwise.
	 * Compares this person to the specified object for equality.
	 *
	 * @param obj the object to be compared with this person.
	 * @return {@code true} if the specified object is equal to this person, {@code false} otherwise.
	 */
	public boolean equals(Object obj);



	/**
	 * Returns a string representation of the person.
	 *
	 * @return a string representing the person, typically including their details such as name, age, or SSN.
	 */
	public String toString();
}
