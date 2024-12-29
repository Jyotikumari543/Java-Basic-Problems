class Mythread1 extends Thread {
        public void run() {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                System.out.println("second Thread is running");
        }

}

class Mythread2 extends Thread {
        public void run() {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                System.out.println("third Thread is running");
        }

}

public class multipletask extends Thread {
        public void run() {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                System.out.println("first Thread is running");
        }

        public static void main(String[] args) {
                // 1. performing single task from single thread
                // multipletask t1=new multipletask();
                // t1.start();

                // 2. performing multiple task from multiple thread
                // multipletask t1 = new multipletask();
                // t1.start();
                // multipletask t2 = new multipletask();
                // t2.start();
                // multipletask t3 = new multipletask();
                // t3.start();
                // System.out.println("Thread name: " + Thread.currentThread().getName());

                // 3. performing multiple task from single thread
                // multipletask t1 = new multipletask();
                // t1.start();
                // its not possible because thread perform small task and one task only .it is
                // not possible to use one thread to perfome multiple tasks.thread cannot be
                // divided further

                // 4.performing mulitple task from multiple thread
                // this is possible
                multipletask m1 = new multipletask();
                m1.start();// task 1 by thread 1
                Mythread1 t1 = new Mythread1();
                t1.start();// task 2 by thread 2
                Mythread2 t2 = new Mythread2();
                t2.start();// task 3 by thread 3
                // System.out.println("Thread name: " + Thread.currentThread().getName());
        }

}
