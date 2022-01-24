package akhilPack;

public class ZeroesToEnd {

	
	public static void zeroestoend(int a[]) {
	
		int b=a.length;
		int count=0;
		
		for (int i = 0; i <b; i++) 
		{
			if(a[i]!=0) {
			a[count++]=a[i];
			}
			while(count<b) 
			{
				a[count++]=0;
						
			}
				
		}
		
	}
		public static void main(String[] args) 
		{
			int a[]= {12,13,0,14,15,0,0,16};
			zeroestoend(a);
			for (int i = 0; i <a.length; i++) {
				System.out.print(a[i]+" ");
			}
		}
	}

