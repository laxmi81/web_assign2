package com.user.info;

import java.util.List;

public class Student extends Address {
	private int id;
    private String name;
    private List<Integer> marks;
    private List<String> contact;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public List<String> getContact() {
		return contact;
	}

	public void setContact(List<String> contact) {
		this.contact = contact;
	}

	public List<Address> getAdresss() {
		return adresss;
	}

	public void setAdresss(List<Address> adresss) {
		this.adresss = adresss;
	}

	public List<Address> adresss;
    
}
