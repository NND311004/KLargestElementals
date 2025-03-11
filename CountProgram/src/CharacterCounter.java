
public class CharacterCounter {
	public static void main(String[] args) {
		int letters = 0;
		int spaces = 0;
		int numbers = 0;
		int others = 0;
		String input = "NND 3110 :)))";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				letters++;}
			else if(Character.isWhitespace(ch)){
				spaces++;}
			else if(Character.isDigit(ch)) {
				numbers++;}
			else others++;
				}
		System.out.println("Letters: " + letters);
		System.out.println("Spaces: " + spaces);
		System.out.println("Numbers: " + numbers);
		System.out.println("Other: " + others);
	}
}
