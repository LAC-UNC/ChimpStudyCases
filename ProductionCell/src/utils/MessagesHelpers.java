package utils;

public class MessagesHelpers {
	
	public static void infoMessage(String info) {
		System.out.println("===INFO=== -|- " + info);
	}
	
	public static void warningMessage(String wrn) {
		System.out.println("===WARN=== -|- " + wrn);
	}

	public static void errorMessage(String err) {
		System.out.println("===ERROR=== -|- " + err);
	}
	
	public static void checkCondition(boolean cond, String errorMsg) {
		if(cond) {
			errorMessage(errorMsg);
		}
	}
}
