import java.util.Scanner;

class process
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
        // 接收三个数
        System.out.print("请输入第一个数: ");
        int num1 = scanner.nextInt();
        System.out.print("请输入第二个数: ");
        int num2 = scanner.nextInt();
        System.out.print("请输入第三个数: ");
        int num3 = scanner.nextInt();
		/*
        // 排序
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
		//冒泡排序
		int[] numbers = {num1,num2,num3};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 交换
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
		System.out.println("从小到大排序后的三个数是: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
		

        // 打印结果
        //System.out.println("从小到大排序后的三个数是: " + num1 + ", " + num2 + ", " + num3);
        
        scanner.close();
		System.out.println("Hello World!");
	}
}
