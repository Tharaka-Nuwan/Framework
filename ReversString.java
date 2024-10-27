public class ReversString{
	
	public static void main(String arge[]){
		
		String str="Hellow world";
		String reversString="";
		
		for(int i = str.length()-1; i>=0 ; i--){
			
			reversString += str.charAt(i);
			
		}
		
		
		System.out.println(str);
		System.out.println(reversString);
	}
	
}