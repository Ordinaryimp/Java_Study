/*
��δӼ��̻�ȡ��ͬ����(�����������͡��ַ�������)�ı���:ʹ��ɨ������
1.ʹ��ɨ���ǻ�ȡ��ͬ�������ݵĲ���
����1����������java.util.Scanner
����2���ṩ(�򴴽�)һ��ɨ�������ʵ��
����3������ɨ�������еķ�������ȡָ�����͵ı���
����4���ر���Դ������ɨ�������Close()
*/

//�������������������䡢������ء����Ƿ�������Ա�����.
import java.util.Scanner;

class ScannerTest 
{
	public static void main(String[] args) 
	{	
		//����һ��Scannerʵ��
		Scanner scan = new Scanner(System.in);
		System.out.println("��ӭ�����ҹ�����վ����ְ�ߣ�");
		System.out.print("������������ʵ������");
		String name =scan.next();

		System.out.print("�������������䣺");
		int age = scan.nextInt();

		System.out.print("��������������(kg)��");
		int weight = scan.nextInt();

		System.out.print("�������������(cm)��");
		int height = scan.nextInt();

		System.out.print("�Ƿ��飺(true\\false)");
		boolean isMarried = scan.nextBoolean();

		System.out.print("�Ƿ��й������飺(true\\false)");
		boolean isWorked = scan.nextBoolean();
		String workLength=""; 
		if(isWorked)
		{
			System.out.print("��ѡ�������� 1:1-3�� 2:4-9�� 3:10������");
			byte wkLength = scan.nextByte();
			if(wkLength==1)
			{
				workLength="1-3��";
			}
			if(wkLength==2)
			{
				workLength="4-9��";
			}
			if(wkLength==3)
			{
				workLength="10������";
			}
		}
		else{
			workLength="��";
		}
		System.out.println("ע����Ϣ��д��ϣ���ȷ����������Ƿ���ȷ");
		System.out.println("������"+name+"���䣺"+age+"���أ�"+weight+"��ߣ�"+height+"�Ƿ���䣺"+isMarried+"��������:"+workLength);

		scan.close(); //GC�������scanner����Ҫ��scan.close()�ֶ��ͷ���Դ�����������ڴ�й©

	}
}
