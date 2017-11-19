package com.bean;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity(name="Student")
@Table(name="StudentSeven")
public class Student {

		@Id
		@GeneratedValue
		@Column(name="sid", nullable=false)
		private int sid;
		private String sname;
		
		@CollectionOfElements
		@JoinTable(name="Table_of_addresses", 
		joinColumns=@JoinColumn(name="User_Id"))
		private Set<Address> listOfAddresses = new HashSet<Address>();
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


		public Set<Address> getListOfAddresses() {
			return listOfAddresses;
		}


		public void setListOfAddresses(Set<Address> listOfAddresses) {
			this.listOfAddresses = listOfAddresses;
		}

		
		
}
