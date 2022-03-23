package akhilPack;

public class AspireCode4 {
	
	public static void main(String[] args) {
		
		String s = "ShaKeel";
		String s1 = s.toLowerCase();
	
		
//		StringBuffer sb=new StringBuffer();
		
		for (int i = 0; i < s1.length(); i++) 
		{
			
			if(i%2==0)
			{
//				sb.append(Character.toUpperCase(s.charAt(i)));
				System.out.print(Character.toLowerCase(s1.charAt(i)));
			}
			else
			{
//				sb.append(Character.toLowerCase(s.charAt(i)));
				System.out.print(Character.toUpperCase(s1.charAt(i)));
			}
			
		}
//		System.out.println(sb);
	}

}
