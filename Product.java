
public class Product {
	private String prodcutNo;
	private String productName;
	private String description;
	private String units;
	private double perprice; 
	private int quantity;
	
	
	public void setProductNo(String _prodcutNo) {
		prodcutNo = _prodcutNo;
	}
	
	public String getProductNo() {
		return prodcutNo;		
	}
	
	public void setProductName(String _productName) {
		productName = _productName;
	}
	public String getProductName() {
		return productName;		
	}
	
	
	public void setDescription(String _description) {
		description = _description;
	}
	public String getDescription() {
		return description;		
	}
	
	public void setUnits(String _units) {
		units = _units;
	}
	public String getUnits() {
		return units;		
	}
	
	public void setPerprice(double _perprice) {
		perprice = _perprice;
	}
	public double getPerprice() {
		return perprice;		
	}
	
	public void setQuantity(int _quantity) {
		quantity = _quantity;
	}
	public int getQuantity() {
		return quantity;		
	}
	
	
	
}

