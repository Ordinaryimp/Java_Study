package com.abstracttest;

/**
 * ClassName:GeometricTest
 * Package:com.ten
 * Description:
 *
 * 编写equalsArea方法测试两个对象的面积是否相等(注意方法的参数类型)
 * 编写displayGeometricObject方法显示对象的面积(注意方法的参数类型)。
 *
 * @Author mzy
 * @Create 2024/11/11 16:06
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("red",1.0,2.3);
        Circle c2 = new Circle("blue",1.0,3.3);
        test.displayGeometricObject(c1);    //子类对象的多态
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1,c2);
        if(isEquals){
            System.out.println("两个对象的面积相等");
        }else{
            System.out.println("两个对象的面积不相等");
        }
        //使用匿名对象
        test.displayGeometricObject(new MyRectangle("yellow",1.0,3.0,4.0));
    }
    public boolean equalsArea(GeometricObject g1, GeometricObject g2){
        return g1.findArea()==g2.findArea();
    }
    public void displayGeometricObject(GeometricObject g){
        System.out.println("面积为："+g.findArea());    //动态绑定
    }

}
