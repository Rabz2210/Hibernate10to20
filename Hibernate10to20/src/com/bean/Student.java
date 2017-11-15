package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="Student")
@Table(name="StudentSeven")
public class Student {

		private int sid;
		private String sname;
		
		public Student() {}
		
		@Id
		@Column(name="sid", nullable=false)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="hibersqnGenerator")
		@SequenceGenerator(name="hibersqnGenerator", sequenceName="HIBERFIVE", allocationSize=1)
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
		
		
}
