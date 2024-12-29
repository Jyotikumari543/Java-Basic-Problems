public class DaemonThread implements Runnable {
        public void run() {
                // System.out.println("Daemon Thread is running...");
                while (true) {
                        System.out.println("Daemon Thread is running...");
                        try {
                                Thread.sleep(1000);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
        }

        public static void main(String[] args) {
                System.out.println("Main thread started");

                // This will make the main thread as a daemon thread
                DaemonThread daemon = new DaemonThread();
                Thread t = new Thread(daemon);
                t.setDaemon(true);//case 1: we have to create daemon thread before starting the thread if we create daemon thread after starting it,
                //it will throw runtime exception i.e illegal thread exception
                t.start();//case 2: we cannot create main thread as daemon thread
                System.out.println("Started daemon: "+t.isDaemon()); 
        }
}
