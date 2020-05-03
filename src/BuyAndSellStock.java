

public class BuyAndSellStock {

	public static void main(String[] args) {
	    int[] stocks = {7,1,5,3,6,4};
	    BuyAndSellStock obj = new BuyAndSellStock();
	    int maxProfit = obj.maxProfit(stocks);
	    System.out.println("Maximum Profit:" +maxProfit);
	}
	
	public int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0; i<prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i]-minPrice);
		}
	    return maxProfit;
	}

}
