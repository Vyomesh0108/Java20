// Q) WAP to create class "Student". Where object of one student is created and Id, 
//		name and age should be pass as parameter while creating object and make input 
//		method to enter marks of three subjects and make show method to display all info 
//		with total and percentage?

import java.util.*;

class Student
{
	int id, age;
	String name;
	int m1, m2, m3, tot;
	float per;
	
	Scanner scan = new Scanner(System.in);
	
	Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void input()
	{
		System.out.print("ENTER MARKS OF 3 SUBJECTS : ");
		m1 = scan.nextInt();
		m2 = scan.nextInt();
		m3 = scan.nextInt();

		tot = m1 + m2 + m3;
		per = (float)tot/3;
	}

	void show()
	{
		System.out.println("\n ID : "+id);
		System.out.println("\n NAME : "+name);
		System.out.println("\n AGE : "+age);
		System.out.println("\n MARKS : "+m1+","+m2+","+m3);
		System.out.println("\n TOTAL : "+tot+", PER = "+per);
	}
}

public class MyStd
{
	public static void main(String[]st)
	{
		Student s1 = new Student(1, "vyomesh", 21);
		Student s2 = new Student(2, "darsh", 21);
		Student s3 = new Student(3, "karan", 22);

		s1.input();
		s2.input();
		s3.input();

		s1.show();
		s2.show();
		s3.show();
	}
}
 