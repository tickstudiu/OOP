import java.util.*;

public class DiceBox {
	
	// DiceBox code
	private ArrayList<Dice> diceList;

	// constructor
	public DiceBox(){
		this.diceList = new ArrayList<Dice>();
	}

	public void addDice(Dice d){
		this.diceList.add(d);
	}

	// getter method
	public int getSizeOfDiceList(){
		return this.diceList.size();
	}

	public int getTotal(){
		int total = 0;
		for(int i = 0;i < getSizeOfDiceList();i++){
			total = total + this.diceList.get(i).getFace();
		}
		return total;
	}

	public void shake(){
		for(int i = 0;i < getSizeOfDiceList();i++){
			this.diceList.get(i).roll();
		}
	}

	public void printDices(){
		for(int i = 0;i < getSizeOfDiceList();i++){
			System.out.println((i + 1) + ". " + this.diceList.get(i).toString());
		}
	}
}