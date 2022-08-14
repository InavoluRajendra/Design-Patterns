package compositedp;

import java.util.ArrayList;
import java.util.List;

public class Child implements Human {
	private String name;
	private String lastName;
	private List<Human> parents=new ArrayList<>();
	public Child(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("=========");
		System.out.println("name"+getName());
		System.out.println("last name "+getLastName());
		System.out.println("Parents:");
		
		for(Human parent:parents)
			System.out.println("name "+parent.getName());
		System.out.println("=========");

	}

	@Override
	public void addChild(Human child) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addParent(Human parent) {
		// TODO Auto-generated method stub
		parents.add(parent);

	}

}
