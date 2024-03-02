package perpartion;

public class Student {
	private int rollno;
	public Student(int rollno, String name, int age, String gender, String dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
	}
	private String name;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ "]";
	}
	private int age;
	private String gender;
	private String dept;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}


}
