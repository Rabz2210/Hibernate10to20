package com.service;

import com.Dao.StudentDao;
import com.bean.Address;
import com.bean.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student sone = new Student();
		sone.setSid(123);
		sone.setSname("Mohammad Rabbani");
		Address adrOne = new Address();
		adrOne.setStrno(435);
		adrOne.setStrname("Purani delhi");
		adrOne.setCityname("Delhi");
		sone.setAddr(adrOne);
		Address adrTwo = new Address();
		adrTwo.setStrno(1000);
		adrTwo.setStrname("Purani Rajasthan");
		adrTwo.setCityname("Rajasthan");
		sone.setOfficeaddr(adrTwo);
		StudentDao obj = new StudentDao();
		obj.add(sone);
		System.out.println("Insertion done");
	}
}
