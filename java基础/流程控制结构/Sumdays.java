//����:��д����:�Ӽ���������2023��ġ�Month���͡�Day����Ҫ��ͨ������������������Ϊ2023��ĵڼ���.
/*

switch-case ��if-else֮���ת��
�����з��ǿ���ʹ��switch-case�ṹ�ĳ����������Ը�дΪif-else����֮��������
�����У����һ����������ȿ���ʹ��switch-case��
�ֿ���ʹ��if-else��ʱ���Ƽ�ʹ��switch-case:
Ϊʲô?switch-case�����if-elseЧ���Ըߡ�

*/
import java.util.Scanner;

class  Sumdays
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		System.out.println("�������·�");
		int month = input.nextInt(); 

		System.out.println("����������");
		int days = input.nextInt(); 

		input.close();
		//�����û��������ݺϷ���������������ʽ����
		//��ʽһ��
		int sumdays=0;
		switch(month){
			case 1:
				sumdays=days;
				break;
			case 2:
				sumdays=31+days;
				break;
			case 3:
				sumdays=31+28+days;
				break;
			case 4:
				sumdays=31+28+31+days;
				break;
			case 5:
				sumdays=31+28+31+30+days;
				break;
			case 6:
				sumdays=31+28+31+30+31+days;
				break;
			case 7:
				sumdays=31+28+31+30+31+30+days;
				break;
			case 8:
				sumdays=31+28+31+30+31+30+31+days;
				break;
			case 9:
				sumdays=31+28+31+30+31+30+31+31+days;
				break;
			case 10:
				sumdays=31+28+31+30+31+30+31+31+30+days;
				break;
			case 11:
				sumdays=31+28+31+30+31+30+31+31+30+31+days;
				break;
			case 12:
				sumdays=31+28+31+30+31+30+31+31+30+31+30+days;
				break;
		}
		//��ʽ����
		switch(month){
			case 12:
				sumdays+=30;
			case 11:
				sumdays+=31;
			case 10:
				sumdays+=30;
			case 9:
				sumdays+=31;
			case 8:
				sumdays+=31;
			case 7:
				sumdays+=30;
			case 6:
				sumdays+=31;
			case 5:
				sumdays+=30;
			case 4:
				sumdays+=31;
			case 3:
				sumdays+=28;
			case 2:
				sumdays+=31;
			case 1��
				sumdays+=days;
		}
		System.out.println(sumdays);
	}
}
