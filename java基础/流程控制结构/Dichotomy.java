import java.util.Scanner;

class  Dichotomy
{
	public static void main(String[] args) 
	{
		//二分法
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入目标查找数：");
		int target = scan.nextInt();
		int[] a = {12,24,45,67,90};
		int i = 0;
		int j = a.length-1;
		while(i<=j){
			int m = (i+j)>>1;
			if(target>a[m]){
				i=m+1;
			}
			if(target<a[m]){
				j=m-1;
			}
			if(target==a[m]){
				System.out.println("找到了，在第"+m+"位");
				break;
			}
			
		}
		if(i>j){
			System.out.println("没找到");
		}
			
		
	}
}
