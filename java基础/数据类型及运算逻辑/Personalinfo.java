class Personalinfo 
{
	public static void main(String[] args) 
	{
		System.out.println("name:mzy");
		System.out.println();	//换行操作
		System.out.println("性别：男");
		System.out.println("家庭地址：以太星系α系6区");

		// 调用 StarPrintTest 类中的 star 方法
        StarPrintTest.star(args); // 注意调用的方法是静态的，直接用类名调用

	}
}
class StarPrintTest{
	public static void star(String[] args){
		System.out.println("*    *");
		System.out.println("*\t*");	//	\t一tab缩进
		System.out.println("*\n\n*"); //  \n表示换行
	}
	
}
