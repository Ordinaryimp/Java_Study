/*
switch�еı��ʽֻ�����ض����������͡�����:byte\short\char\ ö��(5.0)\String��7.0��
*/
class SwitchTest 
{
	public static void main(String[] args) 
	{
		int num = 8;

		int i = switch(num){
			case 1 ->1;
			case 2 ->2;
			case 3 ->3;
			case 4 ->4;
			case 5 ->5;
			case 6 ->6;
			default ->7; 
				
		};
		System.out.println(i);
		//ʹ��Switch-Caseʵ��:��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ�"
		int score = 59;
		switch(score/10){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("������");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("����");
			default:
				System.out.println("����ɼ�����");
		}
		//100-120֮����ѳ���100���޷������б���Ϊ����
		int score1 = 60;
		switch(score1/60){
			case 1:
				System.out.println("����");
				break;
			case 0:
				System.out.println("������");
				break;
		}
	}

}
