/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Paul Jerchaflie
 *
 */
public class TeacherImpl extends PersonBaseImpl implements Teacher {

	private String taughtCourseTitle;
	/**
	 * 
	 */
	public TeacherImpl(String name, String taughtCourseTitle) {
		super(name);
		this.taughtCourseTitle=taughtCourseTitle;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getDetails()
	 */
	@Override
	public String getDetails() {
		return "Teacher";
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Teacher#teachesFor()
	 */
	@Override
	public String teachesFor() {
		return taughtCourseTitle;
	}

}
