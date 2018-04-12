package lambda.demo;

public class InnerClass {
    public static void main(String[] args) {
        new Thread(new Runnable() {

            public void run() {
                System.out.println("这是内部类，也是完全不会，那么怎么办耶！！！");
            }
        }).start();

        new Thread(() -> System.out.println("这是Lambda表达式，正在学，今天要会呀呀呀呀！！！")).start();
    }
}
