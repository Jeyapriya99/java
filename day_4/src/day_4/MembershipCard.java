package day_4;

public class MembershipCard extends Card{
   private int ratings;

public MembershipCard(String holderName, String cardNumber, String expiryDate, int ratings) {
	super(holderName, cardNumber, expiryDate);
	this.ratings = ratings;
}

public int getRatings() {
	return ratings;
}

public void setRatings(int ratings) {
	this.ratings = ratings;
}


	public void display() {
		System.out.println("card details");
		System.out.println("card number" +  cardNumber);
		System.out.println("ratings" +  ratings);

}




   

}
   

