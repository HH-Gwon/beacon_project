package servlet_vote_db_dto;

import java.sql.Timestamp;
import java.util.Date;

//이름       널?       유형           
//-------- -------- ------------ 
//M_NO     NOT NULL CHAR(1)      
//M_NAME            VARCHAR2(20) 
//P_CODE            CHAR(2)      
//P_SCHOOL          CHAR(1)      
//M_JUMIN           CHAR(13)     
//M_CITY            VARCHAR2(20)

public class MemberDTO {
	private int mNo;
	private String mName;
	private String pName;
	private String pSchool;
	private String mJumin;
	private String mCity;
	private String pTel;
	
	
	public MemberDTO(int mNo, String mName, String pName, String pSchool, String mJumin, String mCity, String pTel) {
		this.mNo = mNo;
		this.mName = mName;
		this.pName = pName;
		this.pSchool = pSchool;
		this.mJumin = mJumin;
		this.mCity = mCity;
		this.pTel = pTel;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpSchool() {
		return pSchool;
	}

	public void setpSchool(String pSchool) {
		this.pSchool = pSchool;
	}

	public String getmJumin() {
		return mJumin;
	}

	public void setmJumin(String mJumin) {
		this.mJumin = mJumin;
	}

	public String getmCity() {
		return mCity;
	}

	public void setmCity(String mCity) {
		this.mCity = mCity;
	}
	
	public String getpTel() {
		return pTel;
	}

	public void setpTel(String pTel) {
		this.pTel = pTel;
	}
}