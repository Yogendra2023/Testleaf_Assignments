package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("Desktop size is 14 inches.");

	}
	
	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize();
	}
}
