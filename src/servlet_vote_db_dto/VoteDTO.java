package servlet_vote_db_dto;

import java.sql.Timestamp;
import java.util.Date;

//이름       널?       유형           
//--------- -------- ------------ 
//V_JUMIN   NOT NULL CHAR(13)     
//V_NAME             VARCHAR2(20) 
//M_NO               CHAR(1)      
//V_TIME             CHAR(4)      
//V_AREA             CHAR(20)     
//V_CONFIRM          CHAR(1)     

public class VoteDTO {
	private String vJumin;
	private String vName;
	private int mNo;
	private int vTime;
	private String vArea;
	private String vConfirm;
	
	public VoteDTO(String vJumin, String vName, int mNo, int vTime, String vArea, String vConfirm) {
		super();
		this.vJumin = vJumin;
		this.vName = vName;
		this.mNo = mNo;
		this.vTime = vTime;
		this.vArea = vArea;
		this.vConfirm = vConfirm;
	}

	public String getvJumin() {
		return vJumin;
	}

	public void setvJumin(String vJumin) {
		this.vJumin = vJumin;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public int getvTime() {
		return vTime;
	}

	public void setvTime(int vTime) {
		this.vTime = vTime;
	}

	public String getvArea() {
		return vArea;
	}

	public void setvArea(String vArea) {
		this.vArea = vArea;
	}

	public String getvConfirm() {
		return vConfirm;
	}

	public void setvConfirm(String vConfirm) {
		this.vConfirm = vConfirm;
	}
}