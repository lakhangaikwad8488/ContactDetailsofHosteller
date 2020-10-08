package main.java.yaksha;

 import java.util.Scanner; 


import com.java.entity.Hosteller;

public class Main {
	Scanner sc =new Scanner(System.in);
	public static Hosteller getHostellerDetails() {
		Scanner sc =new Scanner(System.in); 
	 
		  Hosteller h=new Hosteller();	 
		 
		System.out.println("Student Id:");
		h.setStudentId(sc.nextInt());
		System.out.println("Student Name:");
		h.setName(sc.next());
		System.out.println("Department Id:");
		h.setDepartmentId(sc.nextInt());
		System.out.println("Gender");
		h.setGender(sc.next());
		System.out.println("Phone Number");
		h.setPhone(sc.next());
		System.out.println("Hostel name:");
		h.setHostelName(sc.next());
		System.out.println("Room number");
		h.setRoomNumber(sc.nextInt());
		
		
		return h;
		
		
	}
	 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Hosteller h=Main.getHostellerDetails();
		System.out.println("Want Modify Room Number(Y/N)");
		String modify=sc.next();
		if(modify.equals("Y")) {
		System.out.println("New Room Number");
		h.setRoomNumber(sc.nextInt());
		}
		System.out.println("Want Modify Phone Number(Y/N)");
		String phone=sc.next();
		if(phone.equals("Y")) {
		System.out.println("New Phone Number");
		h.setPhone(sc.next()); 	
		}
		System.out.println("The Student Details:");
		System.out.println(h.getStudentId()+" "+h.getName()+" "+h.getDepartmentId()+" "
		+h.getGender()+" "+h.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber());
		
		
	}
}
