import java.util.Scanner;
class AtmTest 
{
	public static void main(String[] args) 
	{	
		//�����������¼�˻����
		double balance=0.0;
		boolean flag = true;

		//�û�ѡ��
		Scanner input = new Scanner(System.in);

		do{
			//ATM����
			System.out.println("======ATM======");
			System.out.println("      1.���");
			System.out.println("      2.ȡ��");
			System.out.println("      3.��ʾ���");
			System.out.println("      4.�˳�");
			System.out.print("��ѡ��1-4��:");
				
			
			
			int selection = input.nextInt();

			switch(selection){
				case 1:
					System.out.println("����������:");
					double money1 = input.nextDouble();
					if(money1>0){
						balance += money1;
					}
					break;
				case 2:
					System.out.println("������ȡ����:");
					double money2 = input.nextDouble();
					if(money2 > 0 && money2 <= balance){
						balance-=money2;
					}
					break;
				case 3:
					System.out.println("����ǰ�Ľ��Ϊ:"+balance);
					break;
				case 4:
					flag=false;
					System.out.println("���˳�ϵͳ��ף��������죡�ټ���");
					break;
				default:
					System.out.println("������������������");
					break;
			}

		}while(flag);

		input.close();
		
		
		

	}
}
