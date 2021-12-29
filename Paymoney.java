package quationno1;
import java.util.*;
public class Paymoney 
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of transaction arry!");
int size = sc.nextInt();
int arr[] = new int[size];
System.out.println("enter the value of the array");
for(int x=0;x<size;x++)
{
arr[x]=sc.nextInt();

}
System.out.println("Enter the total no of targets that needs to be achieved");
int n= sc.nextInt();
for(int x=1;x<=n;x++)
{
System.out.println("enter the value of target");
int target=sc.nextInt();
int sum = 0;
int f = 0;
for(int y =0;y<size;y++) {
	sum = sum + arr[y];
	if(sum>=target) {
		f = 1;
		System.out.println("target achieved after"+(y+1)+"transaction\n");
		break;
		
	}
}
if(f == 0)
	System.out.println("Given  target is not achieved\n");
}
}
}
