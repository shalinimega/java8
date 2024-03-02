package perpartion;

import java.util.Objects;

public class Emp {
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(name, other.name);
	}
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", des=" + des + "]";
	}
	private int id;
	private String name;
	private int salary;
	private String des;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Emp(int id, String name, int salary, String des) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.des = des;
	}

}
