//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException{


        Runnable r = ()->{
            for(int i =0;i<10;i++)
            {
            System.out.println("Thread will run in Employee");
        }};



        Runnable k =()->{
        for(int i =0;i<10;i++) {
            System.out.println("Thread will run in Manager");


        }};
         Thread t = new Thread(r);



        Thread t1 = new Thread(k);


         t.start();

        t.sleep(1000);
        t1.start();


    }
}












