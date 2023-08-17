package com.javaoopsproj;

public class Student {

	// Properties (or) Fields
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	// Constructor
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	// Property Methods

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void payFees(int fees) {
		feesPaid = feesPaid + fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public String toString() {
		return "Student's name : " + name + " Total fees paid so far $ " + feesPaid;
	}
}
