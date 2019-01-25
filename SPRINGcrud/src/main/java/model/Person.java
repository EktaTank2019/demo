/*
 *To change this license header, choose License Headers in Project Properties.
 *To change this template file, choose Tools | Templates
 *and open the template in the editor.
 */

package model;

/**
 *
 * @author Ekta Tank
 * @since 21 Jan, 2019
 * @version 1.0.0
 */
public class Person {	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + '}';
	}
	
	
	private Long id;
	private String firstName;
	private String lastName;
	

}
