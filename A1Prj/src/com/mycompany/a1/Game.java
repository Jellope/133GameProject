package com.mycompany.a1;

import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.io.Log;
import com.codename1.ui.Toolbar;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import java.io.IOException;

public class Game extends Form {
	private GameWorld gw;
	
	/*Instantiates a GameWorld.
	 * Calls GameWorld's init() to set the initial state of the game.
	 * Calls play()*/
	public Game() {
		gw = new GameWorld();
		gw.init();
		play();
		
	}
	/* Accepts keyboard commands from the player & invokes GameWorld methods*/
	private void play() {
		Label myLabel = new Label("Enter a Command");
		this.addComponent(myLabel);
		final TextField myTextField=new TextField();
		this.show();
		
		myTextField.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent evt) {
				
				String sCommand = myTextField.getText().toString();
				myTextField.clear();
				switch (sCommand.charAt(0)) {
					//List commands here
				case 'r':
					//Move the spaceship to the right;
					gw.rightMovement();
					break;
				case 'l':
					//Move the spaceship to the left;
					gw.leftMovement();
					break;
				case 'u':
					//Move the spaceship up;
					gw.upMovement();
					break;
				case 'd':
					//Move the spaceship down;
					gw.downMovement();
					break;
				case 'c':
					//Decrease the size of the spaceship door.
					gw.compress();
				case 'e':
					//Increase the size of the spaceship door.
					gw.expand();
					break;
				case 't':
					/*Tell the Gw that the game clock has ticked.
					 * All moving objects are told to update their positions
					 * according to their current direction and speed.*/
					break;
				case 's':
					/*Open the door & update the score according to the types
					 * & conditions of opponents that are let in to the spaceship
					 * as described above in rules of play.
					 * This causes all of the opponents whose centers are within 
					 * the boundaries of the bounding square of the door to be removed
					 * from the game world.*/
					break;
				case 'w':
					/*PRETEND that a collision occurred between two aliens. 
					 * This type of collision means that a new alien is generated.
					 * ELSE, if there is less than two aliens, print an error message instead.*/
					break;
				case 'f':
					/*PRETEND that a collision occurred between an alien and an astronaut.
					 * This type of collision means that a fight occurred between the two.
					 * Chooses random astronaut & decrements its health value, updates speed, change color.
					 * ELSE, if there are no aliens, print an error message instead.*/
					break;
				case 'p':
					/*Print the points of game state values:
					 * current score
					 * number of astronauts rescued
					 * number of aliens sneaked in to the spaceship
					 * number of astronauts left in the world
					 * Output should be appropriately labeled in easily readable format*/
					break;
				case 'm':
					/*Print a 'map' showing the current world state.*/
					break;
				case 'x':
					/*Exit, by calling the method 'System.exit(0)' to terminate the program.
					 * Your program should confirm the user's intent to quit before actually exiting.*/
					break;
				case 'y':
					/*User has confirmed the exit the exit by saying yes.*/
				case 'n':
					/*User has not confirmed the exit by saying no.*/
				}
			}	//actionPerformed
		}//newActionListner()
		); //addActionListener
	}//play
	
	private void init() {
		
	}
	
	private void stop() {
		
	}
	
	private void destroy() {
		
	}

}
