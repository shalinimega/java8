package Lists1;

public class Employee {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address
				+ ", exp=" + exp + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getSalary()=" + getSalary() + ", getAddress()=" + getAddress() + ", getExp()=" + getExp()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Employee(int id, String name, int age, int salary, String address, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.exp = exp;
	}
	private int age;
	private int salary;
	private String address;
	private int exp;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Object values() {
		// TODO Auto-generated method stub
		return null;
	}

}
