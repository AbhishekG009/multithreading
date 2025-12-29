package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       create_thread_by_extending_javalang_thread_class cr = new create_thread_by_extending_javalang_thread_class();
     //  cr.start();
       //start method is callled to initiate a new thread.
//-------------------------------------------------------------------------------------
        Thread t1 = new Thread(cr);
        t1.start();

        //If your are creating thread by implementating runnabel, you need to create instramce of thread as well as

        for(int i=0;i<10000;i++)
        {
            System.out.println("Hello");
        }
    }
}