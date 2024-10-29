/*
switch中的表达式只能是特定的数据类型。如下:byte\short\char\ 枚举(5.0)\String（7.0）
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
		//使用Switch-Case实现:对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格"
		int score = 59;
		switch(score/10){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不及格");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("及格");
			default:
				System.out.println("输入成绩有误");
		}
		//100-120之间的已超出100的无法进行判别，仍为及格
		int score1 = 60;
		switch(score1/60){
			case 1:
				System.out.println("及格");
				break;
			case 0:
				System.out.println("不及格");
				break;
		}
	}

}
