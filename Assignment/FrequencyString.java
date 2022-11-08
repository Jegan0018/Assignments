package problems;

public class FrequencyString {
	public static void main(String[] args) {
		String str="xyyyzzzabb",s="";
		int index=0;
		char c = 0;
		int length=str.length();
		for(int i=0;i<length;i++) {
			int count = 1;
			c=str.charAt(i);
			while(str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
				if(i>=length-1) {
					break;
				}
			}
			s+=c;
			if(count!=1) {
				s+=count;
			}
		}
		System.out.println(s);
	}
}
