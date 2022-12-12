package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo_on_collectioninterface {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	Collection obj= new ArrayList<>();
			obj.add("yog");
			obj.add("12");
			obj.add(13.4f);
			obj.add("z");
			obj.remove("z");
			System.out.println("the elements are"+obj); 
			
 for(Object itr:obj)
{   
	 System.out.print(itr+" ");
}
	}

}
