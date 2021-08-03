import java.util.ArrayList;
public class Members {
	private String UserNo;	
	private int Idx = 0;
	ArrayList<People> MemberList = new ArrayList<People>(); 
	
	private void CreateMembers() {	
		People tmpPeople = new People();
		tmpPeople.setNo("M0001");
		tmpPeople.setFirstName("Chih Wen");
		tmpPeople.setLastName("Wang");
		tmpPeople.setEmail("Chih.W.Wang@seattlecolleges.edu");	
		tmpPeople.setDateadded("01/01/2021");	
		tmpPeople.setDateexpired("12/31/2021");		
		MemberList.add(tmpPeople);
	
		People tmpPeople1 = new People();
		tmpPeople1.setNo("M0002");
		tmpPeople1.setFirstName("Jack");
		tmpPeople1.setLastName("Lin");
		tmpPeople1.setEmail("Jack.Lin@seattlecolleges.edu");	
		tmpPeople1.setDateadded("05/01/2021");	
		tmpPeople1.setDateexpired("05/31/2022");	
		MemberList.add(tmpPeople1);
	}
	
	private void SetListIdx(String _userNo) {
		for(int i = 0 ; i <= MemberList.size() - 1; i ++) {			
			if (MemberList.get(i).getNo() == _userNo){
				Idx = i;
			}			
		}
	}	
	
	public Members(String _userNo) {
		CreateMembers();// Create members because we did not use DB.
		UserNo = _userNo;
		SetListIdx(UserNo); // Set the index of userNo in MemberList. It is just like as select member from people where UserNo = _userNo in DB.
	}		
	
	public String getUserNo() {
		return MemberList.get(Idx).getNo();
	}
	
	public String getFirstName() {
		return MemberList.get(Idx).getFirstName();
	}
	
	public String getLastName() {
		return MemberList.get(Idx).getLastName();
	}
	
	public String getEmail() {
		return MemberList.get(Idx).getEmail();
	}	
	
	public String getDateadded() {
		return MemberList.get(Idx).getDateadded();
	}	
	
	public String getDateexpired() {
		return MemberList.get(Idx).getDateexpired();
	}
			
	public void reNewMember() {
		
	}

}
