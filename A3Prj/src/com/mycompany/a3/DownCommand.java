package com.mycompany.a3;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

//Move the spaceship down;
public class DownCommand extends Command{
	private GameWorld gw;
	public DownCommand(GameWorld gw) {
		super("Down");
		this.gw = gw;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		gw.moveSpaceShipDown();
	}
}