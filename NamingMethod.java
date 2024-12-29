//in this java file we will learn about currentThread(),isAlive(),setName(),getName()
public class NamingMethod extends Thread {
        public void run() {

                System.out.println("thread is started");

        }

        public static void main(String[] args) {
                NamingMethod thread = new NamingMethod();

                thread.start();
                System.out.println(Thread.currentThread().getName());// when we dont set name for thread then it start
                Thread.currentThread().setName("jyoti"); // with thread-0
                System.out.println(Thread.currentThread().isAlive());// its check whether the thread is alive or not
                System.out.println(Thread.currentThread().getName());
        }
}