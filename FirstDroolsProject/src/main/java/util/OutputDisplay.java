package util;

public class OutputDisplay {
	
	public void showText(String someText) {
		long time = System.currentTimeMillis();
		System.out.println(time + " - " + someText);
	}
}
