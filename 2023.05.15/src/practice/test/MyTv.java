package practice.test;

public class MyTv {

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		
		myTv.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();

	}

}
