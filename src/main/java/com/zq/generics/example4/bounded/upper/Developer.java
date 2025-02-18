package com.zq.generics.example4.bounded.upper;

import java.util.List;

public class Developer extends Employee {

	private List<String> skillStack;

	public Developer(int id, String name, List<String> skillStack) {
		super(id, name);
		this.skillStack = skillStack;
	}

	@Override
	public String toString() {
		return "Developer{" +
				"skillStack=" + skillStack +
				"} " + super.toString();
	}
}
