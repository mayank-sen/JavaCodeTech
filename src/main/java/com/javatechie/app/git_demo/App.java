package com.javatechie.app.git_demo;

/**
 * Hello world!
 *
 */
public class App {
	public void addData(String data) {

		System.out.println("data = " + data);
		if (data.equals("javatechie")) {
			System.out.println(Constant.consVar);
		}
	}
	
	public void doSomething()
	{
		System.out.println("I am doing Something");
	}
	
	public void doOtherThing()
	{
		System.out.println("I am doing other things");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
