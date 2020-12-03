import java.util.Map;

public class MP13 {
	
	public static void main(String[] args) {
		CountString tcc=new CountString("sangmyung university 2020");
		Map<String, Integer> map= tcc.countDigitsAndLetters();
		System.out.println(map);
	}
}

