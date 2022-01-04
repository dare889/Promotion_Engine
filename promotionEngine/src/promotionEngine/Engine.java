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
		/*
		 * 3 of A's for 130
		   2 of B's for 45 
		   C & D for 30

		 */
		//3 pack for 130, then sum up the remaining value
		//Example : countA = 10, 10 / 3 * 130 + (10 % 3 * 50) = 390 + 50, total 440
		int totalPriceA = (countA / 3) * 130 + (countA % 3 * priceA); 
		
		
		//2 pack for 45, then sum up the remaining value
		//Example : countB = 10, 10 / 2 * 45 + (10 % 2 * 30) = 225 + 0, total 225
		int totalPriceB = (countB / 2) * 45 + (countB % 2 * priceB);
		
		
		int totalPriceC = countC * priceC;
		int totalPriceD = countD * priceD;
		// Check C and D qty, 
		//Example1 : C=1 D=1 -> 30
		//Example2 : C=2 D=1 , C is bigger then D and C,D is greater than or equal to 1
		//           Check C or D lowest-valued number, use the min number to count -5   (30-(20+15) = -5)
		if(countC >= 1 && countD>=1) {
			int countmax = Math.min(countC, countD);
			for(int i=0; i<countmax;i++) {
				totalPriceC = totalPriceC -5;
			}
		}
		
		return totalPriceA + totalPriceB + totalPriceC + totalPriceD;
		
	}

}
