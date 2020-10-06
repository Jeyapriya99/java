package day_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Select card");
		System.out.println("1.Payback card");
		System.out.println("2.Membership card");
		Scanner scanner = new Scanner (System.in);
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter card details");
			String holderName = scanner.nextLine();
			String cardNumber = scanner.nextLine();
			String expiryDate = scanner.nextLine();
			System.out.println(holderName + "|" +cardNumber + "|" +expiryDate);
			System.out.println("Enter points earned");
			int pointsEarned = scanner.nextInt();
			System.out.println("Enter amount");
			double totalAmount = scanner.nextDouble();
			PayBackCard pbc = new PayBackCard(holderName,cardNumber,expiryDate,pointsEarned,totalAmount);
			pbc.display();
			break;
		case 2:
			System.out.println("Enter card details");
			String holderName2 = scanner.nextLine();
			String cardNumber2 = scanner.nextLine();
			String expiryDate2 = scanner.nextLine();
			System.out.println(holderName2 + "|" +cardNumber2 + "|" +expiryDate2);
			System.out.println("Enter ratings");
			int ratings = scanner.nextInt();
			MembershipCard msc = new MembershipCard(holderName2,cardNumber2,expiryDate2,ratings);
			msc.display();
			break;
			
			
		}
		

	}

}
