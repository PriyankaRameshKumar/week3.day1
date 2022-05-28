package org.system;

public class Desktop extends Computer{
	
	
	//Single Inheritance
	//desktop class inherites the Computer class
	
	public void desktopSize() {
		System.out.println("This is the desktop size method");
	}
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
		
	}

}
