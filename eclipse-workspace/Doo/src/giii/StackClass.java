package giii;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack qa= new Stack();
		/*qa.addElement("stack");
		qa.addElement("heap");
		qa.addElement("string builder");
		qa.addElement("string buffer");
		System.out.println(qa);
		qa.pop();
		System.out.println(qa);
		System.out.println(qa.peek());*/
		qa.push("TestNG");
		qa.push("Cucumber");
		qa.push("POM");
		qa.push("Jenkins");
		qa.push("GITHUB");
		qa.push("Intellij");
		System.out.println(qa);
		System.out.println(qa.search("Jenkins"));

	}

}
