package week07;

class Dice {
	private int face;
	int roll() {
		face = (int)(Math.random() * 6) + 1;
		return face;
	}
}
public class DiceTest{
	public static void main(String[] args){
		Dice dice = new Dice();
		System.out.println("�ֻ��� ���� : " + dice.roll());
	}
}
