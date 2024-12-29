public class yieldThread extends Thread {
        public void run() {
                for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is running");
                        // Suggests giving CPU time to other threads
                }
                Thread.yield();
        }

        public static void main(String[] args) {
                yieldThread thread1 = new yieldThread();
                yieldThread thread2 = new yieldThread();

                thread1.setName("Thread-1");
                thread2.setName("Thread-2");

                thread1.start();
                thread2.start();
        }

        //Here, yield() tells the scheduler that the current thread is willing to give up its CPU time, but whether another thread actually gets the time is not guaranteed.

}
