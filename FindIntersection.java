package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr= {3,2,11,4,6,7};
		int[] trr= {1,2,8,4,9,7};
		int[] result=new int[10];
		int m=0;
		
		for(int i=0;i<arr.length;++i)
		{
			int flag=0;
			for(int j=0;j<trr.length;++j)
			{
				if(arr[i]==trr[j])
					flag=1;
					
			}
			if(flag==1)
			{
				result[m]=arr[i];
						m=m+1;
			}
				
		}
		System.out.println(" The elements that are matching in both the arrays are: ");
		for(int i=0;i<m;++i)
			System.out.println(" "+result[i]);

	}

}
