package com.mycompany.a3;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class StatsCommand extends Command{
	private GameWorld gw;
	public StatsCommand(GameWorld gw) {
		super("Stats");
		this.gw = gw;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		gw.stats();
	}
}