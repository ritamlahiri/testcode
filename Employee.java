

public class Employee  {
	
	private String name ;
	private int age ;
	private int salary;
	// new file added in feature branch
	private int dept_id;
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
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public Employee(String name, int age, int salary, int dept_id) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept_id = dept_id;
	}
	
	
	
	
	
	
}