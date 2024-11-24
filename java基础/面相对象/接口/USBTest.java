package com.interfacetest;

/**
 * ClassName:USB
 * Package:com.interfacetest
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/24 20:17
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {
        //1.创建接口实现类对象
        Computer computer = new Computer();
        Printer printer = new Printer();
        computer.transferData(printer);

        //2.创建接口实现类匿名对象
        computer.transferData(new Camera());

        //3.创建接口匿名实现类的对象
        USB usb = new USB(){
            public void start(){
                System.out.println("U盘插入");
            }
            public void stop(){
                System.out.println("U盘拔出");
            }
        };
        computer.transferData(usb);

        //4.创建接口匿名实现类的匿名对象
        computer.transferData(new USB(){
            @Override
            public void start() {
                System.out.println("U盘插入");
            }

            @Override
            public void stop() {
                System.out.println("U盘拔出");
            }
        });

    }

}

class Computer{
    public void transferData(USB usb){//多态：USb usb = new Printer();
        System.out.println("设备连接成功");
        usb.start();
        System.out.println("设备开始工作");
        usb.stop();
    }
}

class Camera implements USB{
    @Override
    public void start() {
        System.out.println("摄影机机开始拍摄");
    }

    @Override
    public void stop() {
        System.out.println("拍摄结束");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");

    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

interface USB{

    //声明常量

    public abstract void start();
    void stop();
}
