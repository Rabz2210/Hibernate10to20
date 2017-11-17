package com.bean;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity(name="Student")
@Table(name="StudentSeven")
public class Student {

		@Id
		@GeneratedValue
		@Column(name="sid", nullable=false)
		private int sid;
		private String sname;
		@Embedded
		private Address addr;
		public Student() {}
		
		
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		
		@Column(name="sname",nullable=false)
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}

		public Address getAddr() {
			return addr;
		}
		public void setAddr(Address addr) {
			this.addr = addr;
		}
		
	
}
