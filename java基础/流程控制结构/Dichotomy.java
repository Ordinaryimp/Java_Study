import java.util.Scanner;

class  Dichotomy
{
	public static void main(String[] args) 
	{
		//���ַ�
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ŀ���������");
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
				System.out.println("�ҵ��ˣ��ڵ�"+m+"λ");
				break;
			}
			
		}
		if(i>j){
			System.out.println("û�ҵ�");
		}
			
		
	}
}
