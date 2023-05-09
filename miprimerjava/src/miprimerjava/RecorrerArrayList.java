package miprimerjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RecorrerArrayList {

	
	
	public void iterateAnArrayList() {
	    ArrayList<String> names=new ArrayList();
	    names.add("Jose");
	    names.add("Fran");
	    names.add("Noel");
	    names.add("Pablo");
	    System.out.println("Con ListIterator");
	    //Here, element iterates in reverse order
	    ListIterator<String> namesIterator=names.listIterator(names.size());
	    while(namesIterator.hasPrevious()) {
	      String str=namesIterator.previous();
	      System.out.println(str);
	    }
	    
	    System.out.println("Con bucle For convencional:");
	    for(int i=0;i<names.size();i++) {
	      System.out.println(names.get(i));
	    }
	    System.out.println("Haciendo uso de ForEach");
	    names.forEach(name->{ 
	      System.out.println(name);
	    });
	    System.out.println("Con forEachRemaining():");
	    Iterator<String> itr=names.iterator();
	    itr.forEachRemaining(name-> System.out.println(name));
	  
	  
	  System.out.println("Haciendo uso de stream()");
	  names.stream().peek(name->System.out.println(name));
	}
	
}
