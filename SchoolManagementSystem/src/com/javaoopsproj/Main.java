package com.javaoopsproj;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Mellisa", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);
		List<Teacher> teacherList = new ArrayList<>();

		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);

		Student maloire = new Student(1, "Maloire", 9);
		Student harry = new Student(2, "Harry", 12);
		Student tom = new Student(3, "Tom", 5);
		List<Student> studentList = new ArrayList<>();

		studentList.add(maloire);
		studentList.add(harry);
		studentList.add(tom);

		School ghs = new School(teacherList, studentList);

		Teacher megha = new Teacher(6, "Megha", 900);
		ghs.addTeacher(megha);
		System.out.println(megha);

		maloire.payFees(5000);
		tom.payFees(8000);
		System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

		System.out.println("-------Making School Pay Salary-------");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println(
				"GHS has spent for salary to " + lizzy.getName() + " and now has $ " + ghs.getTotalMoneyEarned());

		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println(
				"GHS has spent for salary to " + vanderhorn.getName() + " and now has $ " + ghs.getTotalMoneyEarned());

		System.out.println(maloire);

		mellisa.receiveSalary(mellisa.getSalary());

		System.out.println(mellisa);

	}

}
