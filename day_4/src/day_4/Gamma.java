package day_4;

public class Gamma {
	static int a = 555;

    public static void main(String[] args) {
        Alpha objA = new Alpha();
        Beta objB1 = new Beta();
        Alpha objB2 = new Beta();
        Zeta objC1 = new Zeta();
        Beta objC2 = new Zeta();
        Alpha objC3 = new Zeta();
        objA.display();
        objB1.display();
        objB2.display();
        objC1.display();
        objC2.display();
        objC3.display();    }


}
