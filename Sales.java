import java.text.NumberFormat;
import java.util.ArrayList;

public class Sales {
	private String CostcoNo;
	private String UserNo;
	private String EmployeeNo;
	ArrayList<PurchaseItem> PurchaseList = new ArrayList<PurchaseItem>(); 
	private double SubTotalPrice;
	private double TotalPrice;
	private String SalesNo; 
	private int KioskID;
	private double Tax = 0;
	private double TaxRate = 0.1025;
	
	
	public Sales(String _CostcoNo, String _UserNo, String _EmployeeNo, ArrayList<PurchaseItem> _PurchaseList, int _KioskID) {		
		CostcoNo = _CostcoNo;
		UserNo = _UserNo;
		EmployeeNo = _EmployeeNo;
		PurchaseList = _PurchaseList;
		KioskID = _KioskID;
	}
	
	public String getCostcoNo() {
		return CostcoNo;
	}
	
	public String getUserNo() {
		return UserNo;
	}
	
	public String getEmployeeNo() {
		return EmployeeNo;
	}
	
	public int getKioskID() {
		return KioskID;
	}	
	
	public void Caculate() {
		for(int i=0; i <= PurchaseList.size() - 1; i ++) {
			SubTotalPrice += PurchaseList.get(i).getPurchasePrice();			
		}	
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);						
		nf.setMinimumFractionDigits(2);	
		Tax = Double.parseDouble(nf.format(SubTotalPrice * TaxRate));		
	}	
	
	public double getSubTotalPrice() {
		return SubTotalPrice;		
	}
	
	public double getTotalPrice() {
		return SubTotalPrice + Tax;		
	}	
	
	public double getTax() {								
		return Tax;
	}
	
	private void CreateSaleNo() {
		SalesNo ="S0000021561";
	}	
	public String GetSaleNo() {		
		return SalesNo;
	}
	
	public boolean SaveToDB(){		
		// Save purchase list to Database!
		CreateSaleNo();
		return true;
	}
	
	public boolean DoPayment() {
		return true;		
	}
	
	public void PrintReceipt() {
		System.out.println("========================Receipt========================");
		System.out.println("Member:" + getUserNo());
		for(int i = 0; i <= PurchaseList.size()-1 ; i++) {
			System.out.println("     " + PurchaseList.get(i).getProductNo() + "   " + PurchaseList.get(i).getProductName() + "  * " + PurchaseList.get(i).getPurchaseCnt() + "    " + PurchaseList.get(i).getPurchasePrice());
		}
		
		System.out.println("  SUBTOTAL    " + getSubTotalPrice());
		System.out.println("  TAX    " + getTax());	
		System.out.println("-------------------------------------------------------");
		System.out.println("  TOTAL    " + getTotalPrice());		
		System.out.println("");
	}
}
