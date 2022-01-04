package promotionEngine;

import java.util.*;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		Scanner inputObj = new Scanner(System.in);
		String[] prod_array = {"A","B","C","D"};
		for(int j = 0 ; j<4; j++) {
			System.out.print("Enter quantity of product ID "+prod_array[j]+" : ");
			int qty = inputObj.nextInt();
			
			for(int i = 0 ; i<qty; i++) {
				// Set type of products
	            Product p = new Product(prod_array[j]);
	            products.add(p);
			}
		}
		
		int totalPrice = calcTotalPrice(products);
		System.out.println("Total : "+totalPrice);
		
	}
	public static int calcTotalPrice(List<Product> products) {
		
		int countA = 0, priceA = 50;
		int countB = 0, priceB = 30;
		int countC = 0, priceC = 20;
		int countD = 0, priceD = 15;
		
		for(Product pr : products) {
			
			if(pr.id.toString().equals("A") ) {
				countA++;
			}
			if(pr.id.toString().equals("B") ) {
				countB++;
			}
			if(pr.id.toString().equals("C")) {
				countC++;
			}
			if(pr.id.toString().equals("D") ) {
				countD++;
			}
		}
		// Set Active Promotions
		int totalPriceA = (countA / 3) * 130 + (countA % 3 * priceA);
		int totalPriceB = (countB / 2) * 45 + (countB % 2 * priceB);
		int totalPriceC = countC * priceC;
		int totalPriceD = countD * priceD;
		if(countC >= 1 && countD>=1) {
			int countmax = Math.min(countC, countD);
			for(int i=0; i<countmax;i++) {
				totalPriceC = totalPriceC -5;
			}
		}
		
		return totalPriceA + totalPriceB + totalPriceC + totalPriceD;
		
	}

}
