package interviewprograms;
public class OnlynumberstobePrinted {
	public static void main(String[] args) {
		String Str = "Welcome1to2@=/myworld3";
		int n  =Str.length();
		//int count = 0;
		char[] ch = Str.toCharArray();
		for (int i = 0;i<n;i++)
		{
			if (ch[i]/1>=48 &&ch[i]/1<=57) {

				System.out.println(ch[i]);
				//int ascii =(int)ch[i];
				//if(ascii == 65 to 91 && 95 to 122)
			}


			//String SrAll = Str.replaceAll("[^0-9]", "");
			//	String all = Str.replaceAll("\\D", "");
			//System.out.println(all);
		}
	}}