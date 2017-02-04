public class Jar{

	private String itemName;
	private int maxNumberItems;

	
	public Jar(String itemName, int maxNumberItems){
		this.itemName = itemName;
		this.maxNumberItems = maxNumberItems;
	}

	public void test(){
		System.out.println(itemName);
		System.out.println(maxNumberItems);
	}
}