package pratice.loops;

public class LoopsPractice {

	
	public static void main (String args[]) {
		
		String str = "We have a large inventory of things in our warehouse falling in " 
				+ "the category: apperal and the slightly "	
				+ "more in demand category: makeup along with the category: furniture and .... ";
		
	//	printCategory( str);
		
		String name = "ahsjdasdqwepqoweqpidadas";
		
		
	//	for(int index=name.length()-1;index>=0;index--) {
	//		System.out.println("char "+name.charAt(index));
	//	}
		
		
	//	for(int index=0;index<=100;index=index+2) {		
	//			System.out.println(index);
	//	}
		
		
		for(int idx=0;idx<100;idx++) {
			
			for(int index2=0;index2<100;index2++) {
				for(int index3=0;index3<100;index3++) {
					for(int index4=0;index4<100;index4++) {
					System.out.println("the value of idx was "+idx+" "+index2+" "+index3);
					}
				}	
				
			}
			
		
		}
		
		
		
		
	}
	
	//Extract category
	
	public static void printCategory(String str) {
		
		
		while(str.lastIndexOf("category:")!=-1) {
			
			
			int indexCategory = str.lastIndexOf("category:");
			
			 String resultPrint =  str.substring(indexCategory+"category:".length()).split(" ")[1];
				 
			 System.out.println(resultPrint);
			 
			 str = str.substring(0, indexCategory);
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
