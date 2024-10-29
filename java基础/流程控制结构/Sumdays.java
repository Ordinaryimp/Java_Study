//案例:编写程序:从键盘上输入2023年的“Month”和“Day”，要求通过程序输出输入的日期为2023年的第几天.
/*

switch-case 与if-else之间的转换
开发中凡是可以使用switch-case结构的场景，都可以改写为if-else。反之，不成立
开发中，如果一个具体问题既可以使用switch-case，
又可以使用if-else的时候，推荐使用switch-case:
为什么?switch-case相较于if-else效率稍高。

*/
import java.util.Scanner;

class  Sumdays
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = input.nextInt(); 

		System.out.println("请输入天数");
		int days = input.nextInt(); 

		input.close();
		//假设用户输入数据合法，后续用正则表达式检验
		//方式一：
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
		//方式二：
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
			case 1：
				sumdays+=days;
		}
		System.out.println(sumdays);
	}
}
