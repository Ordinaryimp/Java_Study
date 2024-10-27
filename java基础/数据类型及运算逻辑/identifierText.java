/*标识符的命名规则(必须要遵守！！(否则，编译不通过)
由26个英文字母大小写，0-9，或$组成
数字不可以开头.
不可以使用关键字和保留字，但能包含关键字和保留字
JAVA中严格区分大小写，长度无限制。
标识符不能包含空格

标识符的命名规范
包名:多单词组成时所有字母都小写：xxxyyyzzz.
例如：java.lang、com.atguigU.S.Bean
类名、接口名:多单词组成时，所有单词的首字母大写：xxxyyyzz
例如：HelloWorld，字符串，系统等
方法名:多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxyyyzz
变量名、
例如：年龄，名称，书名，主，二进制搜索，获取名称
常量名:所有字母都大写.多单词时每个单词用下划线连接：xxXYZZZ
例如：最大值、PI、默认容量

Java中的变量按照数据类型来分类
基本数据类型(8种):
整型:byte\short\int\long
浮点型:float\double
字符型:char
布尔型:boolean

*/


class IDentiferText{
	public static void main(String[] arges){
		int a = 12;
		int age = 23;
		char gender = '男';
		float heigh;
		//声明float类型变量时，需要提供后缀 f 或 F
		heigh = 1.7f;
		double heigh1;
		heigh1 = 1.750965;
		System.out.println(a);
		System.out.println("age="+age);
		System.out.println(gender);
		System.out.println(heigh);
		System.out.println(heigh1);
		//声明long类型变量时，需要提供后缀 L 或 l
		long tel = 12131378L;
		System.out.println(tel);
		System.out.println(0.1 + 0.2);	//0.30000000000000004	
		//浮点数（float 和 double）采用二进制的 IEEE 754 标准表示法。
		//某些十进制小数（例如 0.1 和 0.2）在二进制中是 无限循环 的。这些小数只能被近似存储，因此会产生微小的误差。
	}
}