//单行注释
/*
	多行注释	不能嵌套
*/

/**

@author mzy
@version 1.0
这是我的第一个java程序，庆祝！
文档注释内容可以被]DK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档
一个源文件中可以声明多个类，但是最多只能有一个类使用public进行声明。
且要求声明为公共的类的类名与源文件名相同。
javadoc -d mydir -author -version HelloWorld.java  要求源文件必须包含public修饰的类
*/

public class HelloWorld{
	public static void main(String[] args){
		System.out.println("hello,world !! 你好，中国！");
		System.out.print("hello,world !! 你好，中国！");
		System.out.println("12341847194");
		System.out.println(10+26);
	}
}

class HelloChengdun{
	
}
class HelloShanghai{
	
}



