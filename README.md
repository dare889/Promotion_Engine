# Promotion_Engine

We need you to implement a simple promotion engine for a checkout process. Our Cart contains a list of single character SKU ids (A, B, C.	) over which the promotion engine will need to run.
The promotion engine will need to calculate the total order value after applying the 2 promotion types
•	buy 'n' items of a SKU for a fixed price (3 A's for 130)
•	buy SKU 1 & SKU 2 for a fixed price ( C + D = 30 )
The promotion engine should be modular to allow for more promotion types to be added at a later date (e.g. a future promotion could be x% of a SKU unit price). For this coding exercise you can assume that the promotions will be mutually exclusive; in other words if one is applied the other promotions will not apply
Test Setup
Unit price for SKU IDs A	50
B	30
C	20
D	15

Active Promotions
3 of A's for 130
2 of B's for 45 C & D for 30

Scenario A
1	* A	50
1	* B	30
1	* C	20

Total		
100
![image](https://user-images.githubusercontent.com/34261111/147998549-c2f62315-8865-4520-a23a-2c23aab2f78c.png)


Scenario	B	
5 * A		130 + 2*50
5 * B		45 + 45 + 30
1 * C		28

Total	370
![image](https://user-images.githubusercontent.com/34261111/147998508-354a8d8b-45bd-4da2-9bb1-4cb4474891bd.png)



Scenario C
3	* A	130
5	* B	45 + 45 + 1 * 30
1	* C	-
1	* D	30

Total	280

![image](https://user-images.githubusercontent.com/34261111/147998469-7bee4c9c-9603-4f63-ba61-ba7d085b85a4.png)



Scenario D
3	* A	130
5	* B	45 + 45 + 1 * 30
1	* C	-
2	* D	30 + 15

Total	295
![image](https://user-images.githubusercontent.com/34261111/147998623-98cf2d2e-ef24-4c4c-9220-08978d121032.png)

