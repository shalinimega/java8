package Interviewquestion;

public class Employee {
	private int id;
	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	public Employee(int id, String name, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
	}
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	private String name;
	private String desg;
	private int salary;
	public Employee(int salary) {
		super();
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
