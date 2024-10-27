//计算圆面积
class  area
{
	public static void main(String[] args) 
	{
		double pi = 3.14;

		double radius1 = 1.2;
		double radius2 = 2.5;
		double radius3 = 6;

		double area1 = pi*radius1*radius1;
		double area2 = pi*radius2*radius2;
		double area3 = pi*radius3*radius3;

		System.out.println("半径为"+radius1+"的圆面积为：" + area1);
		System.out.println("半径为"+radius2+"的圆面积为："+ area2);
		System.out.println("半径为"+radius3+"的圆面积为："+ area3);
	}
}
