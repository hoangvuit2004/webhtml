package project14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
private ArrayList<Student> listStudent;
public StudentList() {
	listStudent = new ArrayList<>();
	//creList();
}
public void addStudent(Student stu) {
	listStudent.add(stu);
}
public ArrayList<Student> getStudent(){
	return listStudent;
}

public void sortStudent() {
	Collections.sort(listStudent, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
		   return o1.getLastName().compareTo(o2.getLastName());
		}
	});
}
}
