import java.util.Scanner;
class AtmTest 
{
	public static void main(String[] args) 
	{	
		//定义变量，记录账户金额
		double balance=0.0;
		boolean flag = true;

		//用户选择
		Scanner input = new Scanner(System.in);

		do{
			//ATM界面
			System.out.println("======ATM======");
			System.out.println("      1.存款");
			System.out.println("      2.取款");
			System.out.println("      3.显示金额");
			System.out.println("      4.退出");
			System.out.print("请选择（1-4）:");
				
			
			
			int selection = input.nextInt();

			switch(selection){
				case 1:
					System.out.println("请输入存款金额:");
					double money1 = input.nextDouble();
					if(money1>0){
						balance += money1;
					}
					break;
				case 2:
					System.out.println("请输入取款金额:");
					double money2 = input.nextDouble();
					if(money2 > 0 && money2 <= balance){
						balance-=money2;
					}
					break;
				case 3:
					System.out.println("您当前的金额为:"+balance);
					break;
				case 4:
					flag=false;
					System.out.println("已退出系统，祝您生活愉快！再见！");
					break;
				default:
					System.out.println("输入有误，请重新输入");
					break;
			}

		}while(flag);

		input.close();
		
		
		

	}
}
