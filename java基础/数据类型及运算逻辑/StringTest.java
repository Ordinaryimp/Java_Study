/*
基本数据类型与字符串的运算
1.字符串类，属于引用数据类型。
2.字符串类型的变量，可以使用一对“”的方式进行赋值。
一、关于string的理解
1.string类，属于引用数据类型，俗称字符串。
2.String类型的变量，可以使用一对""的方式进行赋值。
3.String声明的字符串内部，可以包含0个，1个或多个字符。
二、String与基本数据类型变量间的运算
1.这里的基本数据类型包括boolean在内的8种。
2.String与基本数据类型变量间只能做连接运算，使用"+"表示。
结果是支付穿类型 
*/
class StringTest 
{
	public static void main(String[] args) 
	{
		String str1 = "人机";
		System.out.println(str1);
		System.out.println("str1");
		System.out.println("Hello World!");
		String str2 ="";

		int num = 1;
		boolean b1 = true;
		String str3 = "hello";
		String str4=str3+b1+num;
		System.out.println(str4);

		//如何将String类型的变量转换为基本数据类型？用Intege类
		String str5 = num+"";
		int num1=Integer.parseInt(str5);
		System.out.println(str5);

		String s = """
                   SELECT * FROM
                     users
                   WHERE id > 100
                   ORDER BY name DESC
                   """;
        	System.out.println(s);

	}
}
