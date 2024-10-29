/*
如何获取一个随机数?
1.可以使用Java提供的API:Math类的random()
2.random()调用以后，会返回一个[0.0,1.0)范围的double型的随机数
3.需求1:获取一个[0,100]范围的随机整数?
4.需求:获取一个[a，b]范围的随机整数？
(整型)(数学随机()*(b-a+1)+a)
*/
class  RandomTest
{
	public static void main(String[] args) 
	{
		double d1 = Math.random(); 
		System.out.printf("d1=：%.2f",d1);

		int i1 = (int)(Math.random()*101);// [0,1.0)->[0.0,100.0]->[0,100]	[1,101)
		System.out.println("i1=："+ i1);

		i2 = (int)(Math.random()*100)+1;// [0,1.0)->[1.0,100.0]->[1,100] [1,101)
		System.out.println("i1=："+ i2);


	}
}
