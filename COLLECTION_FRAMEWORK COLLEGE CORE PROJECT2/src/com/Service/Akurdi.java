package com.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Model.Batch;
import com.Model.Course;
import com.Model.Faculty;
import com.Model.Student;

public class Akurdi implements CJC {

	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {

		Course c = new Course();
		System.out.println("Enter the Course ID : ");
		c.setCid(sc.nextInt());

		System.out.println("Enter the course Name : ");
		c.setCname(sc.next());

		clist.add(c);

		System.out.println("Course data added successfully!");

	}

	@Override
	public void viewCourse() {
		System.out.println("---Student Information---");

		if (clist.isEmpty()) {
			System.out.println("Data is not inserted yet!");

		} else {
			for (Course cou : clist) {

				// System.out.println("Course ID : " + cou.getCid() + " ,Course Name : " +
				// cou.getCname());
				System.out.println(cou);

			}
		}

	}

	@Override
	public void addFaculty() {

		Faculty fc = new Faculty();
		System.out.println("Enter the Faculty ID : ");
		fc.setFid(sc.nextInt());

		System.out.println("Enter the Faculty Name : ");
		fc.setFname(sc.next());

		// we need to iterate clist just for getting an data in Course
		for (Course course : clist) {
			fc.setCourse(course);
		}

		flist.add(fc);
		System.out.println("Faculty data added successfully!");

	}

	@Override
	public void viewFaculty() {
		System.out.println("---Faculty Information---");

		if (flist.isEmpty()) {

			System.out.println("Data is not inserted yet!");

		} else {
			for (Faculty faculty : flist) {
//			System.out.println("Faculty ID : " + faculty.getFid() + " , Faculty Name : " + faculty.getFname());
//
//			System.out.println("Course ID : " + faculty.getCourse().getCid() + " , Course Name : "
//					+ faculty.getCourse().getCname());
				System.out.println(faculty);
			}

		}

	}

	@Override
	public void addBatch() {

		Batch b = new Batch();
		System.out.println("Enter Batch ID : ");
		b.setBid(sc.nextInt());
		System.out.println("Enter Batch Name : ");
		b.setBname(sc.next());

		for (Faculty fac : flist) {
			b.setFaculty(fac);
		}

		blist.add(b);

		System.out.println("Batch data added successfully!");

	}

	@Override
	public void viewBatch() {

		System.out.println("---Batch Information---");
		if (blist.isEmpty()) {
			System.out.println("Data is not inserted yet!");
		} else {
			for (Batch bat : blist) {
//			System.out.println("Batch ID : " + bat.getBid() + " , Batch Name : " + bat.getBname());
//			System.out.println(
//					"Faculty ID : " + bat.getFaculty().getFid() + " , Faculty Name : " + bat.getFaculty().getFname());
//			System.out.println("Course ID : " + bat.getFaculty().getCourse().getCid() + " , Course Name : "
//					+ bat.getFaculty().getCourse().getCname());

				System.out.println(bat);
			}

		}

	}

	@Override
	public void addStudent() {

		Student s = new Student();
		System.out.println("Enter  Student Rollno :  ");
		s.setSrollno(sc.nextInt());
		System.out.println("Enter Student Name : ");
		s.setSname(sc.next());

		for (Batch batch : blist) {
			s.setBat(batch);
		}

		slist.add(s);

		System.out.println("Student data added successfully!");

	}

	@Override
	public void viewStudent() {

		System.out.println("---Student Information---");
		for (Student stu : slist) {
//			System.out.println("Student Rollno : " + stu.getSrollno() + " , Student Name : " + stu.getSname());
//			System.out.println("Batch ID : " + stu.getBat().getBid() + " ,  Batch Name : " + stu.getBat().getBname());
//			System.out.println("Faculty ID : " + stu.getBat().getFaculty().getFid() + " ,  Faculty Name : "
//					+ stu.getBat().getFaculty().getFname());
//			System.out.println("Course ID : " + stu.getBat().getFaculty().getCourse().getCid() + " ,  Course Name : "
//					+ stu.getBat().getFaculty().getCourse().getCname());

			System.out.println(stu);
		}

	}

}
