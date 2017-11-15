package com.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
		private int strno;
		private String strname;
		private String Cityname;
		
		public Address() {}

		public int getStrno() {
			return strno;
		}

		public void setStrno(int strno) {
			this.strno = strno;
		}

		public String getStrname() {
			return strname;
		}

		public void setStrname(String strname) {
			this.strname = strname;
		}

		public String getCityname() {
			return Cityname;
		}

		public void setCityname(String cityname) {
			Cityname = cityname;
		}
	
}
