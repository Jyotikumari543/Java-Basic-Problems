public class CreateRunnable implements Runnable {// 1.creating thread using runnable interface by implementing runnable
                                                 // interface
        public void run() {// 2.override run method
                // System.out.println("thread is creted using runnable interface");
                for (int i = 6; i > 0; i--) {
                        System.out.println("Thread is running using runnable interface: " + i);
                        try {
                                Thread.sleep(500);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
        }

        public static void main(String[] args) {
                CreateRunnable m1 = new CreateRunnable();// create method of class
                Thread t1 = new Thread(m1);// create method of thread
                CreateThread m2 = new CreateThread();
                t1.start();// call run method by using start method
                m2.start();//executing two thread at the same time 
        }
}
