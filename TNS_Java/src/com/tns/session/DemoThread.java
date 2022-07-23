package com.tns.session;


		class MyThread1 implements Runnable
		{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
							System.out.println(i);
					
				 }
		        }
				}



		   public class DemoThread
		{

			public static void main(String[] args) 
			{
			MyThread1 t=new MyThread1();
			Thread s=new Thread(t);
			s.start(); // Start your Thread
		}
		
	}


