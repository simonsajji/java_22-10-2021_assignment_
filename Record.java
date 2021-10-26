package constandclass;

import java.util.HashMap;

//Homework: Create a class named "Students" and add data members like name, age, gender, roll no, phone, Total marks scored, and address.
//Create constructors to init all the values both to default and specific values (using parameterized).
//
//Create another (3rd) constructor which asks the user to input values to init upon the creation of the new object.
//
//Compare 4 students (by creating objects ) and find out the topper of the class.
//
//Create 5th student and init it with 2nd student marks and address and copy the age of 4th student. (using copy constructor)
//
//NOTE: make sure that rollNo is non-modifiable.

class Student{
	String name;
	int age;
	String gender;
	final int rno;
	long phone;
	int Totmarks;
	String addr;
	
	Student(){
		name=null;
		age=0;
		gender=null;
		rno=0;
		phone=0;
		Totmarks=0;
		addr=null;
		
		
	}
	Student(String g,int rn){
		gender=g;
		rno=rn;
	}
	Student(String n,int a,String g,int r,long ph,int Tot,String ad){
		name=n;
		age=a;
		gender=g;
		rno=r;
		phone=ph;
		Totmarks=Tot;
		addr=ad;
		
	}
	// copy mark and addr of student2 and age of student4 
	Student(Student s2,Student s4){
		Totmarks=s2.Totmarks;
		rno=0;
		addr=s2.addr;
		age=s4.age;
	}
	

	
}

public class Record {
	public static void main(String args[]) {
		Student s=new Student();
		Student s0=new Student("M",30);
		
		
		
		
		Student s1=new Student("Shan",23,"M",10,971239891,87,"Thrissur");
		Student s2=new Student("Stebin",24,"M",11,971239891,90,"Dubai");
		Student s3=new Student("Sachin",22,"M",12,971239891,78,"Ramapuram");
		Student s4=new Student("Joel",24,"M",20,971239891,99,"China");
		
		
		
		HashMap<Integer,String> hmap=new HashMap<>();
		
		int[] arr= {s1.Totmarks,s2.Totmarks,s3.Totmarks,s4.Totmarks};
		String[] arr1= {s1.name,s2.name,s3.name,s4.name};
		int max=0;String topper="";
		
		for(int i=0;i<arr.length;i++) {
			hmap.put(arr[i],arr1[i]);
		}
		for (Integer k:hmap.keySet()) {
			if(k>max) {
				max=k;
				topper=hmap.get(k);
			}
		}
		System.out.println("The topper of the class is : "+topper+" with marks "+max);
	
	
		
		Student s5=new Student(s2,s4);
		System.out.println(s5.name);
		System.out.println(s5.age);
		System.out.println(s5.rno);
		System.out.println(s5.Totmarks);
		System.out.println(s5.gender);
		System.out.println(s5.addr);
		
		
		
		
		
	}

}
