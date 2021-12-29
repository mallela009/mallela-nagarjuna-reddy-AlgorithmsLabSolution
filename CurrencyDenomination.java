package quationno2;

public class CurrencyDenomination 
{
public static void main(int arr[])
{
	for(int x=0; x<arr.length-1;x++) 
	{
		int max = arr[x];
		int i =x;
		for(int y=x+1;y<arr.length;y++) 
		{
		if(arr[y]>max)
		{
		max = arr[y];
		i = y;
		}
		}
		int temp = arr[x];
		arr[x]=arr[i];
		arr[i] = temp;
	}
}
}
