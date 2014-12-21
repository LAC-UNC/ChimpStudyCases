package utils;


public class ItemGenerator {
	int index = 0;
	
	public Item generateItem() {
		return new Item( "item" + new Integer(this.index++).toString() );
	}
}
