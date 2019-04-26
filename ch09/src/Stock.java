
public class Stock {
	private String Symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	//constructor
	public Stock(String Symbol,String name,double previousClosingPrice,double currentPrice) {
		this.Symbol = Symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}
	public double getChangePercent() {
		return (currentPrice-previousClosingPrice)/previousClosingPrice;
	}
	
	public static void main(String[] args) {
		Stock s = new Stock("ORCL","Oracle Corporation",34.5,34.35);
		System.out.println("The changePercent is "+(100*s.getChangePercent())+"%");
	}
}