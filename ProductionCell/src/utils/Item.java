package utils;

public class Item {

	private String itemName;
	
	public Item(String name) {
		this.itemName = name;
		MessagesHelpers.infoMessage("The item " + name + " has been created.");
	}

	public String getItemName() {
		return this.itemName;
	}
}
