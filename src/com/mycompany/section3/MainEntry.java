/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Paul Jerchaflie
 *
 */
public class MainEntry {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1,p2;
		Teacher t=new TeacherImpl("Ilker","java");
		Student s= new StudentImpl("Paul","java");
		p1= t;
		p2= s;
		System.out.println(p1.getName()+" "+p2.getName());

	}

}
