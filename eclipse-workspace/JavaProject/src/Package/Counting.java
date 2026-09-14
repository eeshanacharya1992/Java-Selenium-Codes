package Package;

public class Counting {

	public static void main(String[] args) {
		String a= "Apple";int count=0; String b= a.toLowerCase(); int temp=0;

		for(int i=0;i<b.length();i++)

		{

		if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u')

		{ System.out.println("Given string contains vowel "+b.charAt(i)+" at the index "+i);

		count++;


		}

		else

		{

		System.out.println("Given string contains Consonant "+b.charAt(i)+" at the index"+i);

		temp++;

		}

		}

		System.out.println("The vowels are "+count);

		System.out.println("The consonants are"+temp);

		}


	}


