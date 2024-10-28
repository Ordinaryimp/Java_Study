/*
2.说明：
当“-”两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换原则进行处理。
支持连续赋值。
：/=、%=操作，不会改变变量本身的数据类型
*/

class setvalue
{
	public static void main(String[] args) 
	{
		int num1 = 1;
		//连续赋值
		int a,b;
		a=b=3;
		byte c=9;
		c+=8;
		int i=1;
		i*=0.1;
		System.out.println(a+b);
		System.out.println(i); //0
		a=10;
		a=a+(a++)+(++a);	//10+10+12
		System.out.println(a);

		int num=7;
		int num2=-7;
		System.out.println(num<<1);
		System.out.println(num<<2);
		System.out.println(num<<3);
		System.out.println(num<<28);
		System.out.println(num<<29);

		System.out.println(num>>1);
		System.out.println(num>>2);
		System.out.println(num>>3);
		System.out.println(num>>28);
		System.out.println(num>>29);


		System.out.println(num2<<1);
		System.out.println(num2<<2);
		System.out.println(num2<<3);

		System.out.println(num2>>4);
		System.out.println(num2>>10);
		System.out.println(num2>>3);
		System.out.println(num2>>1);
		System.out.println(num2>>2);

		System.out.println(~0);
		System.out.println(~6);
		System.out.println(~(-10));
		
		//交换两个数			或设立中间变量进行交换(推荐)
		int m=18;
		int n=23;
		m=m^n;			//缺点：实用性差，不能用于非数值类型
		n=n^m;
		m=m^n;
		System.out.println(m);
		System.out.println(n);

		m=m+n;		//弊端：两数和超出上限会溢出报错   
		n=m-n;
		m=m-n;
		
		//1. 所有正整数的按位取反是其本身+1的负数

		//2. 所有负整数的按位取反是其本身+1的绝对值

		//3. 零的按位取反是 -1（0在数学界既不是正数也不是负数


	}
}
