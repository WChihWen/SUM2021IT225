import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class SalesTest {
	
	private ArrayList<PurchaseItem> createPurchaseItem() {
		ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>(); 
		
				
		PurchaseItem tmpPurchase = new PurchaseItem();
		tmpPurchase.setProductNo("P0001");
		tmpPurchase.setProductName("Red Delicious apples");
		tmpPurchase.setUnits("WA Apple");
		tmpPurchase.setPurchaseCnt(1);
		tmpPurchase.setPurchasePrice(2.55);
		PurchaseList.add(tmpPurchase);	
		
		PurchaseItem tmpPurchase1 = new PurchaseItem();
		tmpPurchase1.setProductNo("P0001");
		tmpPurchase1.setProductName("Red Delicious apples");
		tmpPurchase1.setUnits("WA Apple");
		tmpPurchase1.setPurchaseCnt(1);
		tmpPurchase1.setPurchasePrice(2.55);
		PurchaseList.add(tmpPurchase1);
		
		PurchaseItem tmpPurchase2 = new PurchaseItem();
		tmpPurchase2.setProductNo("P0003");
		tmpPurchase2.setProductName("Wheat flour");
		tmpPurchase2.setUnits("WA Wheat flour");
		tmpPurchase2.setPurchaseCnt(1);
		tmpPurchase2.setPurchasePrice(4.56);
		PurchaseList.add(tmpPurchase2);
		
		return PurchaseList;	
	}
	
	@Test
	void testGetCostcoNo() {
		ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>();		
		Sales mySales = new Sales("CO000245", "M005486", "E0012334",PurchaseList,200);
		Assert.assertTrue(mySales.getCostcoNo().equals("CO000245"));
	}

	@Test
	void testGetUserNo() {
		ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>();
		Sales mySales = new Sales("CO000245", "M005486", "E0012334",PurchaseList,200);
		Assert.assertTrue(mySales.getUserNo().equals("M005486"));
	}

	@Test
	void testGetEmployeeNo() {
		ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>();
		Sales mySales = new Sales("CO000245", "M005486", "E0012334",PurchaseList,200);
		Assert.assertTrue(mySales.getEmployeeNo().equals("E0012334"));
	}

	@Test
	void testGetKioskID() {
		ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>();
		Sales mySales = new Sales("CO000245", "M005486", "E0012334",PurchaseList,200);
		Assert.assertTrue(mySales.getKioskID() == 200);
		
	}

	@Test
	void testGetSubTotalPrice() {
		ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>();
		PurchaseList = createPurchaseItem();
		Sales mySales = new Sales("CO000245", "M005486", "E0012334",PurchaseList,200);
		mySales.Caculate();
		Assert.assertTrue(mySales.getSubTotalPrice() == 9.66);
	}

	@Test
	void testGetTotalPrice() {
		ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>();
		PurchaseList = createPurchaseItem();
		Sales mySales = new Sales("CO000245", "M005486", "E0012334",PurchaseList,200);
		mySales.Caculate();
		Assert.assertTrue(mySales.getTotalPrice() == 10.65);
	}

	@Test
	void testGetTax() {
		ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>();
		PurchaseList = createPurchaseItem();
		Sales mySales = new Sales("CO000245", "M005486", "E0012334",PurchaseList,200);
		mySales.Caculate();
		Assert.assertTrue(mySales.getTax() == 0.99);
	}

}
