package com.beacon.tennis.vo;

import java.sql.Timestamp;

/*
202203	10001	홍길동	초급반	서울본원	100000	일반
202203	10002	장발장	초급반	성남분원	100000	일반
202203	10003	임꺽정	중급반	대전분원	200000	일반
202203	20001	성춘향	고급반	부산분원	300000	VIP
202203	20002	이몽룡	심화반	대구분원	400000	VIP

이름      널?       유형           
------- -------- ------------ 
C_NO    NOT NULL CHAR(5)      
C_NAME           VARCHAR2(15) 
PHONE            VARCHAR2(11) 
ADDRESS          VARCHAR2(50) 
GRADE            VARCHAR2(6)  
이름           널?       유형           
------------ -------- ------------ 
REGIST_MONTH NOT NULL VARCHAR2(6)  
C_NO         NOT NULL CHAR(5)      
CLASS_AREA            VARCHAR2(15) 
TUITION               NUMBER(8)    
TEACHER_CODE          CHAR(3)      
이름                  널?       유형           
------------------- -------- ------------ 
TEACHER_CODE        NOT NULL CHAR(3)      
TEACHER_NAME                 VARCHAR2(15) 
CLASS_NAME                   VARCHAR2(20) 
CLASS_PRICE                  NUMBER(8)    
TEACHER_REHIST_DATE          VARCHAR2(8)  
*/

public class TMemberVO {
	private String rmonth;
	private String cno;
	private String cname;
	private String clname;
	private String clarea;
	private int clprice;
	private String grade;

	public TMemberVO() {
	}

	public TMemberVO(String rmonth, String cno, String cname, String clname, String clarea, int clprice, String grade) {
		super();
		this.rmonth = rmonth;
		this.cno = cno;
		this.cname = cname;
		this.clname = clname;
		this.clarea = clarea;
		this.clprice = clprice;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "TMemberVO [rmonth=" + rmonth + ", cno=" + cno + ", cname=" + cname + ", clname=" + clname + ", clarea="
				+ clarea + ", clprice=" + clprice + ", grade=" + grade + "]";
	}

	
	public String getRmonth() {
		return rmonth;
	}

	public void setRmonth(String rmonth) {
		this.rmonth = rmonth;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getClarea() {
		return clarea;
	}

	public void setClarea(String clarea) {
		this.clarea = clarea;
	}

	public int getClprice() {
		return clprice;
	}

	public void setClprice(int clprice) {
		this.clprice = clprice;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
