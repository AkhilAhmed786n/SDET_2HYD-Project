package akhilPack;

public class AspireCode2 {
	
	public static void main(String[] args) {
		
		String str="good noon madam";
		
		String[] s1 = str.split(" ");
		
		for (int i = 0; i < s1.length; i++) 
		{
			  String s2 = s1[i];
			for (int j = 0; j < s2.length(); j++) 
			{
				for (int j2 = j+1; j2 < s2.length(); j2++) {
					
				
				if(s1[i].charAt(j)==s1[i].charAt(j2))
				{
					System.out.println(s1[i].charAt(j));
					
				}
				}
			}
			
		}
	}

}
