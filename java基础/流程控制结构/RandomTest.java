/*
��λ�ȡһ�������?
1.����ʹ��Java�ṩ��API:Math���random()
2.random()�����Ժ󣬻᷵��һ��[0.0,1.0)��Χ��double�͵������
3.����1:��ȡһ��[0,100]��Χ���������?
4.����:��ȡһ��[a��b]��Χ�����������
(����)(��ѧ���()*(b-a+1)+a)
*/
class  RandomTest
{
	public static void main(String[] args) 
	{
		double d1 = Math.random(); 
		System.out.printf("d1=��%.2f",d1);

		int i1 = (int)(Math.random()*101);// [0,1.0)->[0.0,100.0]->[0,100]	[1,101)
		System.out.println("i1=��"+ i1);

		i2 = (int)(Math.random()*100)+1;// [0,1.0)->[1.0,100.0]->[1,100] [1,101)
		System.out.println("i1=��"+ i2);


	}
}
