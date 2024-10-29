/*
如何从键盘获取不同类型(基本数据类型、字符串类型)的变量:使用扫描器类
1.使用扫描仪获取不同类型数据的步骤
步骤1：导包导入java.util.Scanner
步骤2：提供(或创建)一个扫描仪类的实例
步骤3：调用扫描仪类中的方法，获取指定类型的变量
步骤4：关闭资源，调用扫描仪类的Close()
*/

//输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况.
import java.util.Scanner;

class ScannerTest 
{
	public static void main(String[] args) 
	{	
		//创建一个Scanner实例
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎来到找工作网站，求职者：");
		System.out.print("请输入您的真实姓名：");
		String name =scan.next();

		System.out.print("请输入您的年龄：");
		int age = scan.nextInt();

		System.out.print("请输入您的体重(kg)：");
		int weight = scan.nextInt();

		System.out.print("请输入您的身高(cm)：");
		int height = scan.nextInt();

		System.out.print("是否结婚：(true\\false)");
		boolean isMarried = scan.nextBoolean();

		System.out.print("是否有工作经验：(true\\false)");
		boolean isWorked = scan.nextBoolean();
		String workLength=""; 
		if(isWorked)
		{
			System.out.print("请选择工作年限 1:1-3年 2:4-9年 3:10年以上");
			byte wkLength = scan.nextByte();
			if(wkLength==1)
			{
				workLength="1-3年";
			}
			if(wkLength==2)
			{
				workLength="4-9年";
			}
			if(wkLength==3)
			{
				workLength="10年以上";
			}
		}
		else{
			workLength="无";
		}
		System.out.println("注册信息填写完毕，请确认您的身份是否正确");
		System.out.println("姓名："+name+"年龄："+age+"体重："+weight+"身高："+height+"是否婚配："+isMarried+"工作经验:"+workLength);

		scan.close(); //GC不会回收scanner，需要加scan.close()手动释放资源，否则会产生内存泄漏

	}
}
