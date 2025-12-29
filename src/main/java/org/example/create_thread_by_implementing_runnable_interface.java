package org.example;

public class create_thread_by_implementing_runnable_interface implements Runnable {
    @Override
    public void run()
   {
       for(;;)
       {
           System.out.println(Thread.currentThread().getName());
       }
   }

}
