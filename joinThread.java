public class joinThread extends Thread {
        public void run(){    
            for(int i=1; i<=4; i++)  
            {    
                try  
                {    
                    Thread.sleep(500);    
                }catch(Exception e){System.out.println(e);}    
                System.out.println(i);    
            }    
        }    
        public static void main(String args[])  
        {   
            // creating three threads  
            joinThread t1 = new joinThread();    
            joinThread t2 = new joinThread();    
            joinThread t3 = new joinThread();    
            // thread t1 starts  
            t1.start();   
            // starts second thread when first thread t1 is died.  
            try  
            {    
             t1.join();    
            }catch(Exception e){System.out.println(e);}    
            // start t2 and t3 thread   
            t2.start();   
            t3.start(); 

        }    
        
}
