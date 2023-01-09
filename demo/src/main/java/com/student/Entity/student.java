package com.student.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	
	@Id
	@Column(name="Student ID")
	private int StudentID;
	private String StudentName;
	private String StudentBranch;
	private int StudentAge;
	private long StudentNumber;
	private String StudentGmail;
	private String StudentCollege;
	private String StudentAdress;
	
	public student() {
		super();
		
	}

	public student(int StudentID, String StudentName, String StudentBranch, int StudentAge, long StudentNumber,
			String StudentGmail, String StudentCollege, String StudentAdress) {
		super();
		this.StudentID = StudentID;
		this.StudentName = StudentName;
		this.StudentBranch = StudentBranch;
		this.StudentAge = StudentAge;
		this.StudentNumber = StudentNumber;
		this.StudentGmail = StudentGmail;
		this.StudentCollege = StudentCollege;
		this.StudentAdress = StudentAdress;
	}

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int StudentID) {
		this.StudentID = StudentID;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}

	public String getStudentBranch() {
		return StudentBranch;
	}

	public void setStudentBranch(String StudentBranch) {
		this.StudentBranch = StudentBranch;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(int StudentAge) {
		this.StudentAge = StudentAge;
	}

	public long getStudentNumber() {
		return StudentNumber;
	}

	public void setStudentNumber(long StudentNumber) {
		this.StudentNumber = StudentNumber;
	}

	public String getStudentGmail() {
		return StudentGmail;
	}

	public void setStudentGmail(String StudentGmail) {
		this.StudentGmail = StudentGmail;
	}

	public String getStudentCollege() {
		return StudentCollege;
	}

	public void setStudentCollege(String StudentCollege) {
		this.StudentCollege = StudentCollege;
	}

	public String getStudentAdress() {
		return StudentAdress;
	}

	public void setStudentAdress(String StudentAdress) {
		this.StudentAdress = StudentAdress;
	}

	@Override
	public String toString() {
		return "student [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentBranch=" + StudentBranch
				+ ", StudentAge=" + StudentAge + ", StudentNumber=" + StudentNumber + ", StudentGmail=" + StudentGmail
				+ ", StudentCollege=" + StudentCollege + ", StudentAdress=" + StudentAdress + "\n"+"]";
	}
	
	

}
