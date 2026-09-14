package pocker;

public class Class10 {
    //       Constructor overloading
/*developing multiple constructors but variation in argument list is constructor overloading
* we can call same constructor more than once by calling object more than once 
* 
*
*/
Class10(){
System.out.println("1");
}
Class10(String b){
System.out.println("2");
}
Class10(int a){
System.out.println("3");
}
Class10(String v, int y){

System.out.println("4");
}
Class10(int x, int z){
System.out.println("5");
}
Class10(double f, float d){
System.out.println("6");
}
Class10(String r, char e){
System.out.println("7");
}
public static void main(String[] args) {
new Class10();
new Class10("Mumbai");
new Class10(23);
new Class10("India", 1);
new Class10();
new Class10(333, 444);
new Class10(8.8, 9.9f);
new Class10("Best", 'm');
}
}
