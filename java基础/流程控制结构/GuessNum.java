import java.util.Scanner;
class GuessNum 
{
	public static void main(String[] args) 
	{
		//����[1,100]���������
		int count = 1;
		Scanner input = new Scanner(System.in);
		int target = (int)(Math.random()*100)+1;		//[a,b] (Math.random()*b-a+1)+a
		System.out.println("������1-100������:");
		int guess = input.nextInt();

		while(guess!=target){
			
			if(guess>target){
				System.out.println("������");
			}
			if(guess<target){
				System.out.println("��С��");
			}
			guess = input.nextInt();
			count++;
				
		}
		input.close();
		System.out.println("��ϲ��¶��ˣ��㱾�ι�����"+count+"��");
	}
}
