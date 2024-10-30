class BreakTest 
{
	public static void main(String[] args) 
	{
	label:for(int i=1;i<=4;i++){
			for(int j=1;j<=10;j++){
				System.out.print(j);
				if(j%4==0){
					//break label;		//break + 标签名  跳出指定循环；
					continue label;
				}
			}
			System.out.println();
		}
	}
}
