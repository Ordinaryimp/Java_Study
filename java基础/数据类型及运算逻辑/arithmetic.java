class arithmetic
{
	public static void main(String[] args){
		short s1=10;
		//short s1=s1+1;	���벻ͨ��	1Ϊint����
		s1++;
		s1=(short)(s1+1);

		//ȡ����λ���ĸ���ʮ����λ
		int num=153;
		int ge=num%100%10;
		int shi=num/10%10;
		int bai=num/100;
		System.out.println(ge);
		System.out.println(shi);
		System.out.println(bai);

		int hour = 89;
		int day = hour/24;
		int hour2 = hour%24;
		System.out.println(hour+"����Ϊ��"+day+"��"+hour2+"Сʱ");
		System.out.println("5+5="+5+5);

		int i=1;//1 +    3  *  3
		int j = i++ + ++i * i++;
		System.out.println("j="+j);
		System.out.println("i="+i);
		
		int m=2;
		m=m++;
		System.out.println("m="+m);
		
	}
}