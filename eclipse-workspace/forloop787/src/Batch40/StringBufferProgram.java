package Batch40;
public class StringBufferProgram 
{
public static void main(String[] args) 
{
 String s1="manish";
   String s2=s1.concat("Tiwari");
 

   StringBuffer sb1= new StringBuffer("Manish");
                sb1=sb1.append(" Tiwari");
   System.out.println(sb1);             
}

}
