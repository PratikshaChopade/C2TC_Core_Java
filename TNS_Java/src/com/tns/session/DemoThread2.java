package com.tns.session;


class ChildThread1 extends Thread //Thread
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println("I am child thread.");
					Thread.yield();

				}
				
			
		}}

		//Tread Scheduler
		
		 class DemoThread2  {

			public static void main(String[] args) throws InterruptedException
			{
			ChildThread1 t=new ChildThread1();
			 t.start();
			

			for(int i=0;i<10;i++)
			{
				System.out.println("I am main thread.");
			}
			
			}
			
	}
	


