package project5;

public class Student {
private String id;
private String name;
private double grades;
public Student(String id, String name, double grades) {
	super();
	this.id = id;
	this.name = name;
	this.grades = grades;
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
public double getGrades() {
	return grades;
}
public void setGrades(double grades) {
	this.grades = grades;
}
@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", grades=" + grades + "";
}

}
