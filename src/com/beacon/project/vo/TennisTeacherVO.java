package com.beacon.project.vo;

//이름                  널?       유형           
//------------------- -------- ------------ 
//TEACHER_CODE        NOT NULL CHAR(3)      
//TEACHER_NAME                 VARCHAR2(15) 
//CLASS_NAME                   VARCHAR2(20) 
//CLASS_PRICE                  NUMBER(8)    
//TEACHER_REHIST_DATE          VARCHAR2(8)  
 

public class TennisTeacherVO {
	private int tcode;
	private String tname;
	private String cname;
	private int cprice;
	private String tdate;
	
	public TennisTeacherVO() {}

	public TennisTeacherVO(int tcode, String tname, String cname, int cprice, String tdate) {
		super();
		this.tcode = tcode;
		this.tname = tname;
		this.cname = cname;
		this.cprice = cprice;
		this.tdate = tdate;
	}

	public int getTcode() {
		return tcode;
	}

	public void setTcode(int tcode) {
		this.tcode = tcode;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCprice() {
		return cprice;
	}

	public void setCprice(int cprice) {
		this.cprice = cprice;
	}

	public String getTdate() {
		return tdate;
	}

	public void setTdate(String tdate) {
		this.tdate = tdate;
	}

	
	
	
}
