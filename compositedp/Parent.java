package compositedp;

import java.util.ArrayList;
import java.util.List;

public class Parent implements Human {
	private String name;
	private String lastName;
	private List<Human> childs=new ArrayList<>();
	private List<Human> grandparents=new ArrayList<>();
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
		for(Human parent:grandparents)
			System.out.println("name "+parent.getName());
		System.out.println("childs:");
		for(Human child:childs)
			System.out.println("name "+child.getName());
		System.out.println("=========");

	}

	public Parent(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public void addChild(Human child) {
		// TODO Auto-generated method stub
		childs.add(child);

	}

	@Override
	public void addParent(Human parent) {
		// TODO Auto-generated method stub
		grandparents.add(parent);

	}

}
