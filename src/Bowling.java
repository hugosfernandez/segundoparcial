import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Bowling {

	private Bowlinggame game;
	
	@Before
	public void setUp() throws Exception {
		game = new Bowlinggame();
	}

	@Test
	public void testpeorpartida()
	{
	  for(int frame=1; frame<=10; frame++)
	  	{
		  game.Rollframe(0,0);
	  	}
	  assertEquals(0, game.Puntaje());
	}
	
	@Test
	public void testmejorpartida()
	{
	  for(int frame=1; frame<=10; frame++)
	  	{
		  game.Rollframe(10,0);
	  	}
	  assertEquals(100, game.Puntaje());
	}
	
	@Test
	public void testpuntajeframe()
	{
		game.Rollframe(2,5);
		assertEquals(7, game.Puntaje());
	}
	
	@Test
	public void teststrikeestra()
	{
	  for(int frame=1; frame<=10; frame++)
	  	{
		  game.Rollframe(10,0);
		  
		  if (frame == 10  && game.Puntaje() == 100){
			  game.Rollframe(10,10);  
	  		}
	  	}
	  assertEquals(120, game.Puntaje());
	}
}
