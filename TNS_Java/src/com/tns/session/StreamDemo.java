package com.tns.session;


		import java.util.ArrayList;
		import java.util.List;
		import java.util.stream.Collectors;
		import java.util.stream.Stream;


		public class StreamDemo {

			public static void main(String[] args) {
				
				List<Integer> l=List.of(10,12,13,45,32,0,56,78,98,34,67,31);
			     System.out.println(l);
			     
//		        conventional code
//		            List<Integer> evenList=new ArrayList<>();
//		             for(Integer i: l) //for each loop
//		              {
//		                   if (i%2==0)
//		               {
//			                  evenList.add(i);  
//		               }
//		             }	 
//		               System.out.println(evenList);
		             
			     //Using stream API
			     Stream<Integer> Stream=l.stream();
			     List<Integer> el=Stream.map(i->i+10).collect(Collectors.toList());
			     System.out.println(el);
	}

}
