package utils;

public class InitialContainer implements Geteable {

	private ItemGenerator ig = new ItemGenerator();
	
	@Override
	public Item getItem() {
		return ig.generateItem();
	}

}
