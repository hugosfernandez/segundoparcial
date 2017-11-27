
public class Bowlinggame {

	//public static final String Puntaje = null;

	private int puntaje;
	
	public int Puntaje() {
		return puntaje;
	} 
	
	public void Rollframe(int i, int j) {
		// TODO Auto-generated method stub
		puntaje += i + j;
	}

}
