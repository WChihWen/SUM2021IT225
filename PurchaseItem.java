
public class PurchaseItem extends Product {
	private double PurchaseCnt; // count how many items were purchased.
	private double PurchasePrice; // total the price of these items.
	
	public double getPurchaseCnt() {		
		return PurchaseCnt;
	}	
	public void setPurchaseCnt(double _PurchaseCnt) {
		PurchaseCnt = _PurchaseCnt;
	}
	
	public double getPurchasePrice() {		
		return PurchasePrice;
	}	
	public void setPurchasePrice(double _PurchasePrice) {
		PurchasePrice = _PurchasePrice;		
	}
}
