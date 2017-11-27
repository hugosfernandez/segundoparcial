import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Bowling {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testcrearjuego() {
		Bowlinggame game = new Bowlinggame();
	}

	@Test
	public void testpeorpartida()
	{
	  Bowlinggame game = new Bowlinggame();
	  for(int i=1; i<=10; i++)
	  	{
		  game.Rollframe(0,0);
	  	}
	  assertEqual(0, game.Puntaje);
	}
}
