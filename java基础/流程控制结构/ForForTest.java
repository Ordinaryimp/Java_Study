class ForForTest 
{
	public static void main(String[] args) 
	{
		//上半部分
		for(int i=1;i<=5;i++){
			for(int j=1;j<=(10-2*i);j++) {
				System.out.print("-");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();


		//下半部分
		for(int i=1;i<=4;i++){
			for(int m=1;m<=(2*i);m++) {
				System.out.print("-");
			}

			for(int n=1;n<=(9-2*i);n++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
