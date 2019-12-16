/*Jasdeep Sandhu - 121190151*/
package Assignment2;

public class Inherticance {

	public static void main(String[] args) {
		Person alex = new Person("Alex", "1 Apple Road", "1234567890", "alex@gmail.com");
		Student bart = new Student("Bart", "2 Banana Road", "4561237890", "bart@gmail.com", "Freshman");
		Employee cathrine = new Employee("Cathrine", "3 Coconut Road", "0987654321", "cathrine@gmail.com", 101, 74000.0,
				6, "March", 1996);
		Faculty daren = new Faculty("Daren", "4 Donut Road", "7891234560", "daren@gmail.com", 120, 100000.0, 7, "July",
				1997, "9am-5pm", "Faculty Head");
		Staff eric = new Staff("Eric", "5 Eagle Road", "6541239870", "eric@gmail.com", 107, 50000.0, 21, "May", 2000,
				"Janitor");

		System.out.println(alex.toString() + "\n");
		System.out.println(bart.toString() + "\n");
		System.out.println(cathrine.toString() + "\n");
		System.out.println(daren.toString() + "\n");
		System.out.println(eric.toString() + "\n");
	}

}

class Person {
	public String name;
	public String address;
	public String number;
	public String email;

	Person() {
	}

	Person(String newName, String newAddress, String newNumber, String newEmail) {
		name = newName;
		address = newAddress;
		number = newNumber;
		email = newEmail;
	}

	public String toString() {
		return "Class: Person\nName: " + name;
	}
}

class Student extends Person {
	public final String classStatus;

	Student() {
		this("", "", "", "", "");
	}

	Student(String newName, String newAddress, String newNumber, String newEmail, String newClassStatus) {
		super(newName, newAddress, newNumber, newEmail);
		classStatus = newClassStatus;
	}

	public String toString() {
		return "Class: Student\nName: " + name;
	}
}

class Employee extends Person {
	public int office;
	public double salary;
	public Date dateHired;

	Employee() {
	}

	Employee(String newName, String newAddress, String newNumber, String newEmail, int newOffice, double newSalary,
			int day, String month, int year) {
		super(newName, newAddress, newNumber, newEmail);
		office = newOffice;
		salary = newSalary;
		dateHired = new Date(day, month, year);
	}

	public String toString() {
		return "Class: Employee\nName: " + name;
	}
}

class Date {
	public String date;

	Date() {
	}

	Date(int day, String month, int year) {
		date = month + " " + day + ", " + year;
	}

	public String getDate() {
		return date;
	}

}

class Faculty extends Employee {
	public String officeHours;
	public String rank;

	Faculty() {
	}

	Faculty(String newName, String newAddress, String newNumber, String newEmail, int newOffice, double newSalary,
			int day, String month, int year, String newOfficeHours, String newRank) {
		super(newName, newAddress, newNumber, newEmail, newOffice, newSalary, day, month, year);
		officeHours = newOfficeHours;
		rank = newRank;
	}

	public String toString() {
		return "Class: Faculty\nName: " + name;
	}
}

class Staff extends Employee {
	public String title;

	Staff() {
	}

	Staff(String newName, String newAddress, String newNumber, String newEmail, int newOffice, double newSalary,
			int day, String month, int year, String newTitle) {
		super(newName, newAddress, newNumber, newEmail, newOffice, newSalary, day, month, year);
		title = newTitle;
	}

	public String toString() {
		return "Class: Staff\nName: " + name;
	}
}