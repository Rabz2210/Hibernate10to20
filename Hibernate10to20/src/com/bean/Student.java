package com.bean;


import java.util.ArrayList;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import java.util.*;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity(name="Student")
@Table(name="StudentSeven")
public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="sid", nullable=false)
		private int sid;
		private String sname;
		
		@CollectionOfElements
		@JoinTable(name="Table_of_addresses", 
		joinColumns=@JoinColumn(name="User_Id"))
		@GenericGenerator(name="hilo-gen", strategy="hilo")
		@CollectionId(columns = { @Column(name="Address_Id") }, generator = "hilo-gen", type = @Type(type = "long"))
		private Collection<Address> listOfAddresses = new ArrayList<Address>();
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


		public Collection<Address> getListOfAddresses() {
			return listOfAddresses;
		}


		public void setListOfAddresses(Collection<Address> listOfAddresses) {
			this.listOfAddresses = listOfAddresses;
		}
		
		
		
}
