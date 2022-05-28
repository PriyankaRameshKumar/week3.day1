package week3.day1;

public class Students {
	
	//method Overloading
	//GetStudentInfo method with different number of datatypes , order and datatypes
	
	public void getStudentInfo() {
		System.out.println("Student information");
	}

	public int getStudentInfo(int id) {
		return id;
	}
	
	public void getStudentInfo(int id , String name) {
		System.out.println("id= "+id +" Name= "+ name);
		
	}
	
	public void getStudentInfo(String email , int phonenumber) {
		System.out.println("Email= "+email +" PhoneNumber= "+ phonenumber);
	}
	
	public static void main(String[] args) {
		Students student = new Students();
		student.getStudentInfo();
		System.out.println("id= "+student.getStudentInfo(12));
		student.getStudentInfo(12, "Priyanka");
		student.getStudentInfo("Priyanka@gmail.com", 1234567890);
	}
}
