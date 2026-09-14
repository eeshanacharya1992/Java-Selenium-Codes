package pocker;


	abstract class MRP{
		//2AM
		//2CM
		abstract void task1();
		abstract void task2();
		void task3() {
			System.out.println("Ececuteing task3 from abstract class");
		}
		static void task4() {
			System.out.println("Executeing task4 from abstract class");
		}
		
	}
	class GST extends MRP{
		//2CM
		void task3() {
			System.out.println("Ececuteing Method Over Rideing task3");
			super.task3();
		}
		static void task4() {
			
			System.out.println("Executeing Method Over Rideing task4 AMIR");
		
		}
		static void RUN() {
			System.out.println("Running");
		}
		
		void task1() {
			System.out.println("Executeing task1");
		}
		void task2() {
			System.out.println("Executeing task2");
		}
	}
	public class MethodOverrideingAssignmet17 extends GST{
		
		void task1() {
			System.out.println("Executeing task1 from main method");
		}
		void task2() {
			System.out.println("Executeing task2 from main method");
		}
		static void RUN() {
			System.out.println("Running slow from main method");
		}
		//MM
		public static void main(String[] args) {
			
			MethodOverrideingAssignmet17 ref=new MethodOverrideingAssignmet17();
			ref.task1();
			ref.task2();
			ref.task3();
			task4();
			RUN();
			

}}
