public class sleepThread extends Thread {
        public void run()  
        {    
            for(int i=1;i<5;i++)  
            {    
                try  
                {  
                    Thread.sleep(1000);  
                }catch(InterruptedException e){System.out.println(e);}    
                System.out.println(i);    
            }    
        }    
        public static void main(String args[])  
        {    
            sleepThread t1=new sleepThread();    
            sleepThread t2=new sleepThread();    
            t1.start();    
            t2.start();    
        } 
        
}
