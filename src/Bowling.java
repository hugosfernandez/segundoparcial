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
	  for(int frame=1; frame<=10; frame++)
	  	{
		  game.Rollframe(0,0);
	  	}
	  assertEquals(0, game.Puntaje());
	}
	
	@Test
	public void testmejorpartida()
	{
	  Bowlinggame game = new Bowlinggame();
	  for(int frame=1; frame<=10; frame++)
	  	{
		  game.Rollframe(10,0);
	  	}
	  assertEquals(100, game.Puntaje());
	}
	
}
