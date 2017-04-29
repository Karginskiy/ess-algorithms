/**
 * Created by Nike on 25.04.2017.
 */
public class StackTest {

    public static void main(String[] args) throws InterruptedException {
        level3();
    }

    private static void level3() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("В методе на уровне 3");
        level2();
        Thread.sleep(1000);
        System.out.println("Выходим из метода 3");
    }

    private static void level2() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("В методе на уровне 2");
        level1();
        Thread.sleep(1000);
        System.out.println("Выходим из метода 2");
    }

    private static void level1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("В методе на уровне один");
        Thread.sleep(3000);
        System.out.println("Выходим из метода 1");
    }

}
