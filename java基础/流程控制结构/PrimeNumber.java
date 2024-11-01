//找100以内的质数
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		//方式一：
		/*
		int count = 0;
		System.out.println("质数有：");
		for(int i=2;i<=100;i++){
			int count1=0;
			for(int j=2;j<i;j++){
				if(ji%j==0){
						count1++;
				}
			}
			if(count1==0){
				System.out.print(i+" ");
				count++;
			}
				
		}
		System.out.println("共计"+count+"个质数");
		*/

		//方式二：
		int count = 0;
		System.out.println("质数有：");
		long start=System.currentTimeMillis();
		for(int i=2;i<=10000;i++){
			boolean flag=true;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.print(i+" ");
				count++;
			}
				
		}
		long end=System.currentTimeMillis();
		System.out.println(start);
		System.out.println(end);
		System.out.println(end-start);
		System.out.println("共计"+count+"个质数");
	}
}
