public class dadosString {

    public static void main(String[] args) {
		
		String original = "Escola SECUNDARIA cidade ALTA      ";
		
		String s01 = original.toLowerCase();
		
		System.out.println("Original: - "+original);
		System.out.println("toLowerCase: -" + s01.toLowerCase() + "-");
		System.out.println("topUpperCase-"+s01.toUpperCase());
		System.out.println("Trim: "+original.trim());
		System.out.println("Subtrin: "+original.substring(1));
		System.out.println("replace: "+original.replace("Escola", "Instituto"));
		
		String s = "potato aplle lemom";
		String [] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}

    
