public class PriorityThread extends Thread {
        public void run() {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                System.out.println(" Thread Priority: " + Thread.currentThread().getPriority());
        }

        public static void main(String[] args) {
                PriorityThread t1 = new PriorityThread();
                PriorityThread t2 = new PriorityThread();
                t1.setPriority(MAX_PRIORITY);
                t2.setPriority(MIN_PRIORITY);
               
                // System.out.println("t2 Thread Priority: " + t2.getPriority());
                t1.start();
                t2.start();

                //when we set the priority above 10 it will throw exception as java.lang.IllegalArgumentException

        }
}