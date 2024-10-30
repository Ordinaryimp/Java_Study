class ZfTest 
{
	public static void main(String[] args) 
	{
		int count = 0; 
		double a = 0.1e-3;
		
		while(a<=8848.6){
			a*=2.0;
			count++;
		}
		System.out.println("当前为"+a+"米共折了"+count+"次");
	}

}
