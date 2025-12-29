package org.example;

public class create_thread_by_extending_javalang_thread_class extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++)
        {
            System.out.println("World");
        }
    }
}
