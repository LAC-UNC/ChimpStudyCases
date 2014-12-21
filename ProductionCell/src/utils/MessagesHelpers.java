package utils;

public class MessagesHelpers {
	
	public static void infoMessage(String info) {
		System.out.println("===INFO=== -|- " + info);
	}

	public static void checkCondition(boolean cond, String errorMsg) {
		if(cond) {
			System.out.println("===ERROR=== -|- " + errorMsg);
		}
	}
}
