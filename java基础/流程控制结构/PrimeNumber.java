//��100���ڵ�����
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		//��ʽһ��
		/*
		int count = 0;
		System.out.println("�����У�");
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
		System.out.println("����"+count+"������");
		*/

		//��ʽ����
		int count = 0;
		System.out.println("�����У�");
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
		System.out.println("����"+count+"������");
	}
}
