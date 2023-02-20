package javaAbstarction;

public class Automation extends MultipleLanguage{

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Inside java method.");
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Inside selenium method.");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Inside ruby method.");
	}
	
	public static void main(String[] args) {
		
		Automation au = new Automation();
		au.java();
		au.python();
		au.ruby();
		au.selenium();
	}

}
