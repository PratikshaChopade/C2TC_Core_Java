package com.tns.Synchronized;



	
		class Counter1
		{
			int count;
			public synchronized void inc()
			{
				count ++;
			}
		}
		public class Synchronized1 {

			public static void main(String[] args) throws InterruptedException
			{
				Counter1 c = new Counter1();
				Thread t1 = new Thread (new Runnable() 
				{
					public void run()
					{
						for (int i=1;i<=10000;i++)
						{
							c.inc();
						}
					}
				});
				
				Thread t2= new Thread (new Runnable()
						{
					    public void run()
					    {
					    	for(int i=1; i<=10000; i++)
					    		c.inc();
					    
					    }
						});
				t1.start();
				t2.start();
				t1.join();
				t2.join();
				
				System.out.println(c.count);
				
	}

}
