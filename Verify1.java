public class Verify1{
	public static void main (String[] args) {
		char character = 'b';
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y') {
			System.out.println("Caracterul este vocala");
		} else {
			System.out.println("Caracterul este consoana");
		}
	}
}