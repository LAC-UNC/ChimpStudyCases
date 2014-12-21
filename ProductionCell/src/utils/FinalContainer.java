package utils;

import java.util.ArrayList;

public class FinalContainer implements Addeable {

	public ArrayList<Item> items = new ArrayList<Item>();
	
	@Override
	public void addItem(Item item) {
		items.add(item);
		MessagesHelpers.infoMessage("Item " + item.getItemName() + " added to the final container.");
	}

}
