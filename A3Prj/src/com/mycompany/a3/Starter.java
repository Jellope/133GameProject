package com.mycompany.a3;

import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.io.Log;
import com.codename1.ui.Toolbar;
import java.io.IOException;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class Starter {
	
    private Form current;
    private Resources theme;

    public void init(Object context) {
    	theme = UIManager.initFirstTheme("/theme");
        Toolbar.setGlobalToolbar(true);
    }
    
    public void start() {
    	//Construct instance of Game class.
        if(current != null){
            current.show();
            return;
        }
        new Game();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
        if(current instanceof Dialog) {
            ((Dialog)current).dispose();
            current = Display.getInstance().getCurrent();
        }
    }
    
    public void destroy() {
    }

}
