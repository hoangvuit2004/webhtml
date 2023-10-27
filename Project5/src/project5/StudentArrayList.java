package project5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;







public class StudentArrayList {
private ArrayList<Integer> grades;
private ArrayList<Student> list;
public StudentArrayList() {
	grades = new ArrayList<>();
	list = new ArrayList<>();
	creList();
}
public void addStudentList(Student stu) {
	list.add(stu);
}
public void removeStudent1(Student stu) {
	list.remove(stu);
}
public double averageGradeStudent() {
	if(list.isEmpty()) {
		return 0.0;
	}
	double sum = 0;
	for (Student student : list) {
		sum+=student.getGrades();
		
	}
	return sum/=list.size();
}
public void displayStudent() {
	for (Student student : list) {
		System.out.println(student.toString());
	}
}
public void sortStudentsByName() {
	Collections.sort(list, new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            double averageGrade1 = s1.getGrades();
            double averageGrade2 = s2.getGrades();

            if (averageGrade1 > averageGrade2) {
                return -1;
            } else if (averageGrade1 < averageGrade2) {
                return 1;
            } else {
                return 0;
            }
        }
    });
       
}

public void creList() {
	Student stu = new Student("100", "HoangVu", 3.2);
	Student student1 = new Student("10001", "Jony Dang",  3.5);
	Student student2 = new Student("1001", "Vu BackEnd",  3.2);
	Student student3 = new Student("1002", "Khoa Pug",  3.3);
	Student student4 = new Student("1003", "Vuong Pham",  3.4);
	addStudentList(stu);
	addStudentList(student1);
	addStudentList(student2);
	addStudentList(student3);
	addStudentList(student4);
	
	
	
}public ArrayList<Student> getStudent() {
	return list;
}
public void removeStudent(String  id){
	Student removeStudent = null;
	for (Student stu : list) {
		if(stu.getId().equals(id)) {
			removeStudent = stu;
			break;
		}
		
			
		}
	if(removeStudent != null) {
			list.remove(removeStudent);
	}
	
}
public static void main(String[] args) {
	StudentArrayList student = new StudentArrayList();
	
	
	
	
	student.displayStudent();
}
}
