import java.util.Arrays;
class ArrayTest 
{
	public static void main(String[] args) 
	{
		int[] ns = { 1, 4, 9, 16, 25 };
        // �����ӡ����Ԫ��:
        for (int i=ns.length-1;i>=0;i--){
            System.out.println(ns[i]);
			
		 // ����ǰ:
        System.out.println(Arrays.toString(ns));
        for(int i=0;i<=ns.length-1;i++){
			for(int j=0;j<=length-1-i;j++){
				if(ns[i]<ns[j]){
					int temp=ns[j];
					ns[j]=ns[j+1];
					ns[j+1]=temp;
				}
			}
        }
			
        // �����:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("���Գɹ�");
        } else {
            System.out.println("����ʧ��");
	}
}
}

        