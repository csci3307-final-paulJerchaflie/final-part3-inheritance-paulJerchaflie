/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Paul Jerchaflie
 *
 */
public abstract class PersonBaseImpl implements Person {

	protected String name;

	public PersonBaseImpl(String name) {
		this.name=name;
	}
	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getName()
	 */
	@Override
	public String getName() {
		return name;
	}


}
