public class Foo{
	public static void main(String[] args) {
		
		Dice d1 = new Dice();
		System.out.println(d1.toString());
		d1.roll();
		System.out.println(d1.toString());

		DiceBox box = new DiceBox();
		box.addDice(d1);
		box.addDice(new Dice());
		box.addDice(new Dice());

		System.out.println("Before shaking: total = " + box.getTotal());
		box.shake();
		System.out.println("After shaking: total = " + box.getTotal());

		box.printDices();

	}
}