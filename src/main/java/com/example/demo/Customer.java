package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@Column
	Integer cno;
	@Column
	String cname;
	@Column
	String loc;

	public Customer() {
	}

	public Customer(Integer cno, String cname, String loc) {
		this.cno = cno;
		this.cname = cname;
		this.loc = loc;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
}
