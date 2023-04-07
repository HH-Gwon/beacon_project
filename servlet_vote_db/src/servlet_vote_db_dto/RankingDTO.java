package servlet_vote_db_dto;

import java.sql.Timestamp;
import java.util.Date;

//이름       널?       유형           

//--------- -------- ------------
//P_CODE   NOT NULL CHAR(2)      
//P_NAME            VARCHAR2(20) 
//P_INDATE          DATE         
//P_READER          VARCHAR2(20) 
//P_TEL1            CHAR(3)      
//P_TEL2            CHAR(4)      
//P_TEL3            CHAR(4)     

public class RankingDTO {
	private int rNo;
	private String rName;
	private int rRanking;
	
	public RankingDTO(int rNo, String rName, int rRanking) {
		super();
		this.rNo = rNo;
		this.rName = rName;
		this.rRanking = rRanking;
	}

	public int getrNo() {
		return rNo;
	}

	public void setrNo(int rNo) {
		this.rNo = rNo;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public int getrRanking() {
		return rRanking;
	}

	public void setrRanking(int rRanking) {
		this.rRanking = rRanking;
	}
}