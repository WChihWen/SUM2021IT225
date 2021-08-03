import java.util.ArrayList;
import java.util.Scanner;

public class Kiosks {
	static ArrayList<Product> ProductList = new ArrayList<Product>(); 
	static ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>(); 
	static int KiosksID = 22;
	static String costcoNo = "Seattle, WA";	
	private static void CreateProducts() {
		Product tmpProduct1 = new Product();
		tmpProduct1.setProductNo("P0001");
		tmpProduct1.setProductName("Red Delicious apples");
		tmpProduct1.setDescription("WA Apple");
		tmpProduct1.setUnits("lbs"); 
		tmpProduct1.setPerprice(2.55);
		tmpProduct1.setQuantity(100);
		ProductList.add(tmpProduct1);
		
		Product tmpProduct2 = new Product();		
		tmpProduct2.setProductNo("P0002");
		tmpProduct2.setProductName("Tomatoes");
		tmpProduct2.setDescription("WA Tomatoes");
		tmpProduct2.setUnits("lbs");
		tmpProduct2.setPerprice(1.99);
		tmpProduct2.setQuantity(50);
		ProductList.add(tmpProduct2);
		
		Product tmpProduct3 = new Product();
		tmpProduct3.setProductNo("P0003");
		tmpProduct3.setProductName("Wheat flour");
		tmpProduct3.setDescription("WA Wheat flour");
		tmpProduct3.setUnits("Bag");
		tmpProduct3.setPerprice(4.56);
		tmpProduct3.setQuantity(80);
		ProductList.add(tmpProduct3);
		
	}
	
	
	public static void main(String[] args) {	
			
		// Create Products to ArrayList.		
		CreateProducts();
		
		System.out.println("Please scan your membership card!");
		Scanner Scan = new Scanner(System.in);  // Create a Scanner object		
		String userNo = Scan.nextLine();  // Read user input			
		Members myMember = new Members(userNo);
		//Members myMember = new Members("M0002");
		
		System.out.println("Welcome '" + myMember.getFirstName() + " " + myMember.getLastName() + "' to Costco(" + costcoNo +")!");
		System.out.println("Please scan purchase Items!");
		//System.out.println("If needing to get help, enter [Help]");
		System.out.println("If you'd like to pay, enter [Pay]");	
		
		// Scan Purchase Item to ArrayList.
		AddPurchaseItemToList();
	
		System.out.println("You will do payment!");
		System.out.println("Please select the method of payment is [Card] or [Cash]?");		
		
		String PayM = Scan.nextLine();
		while(!PayM.equals("Card") && !PayM.equals("Cash")) {
			System.out.println("Please select the method of payment is [Card] or [Cash]?");	
			PayM = Scan.nextLine();
		}
		
		Sales mySales = new Sales(costcoNo, myMember.getUserNo(),"E0012334",PurchaseList,KiosksID);
		mySales.Caculate();
		if (mySales.SaveToDB()){
			if(mySales.DoPayment()){
				System.out.println("Payment successful!");
				System.out.println("If you'd like to print the reciept, please enter [Yes]!");				
				PayM = Scan.nextLine();				
				if (PayM.equals("Yes")) {
					mySales.PrintReceipt();		
				}
				System.out.println("Thanks for comming Cotsco!");
			}
		} else {
			System.out.print("Error saving data to database, please contact the manager!");
		}	
		Scan.close();
	}
	
	private static void AddPurchaseItemToList() {
		Scanner ScanItem = new Scanner(System.in);  // Create a Scanner object	
		String myItem = ScanItem.nextLine();
		while(!myItem.equals("Pay")) {
			switch(myItem) {
			  case "Help":	
				  // the Employee will help customer!
			    break;
			  default:				  
				  int idx = getProductListIndex(myItem);
				  if (idx != -1) {					  
					  PurchaseItem tmpPurchase = new PurchaseItem();
					  tmpPurchase.setProductNo(ProductList.get(idx).getProductNo());
					  tmpPurchase.setProductName(ProductList.get(idx).getProductName());
					  tmpPurchase.setUnits(ProductList.get(idx).getUnits());
					  tmpPurchase.setPurchaseCnt(1);
					  tmpPurchase.setPurchasePrice(ProductList.get(idx).getPerprice());
					  PurchaseList.add(tmpPurchase);
					  
					  System.out.println(ProductList.get(idx).getProductName() + "  * 1   " + ProductList.get(idx).getPerprice());
				  } else {
					  System.out.println("This item is not in product list!");
				  }
				  break;			  
			}
			myItem = ScanItem.nextLine();
		}		
	}
	private static int getProductListIndex(String _ItemNo) {		
		for(int i = 0 ; i <= ProductList.size() - 1; i ++) {
			if (ProductList.get(i).getProductNo().equals(_ItemNo)){				
				return i;
			}			
		}
		return -1;
	}
}
