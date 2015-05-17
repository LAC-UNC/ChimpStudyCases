package resources;

import utils.Addeable;
import utils.Geteable;
import utils.Item;
import utils.MessagesHelpers;

public class Position implements Addeable, Geteable{
	public Item item;
	public String name;
	
	public Position(String name){
		this.name = name;
	}
	
	@Override
	public void addItem(Item item) {
		this.item = item;
		MessagesHelpers.infoMessage("Item " + this.item.getItemName() + " is added to the position " + this.name + ".");
	}

	public Item getItem() {
		MessagesHelpers.infoMessage("Item " + this.item.getItemName() + " is going to be extracted from the position " + this.name + ".");
		Item temp = this.item;
		this.item = null;
		return temp;
	}
}
