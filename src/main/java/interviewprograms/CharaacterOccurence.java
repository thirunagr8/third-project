package interviewprograms;

public class CharaacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Amazon Indiaaaaaaaa";
		int count=0;
		char[] ch123 = str.toCharArray();
		//int n= str.length();
		//for (int i=0;i<n;i++) {
		//	for(char i:ch) {
		for (char c : ch123) {


			if(c=='a')
				count=count+1;
		}System.out.println(count);
	}

}