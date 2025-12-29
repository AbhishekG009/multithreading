package org.example;

public class Thread_methods extends Thread{

    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        Thread_methods t1 = new Thread_methods();
        t1.start();
    }

}
