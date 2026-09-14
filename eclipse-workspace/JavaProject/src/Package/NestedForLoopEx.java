package Package;

public class NestedForLoopEx {

	public static void main(String[] args) {
		for( int i=0;i<4;i++)//0<3//1<3//0<4
		{
			for(int j=0;j<5;j++)//1<3//2<3//3<3//0<5/1<5
			{
			System.out.println(i+" "+j);//0 0 0 1 0 2 1 0 1 1  ///0 0 0 1 0 2 
			
			}
		//the execution of bigger for loop will start	
		}

	}

}
