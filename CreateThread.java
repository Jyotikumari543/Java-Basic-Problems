//there are two ways to create a thread first is using thread class and second is using runnable interface
//we are using thread class to create thread
public class CreateThread extends Thread {//1. extends the thread class
        public void run(){//2. override the run method of thread class
                // System.out.println("Thread is running");
                for(int i=0;i<6;i++){
                        System.out.println("Thread is running: "+i);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                }
                
        }
// public static void main(String[] args){
//                 CreateThread thread = new CreateThread();//3.cretae object of class
//                 //thread.start(); //4. call the start method to start the thread
//                 //thread.start();//calling start method twice give Illegal.ThreadStateException
//                  thread.run();//calling run method instead of start . it does not start a sperate call stack
//                 thread.run();//calling run method twice  will run same as previous




//         }
}