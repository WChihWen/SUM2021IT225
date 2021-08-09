import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class MembersTest {	
	
	@Test
	void testGetUserNo() {		
		Members myMember = new Members("M0001");
		Assert.assertTrue(myMember.getUserNo().equals("M0001"));
		
	}
	
	@Test
	void testGetFirstName() {
		Members myMember = new Members("M0001");
		Assert.assertTrue(myMember.getFirstName().equals("Chih Wen"));
	}

	@Test
	void testGetLastName() {
		Members myMember = new Members("M0001");
		Assert.assertTrue(myMember.getLastName().equals("Wang"));
	}

	@Test
	void testGetEmail() {		
		Members myMember = new Members("M0001");
		Assert.assertTrue(myMember.getEmail().equals("Chih.W.Wang@seattlecolleges.edu"));
	}

	@Test
	void testGetDateadded() {	
		Members myMember = new Members("M0001");
		Assert.assertTrue(myMember.getDateadded().equals("01/01/2021"));
	}

	@Test
	void testGetDateexpired() {		
		Members myMember = new Members("M0001");
		Assert.assertTrue(myMember.getDateexpired().equals("12/31/2021"));
	}

}
