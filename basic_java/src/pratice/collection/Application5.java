package pratice.collection;


import java.util.Map.Entry;
import java.util.TreeMap;

public class Application5 {

	public static void main(String[] args) {
		
		TreeMap<String, String > dictionery = new TreeMap<>();
		
	    dictionery.put("Brave", "ready to face and andure danger or pain");
	    dictionery.put("Briliant", "ready to face and andure danger or pain");
	    dictionery.put("Confidance", "to fealling of certan about the truth");
	    dictionery.put("Joy", "ready to face and andure danger or pain");
	    

	    
	//    for(String word : dictionery.keySet() ) {	    	
	///    	System.out.println( dictionery.get(word));
	//    }
	    
	    for(Entry<String, String> entrySet : dictionery.entrySet() ) {	    	
	    	System.out.println(entrySet.getKey() +"  "+entrySet.getValue());
	    }
	    
	    
	    
	}

}
