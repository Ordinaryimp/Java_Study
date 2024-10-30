import java.util.Scanner;
class GuessNum 
{
	public static void main(String[] args) 
	{
		//生成[1,100]的随机整数
		int count = 1;
		Scanner input = new Scanner(System.in);
		int target = (int)(Math.random()*100)+1;		//[a,b] (Math.random()*b-a+1)+a
		System.out.println("请输入1-100的数字:");
		int guess = input.nextInt();

		while(guess!=target){
			
			if(guess>target){
				System.out.println("数大了");
			}
			if(guess<target){
				System.out.println("数小了");
			}
			guess = input.nextInt();
			count++;
				
		}
		input.close();
		System.out.println("恭喜你猜对了，你本次共猜了"+count+"次");
	}
}
