package project14;

public class Student extends Person {
private String avegerGrade;
private String code;
private String teacher;

public Student(String code, String teacher,int age, String firstName, String lastName, String avegerGrade) {
	super(age, firstName, lastName);
	this.avegerGrade = avegerGrade;
	this.code = code;
	this.teacher = teacher;
}

public String getAvegerGrade() {
	return avegerGrade;
}

public void setAvegerGrade(String avegerGrade) {
	this.avegerGrade = avegerGrade;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getTeacher() {
	return teacher;
}

public void setTeacher(String teacher) {
	this.teacher = teacher;
}

}
