import java.util.Map;
import java.util.HashMap;

public class CountString {
	private String str;
		
	public CountString(String s){
		str=s;
	}
	
	public Map<String, Integer> countDigitsAndLetters(){
		Map<String,Integer> wc =new HashMap<String,Integer>();
		char[] letters=str.toCharArray();
		
		for(char c:letters) {
				
			if(Character.isLetter(c)||Character.isSpaceChar(c)) {
				if(wc.containsKey("LETTERS")) {
					wc.put("LETTERS",  wc.get("LETTERS")+1); 
				}else {
					wc.put("LETTERS", 1);	
				}
			}
			if(Character.isDigit(c)) {
				if(wc.containsKey("DIGITS")) {
					wc.put("DIGITS",  wc.get("DIGITS")+1);
				}else {
					wc.put("DIGITS", 1);
				}
			}
		}
		return wc;
		
	}
}
