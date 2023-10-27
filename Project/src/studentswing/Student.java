package studentswing;

public class Student {
private String id;
private String name;
private int age;
private double gpa;
public Student(String id, String name, int age, double gpa) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gpa = gpa;
}
public String getId() {
	return id;
}
public void setId(String id) {
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
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}
@Override
public String toString() {
	return  id + "\t \t" + name + "\t \t" + age + "\t \t" + gpa ;
}



}
