/*��ʶ������������(����Ҫ���أ���(���򣬱��벻ͨ��)
��26��Ӣ����ĸ��Сд��0-9����$���
���ֲ����Կ�ͷ.
������ʹ�ùؼ��ֺͱ����֣����ܰ����ؼ��ֺͱ�����
JAVA���ϸ����ִ�Сд�����������ơ�
��ʶ�����ܰ����ո�

��ʶ���������淶
����:�൥�����ʱ������ĸ��Сд��xxxyyyzzz.
���磺java.lang��com.atguigU.S.Bean
�������ӿ���:�൥�����ʱ�����е��ʵ�����ĸ��д��xxxyyyzz
���磺HelloWorld���ַ�����ϵͳ��
������:�൥�����ʱ����һ����������ĸСд���ڶ������ʿ�ʼÿ����������ĸ��д��xxxyyyzz
��������
���磺���䣬���ƣ�������������������������ȡ����
������:������ĸ����д.�൥��ʱÿ���������»������ӣ�xxXYZZZ
���磺���ֵ��PI��Ĭ������

Java�еı���������������������
������������(8��):
����:byte\short\int\long
������:float\double
�ַ���:char
������:boolean

*/


class IDentiferText{
	public static void main(String[] arges){
		int a = 12;
		int age = 23;
		char gender = '��';
		float heigh;
		//����float���ͱ���ʱ����Ҫ�ṩ��׺ f �� F
		heigh = 1.7f;
		double heigh1;
		heigh1 = 1.750965;
		System.out.println(a);
		System.out.println("age="+age);
		System.out.println(gender);
		System.out.println(heigh);
		System.out.println(heigh1);
		//����long���ͱ���ʱ����Ҫ�ṩ��׺ L �� l
		long tel = 12131378L;
		System.out.println(tel);
		System.out.println(0.1 + 0.2);	//0.30000000000000004	
		//��������float �� double�����ö����Ƶ� IEEE 754 ��׼��ʾ����
		//ĳЩʮ����С�������� 0.1 �� 0.2���ڶ��������� ����ѭ�� �ġ���ЩС��ֻ�ܱ����ƴ洢����˻����΢С����
	}
}