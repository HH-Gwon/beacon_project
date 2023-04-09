package com.beacon.tennis.vo;

import java.sql.Timestamp;

/*
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

public class TTuitionVO {
	private String tcode;
	private String clname;
	private String tname;
	private int tuition;

	public TTuitionVO() {
	}

	public TTuitionVO(String tcode, String clname, String tname, int tuition) {
		super();
		this.tcode = tcode;
		this.clname = clname;
		this.tname = tname;
		this.tuition = tuition;
	}

	public String getTcode() {
		return tcode;
	}

	public void setTcode(String tcode) {
		this.tcode = tcode;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getTuition() {
		return tuition;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

}
