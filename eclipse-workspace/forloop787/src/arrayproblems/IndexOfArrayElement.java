package arrayproblems;

public class IndexOfArrayElement {

	public static void main(String[] args) {
		int no[]=new int[5];
        no[0]=21;
        no[1]=23;
        no[2]=98;
        no[3]=98;
        no[4]=765;
        int notobechecked=23;
        
        for(int i=0;i<=no.length-1;i++)
        {
                if(notobechecked==no[i])
                {
                        System.out.println("This is the index of 23="+i);
                        
                }
                else
                {
                        System.out.println("Sorry we could not find this element in array");
                         
                }
	}


	

}}
