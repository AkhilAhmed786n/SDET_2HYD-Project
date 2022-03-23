package akhilPack;

public class RevUnique {
	
	public static void main(String[] args) {
		
		String s="apPle";
		String s1 = s.toUpperCase();
		char[] s2 = s1.toCharArray();
		String s3="";
		
		for (char ch='A'; ch<'Z'; ch++) {
			int count=0;
			
			for (int i =0 ; i <=s2.length-1; i++) {
				
				if (s2[i]==ch) {
					count++;					
				}
			}
			if (count>0) {
				System.out.println("count of "+ch+" is "+count);
				s3=s3+ch;
				}
			}
		System.out.println(s3);
		
			
		}
	}


