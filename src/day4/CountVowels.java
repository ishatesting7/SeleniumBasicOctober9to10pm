package day4;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test Data -  I am learning java for the first time
		
		CountVowels obj = new CountVowels();
		int count = obj.CountVowelsDemo("I am new to Java learning");
		System.out.println("Count - "+count);
		int count1 = obj.CountVowelsDemo("I am new to Java learning I am new to Selenium");
		System.out.println("Count - "+count1);


	}
	
	int CountVowelsDemo(String m)
	{
		//Need to count - a, e, i, o and u
		int count = 0;
		char chArr[] = m.toCharArray();
		System.out.println("Length of Character Array - "+ chArr.length);
		//FOR LOOP, WHILE LOOP and DO WHILE LOOP
		//PRE INC, POST INC, PRE DEC and POST DEC
		for(int i = 0; i<chArr.length;i=i+1)
		{
			if(chArr[i]=='a'||chArr[i]=='e'||chArr[i]=='i'||chArr[i]=='o'||chArr[i]=='u'||chArr[i]=='A'||chArr[i]=='E'||chArr[i]=='I'||chArr[i]=='O'||chArr[i]=='U')
			{
				count = count + 1;
			}
		}
		
		System.out.println("Number of Vowel - "+ count);
		return count;
		
	}
}
