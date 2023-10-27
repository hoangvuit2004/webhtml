package studentswing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentModel {
		
	    private ArrayList<Student> students;

	    public StudentModel() {
	        students = new ArrayList<>();
	        creList();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void removeStudent(Student student) {
	        students.remove(student);
	    }

	    public ArrayList<Student> getStudents() {
	        return students;
	    }
	    public void addStudentFromTextField(String id, String name, String age, String gpa) {
	        int studentAge = Integer.parseInt(age);
	        double studentGPA = Double.parseDouble(gpa);
	        Student student = new Student(id, name, studentAge, studentGPA);
	        students.add(student);
	    }
	    public void sortStudentsByName() {
	        Collections.sort(students, new Comparator<Student>() {

				@Override
				public int compare(Student student1, Student student2) {
					// TODO Auto-generated method stub
					return student1.getName().compareTo(student2.getName());
					
				}
	        	
			});
	           
	    }
	    public void creList() {
	    	Student student1 = new Student("1000", "Jony Dang", 19, 3.5);
	    	Student student2 = new Student("1001", "Vu BackEnd", 19, 3.2);
	    	Student student3 = new Student("1002", "Khoa Pug", 19, 3.3);
	    	Student student4 = new Student("1003", "Vuong Pham", 19, 3.4);
	    	addStudent(student1);
	    	addStudent(student2);
	    	addStudent(student3);
	    	addStudent(student4);
	    	
	    	
	    	
	    }
	    public ArrayList<Student> searchStudentByName(String id) {
	        ArrayList<Student> searchResults = new ArrayList<>();

	        for (Student student : students) {
	            if (student.getId().equals(id)) {
	                searchResults.add(student);
	            }
	        }

	        return searchResults;
	    }
	    public void removeStudentById(String id) {
	        Student studentToRemove = null;
	        for (Student student : students) {
	            if (student.getId().equals(id)) {
	                studentToRemove = student;
	                break;
	            }
	        }
	        if (studentToRemove != null) {
	            students.remove(studentToRemove);
	        }
	    }
	   
	    public void updateStudent(String id,String name, int age, double gpa) {
	    	Student studentToUpdate = null;
	        for (Student student : students) {
	            if (student.getId().equals(id)) {
	                studentToUpdate = student;
	                break;
	            }
	        }
	        if(studentToUpdate!=null) {
	        	studentToUpdate.setId(id);
	        	studentToUpdate.setName(name);
	        	studentToUpdate.setAge(age);
	        	studentToUpdate.setGpa(gpa);
	        	
	        	
	        }
	    }
	    public void saveStudent(String id,String name, int age, double gpa) {
	    	Student student = new Student(id, name, age, gpa);
	    	addStudent(student);
	    }
	    public static void main(String[] args) {
		
}
}
