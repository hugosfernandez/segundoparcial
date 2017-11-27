
public class Bowlinggame {

	//public static final String Puntaje = null;

	private int puntaje;
	
	public int Puntaje() {
		return puntaje;
	} 
	
	public void Rollframe(int roll1, int roll2) {
		// TODO Auto-generated method stub
		puntaje += roll1 + roll2;
	}

}
