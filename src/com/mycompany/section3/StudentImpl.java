/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Paul Jerchaflie
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student {

	
	private String takenCourseTitle;
	/**
	 * 
	 */
	public StudentImpl(String name,String takenCourseTitle) {
		super(name);
		this.takenCourseTitle=takenCourseTitle;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getDetails()
	 */
	@Override
	public String getDetails() {
		return "Student";
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Student#studiesFor()
	 */
	@Override
	public String studiesFor() {
		return takenCourseTitle;
	}

}
