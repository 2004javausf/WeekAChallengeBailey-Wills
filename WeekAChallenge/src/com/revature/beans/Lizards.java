package com.revature.beans;

public class Lizards {
	
	private String species;
	private String size;
	private Integer age;
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Lizards [species=" + species + ", size=" + size + ", age=" + age + "]";
	}

}
