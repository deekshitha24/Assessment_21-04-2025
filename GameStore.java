package purchasings;
import java.util.Scanner;
	
public class GameStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("Select the options: "
					+ "1. Call of Warfare - ₹1500"
					+ "2. Speed Racers - ₹1200\r\n"
					+ "3. Mystery Mansion - ₹1000\r\n"
					+ "4. Pixel Adventure - ₹800\r\n"
					+ "5. Puzzle Mania - ₹500\r\n"
					+ "6. Checkout / Exit\r\n");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			
			case 1:{
				
				System.out.println("Game(s) added to your cart!");
				System.out.println(1500);
				System.out.println("*********************");
				continue;
			}
			case 2:{
				System.out.println("Game(s) added to your cart!");
				System.out.println(1200);
				System.out.println("*********************");
				continue;
			}
			case 3:{
				System.out.println("Game(s) added to your cart!");
				System.out.println(1000);
				System.out.println("*********************");
				continue;
			}
			case 4:{
				System.out.println("Game(s) added to your cart!");
				System.out.println(800);
				System.out.println("*********************");
				continue;
			}
			case 5:{
				System.out.println("Game(s) added to your cart!");
				System.out.println(500);
				continue;
			}
			case 6:{
				System.out.println("Checking out");
				System.exit(0);
			}
			default:{
				System.out.println("The sum up of all the numbers is : 4000");
				break;
			}
			}
		}
	}
}
