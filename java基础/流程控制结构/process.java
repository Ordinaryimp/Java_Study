import java.util.Scanner;

class process
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
        // ����������
        System.out.print("�������һ����: ");
        int num1 = scanner.nextInt();
        System.out.print("������ڶ�����: ");
        int num2 = scanner.nextInt();
        System.out.print("�������������: ");
        int num3 = scanner.nextInt();
		/*
        // ����
        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
		*/
		//ð������
		int[] numbers = {num1,num2,num3};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // ����
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
		System.out.println("��С������������������: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
		

        // ��ӡ���
        //System.out.println("��С������������������: " + num1 + ", " + num2 + ", " + num3);
        
        scanner.close();
		System.out.println("Hello World!");
	}
}
