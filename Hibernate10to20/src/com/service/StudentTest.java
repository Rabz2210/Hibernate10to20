package com.service;

import com.Dao.StudentDao;
import com.bean.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student sone = new Student();
		sone.setSid(123);
		sone.setSname("Mohammad Rabbani");
		Student two  = new Student();
		two.setSid(234);
		two.setSname("Amit Tandon");
		StudentDao obj = new StudentDao();
		obj.add(sone);
		obj.add(two);
		System.out.println("Insertion done");
	}
}
