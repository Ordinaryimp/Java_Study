//�������������ܼ�
class Week 
{
	public static void main(String[] args) 
	{
		int week=5;
		int day=12;
		week=(week+day)%7;
		System.out.println(day+"�������"+(week==0?"��":week));

		//�������������ֵ
		int a=1;
		int b=2;
		int c=5;
		int max=a;
		if(max<b)
		{
			max=b;
		}
		if(max<c)
		{
			max=c;
		}
		System.out.println(max);
		int finanum=(((a<b)?b:a)<c)?c:((a<b)?b:a);
		System.out.println(finanum);
	}
}

