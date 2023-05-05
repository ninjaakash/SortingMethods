package P;

public class Sorting {
	public static void main(String[] args) {
		int[] arr= {12,45,62,32,12,5};
		insertionSort(arr);
		for(int x:arr)System.out.println(x);
	}
	public static void insertionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[k]>arr[j])k=j;
			}
			if(i!=k)
			{
				arr[i]=arr[i]+arr[k];
				arr[k]=arr[i]-arr[k];
				arr[i]=arr[i]-arr[k];
			}
		}
	}
}
