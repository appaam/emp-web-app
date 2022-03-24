package com.sapient.aem.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sapient.aem.model.Game;
import com.sapient.aem.model.Player;

@ExtendWith(MockitoExtension.class)
public class GameTest {	
	@Mock
	private Player player;
	
	//mock object player is injected into mock object, game
	@InjectMocks
	Game game;
	
	@Test
	public void attackWithSword() throws Exception{
		Mockito.when(player.getWeapon()).thenReturn("Sword");
		assertEquals("Player attacks with: Sword", game.attack());
	}
}
