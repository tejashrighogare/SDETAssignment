package Occurances;


	abstract class Bike2{  
		  abstract void run();  
		}  
		class Honda4 extends Bike2{  
		void run(){System.out.println("running safely");}  
		public static void main(String args[]){  
		  
			Honda4 obj=new Honda4();
		 obj.run();  
		}  
		}  

