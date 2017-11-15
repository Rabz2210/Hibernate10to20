package com.bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="Student")
@Table(name="StudentSeven")
public class Student {

		@Id
		@Column(name="sid", nullable=false)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="hibersqnGenerator")
		@SequenceGenerator(name="hibersqnGenerator", sequenceName="HIBERFIVE", allocationSize=1)
		private int sid;
		private String sname;
		@Embedded
		@AttributeOverrides({
		@AttributeOverride(name="strno", column=@Column(name="home_strno")),
		@AttributeOverride(name="strname", column=@Column(name="home_strname")),
		@AttributeOverride(name="Cityname", column=@Column(name="home_city"))
		})
		private Address addr;
		@Embedded
		private Address Officeaddr;
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

		public Address getOfficeaddr() {
			return Officeaddr;
		}

		public void setOfficeaddr(Address officeaddr) {
			Officeaddr = officeaddr;
		}
		
		
	
}
