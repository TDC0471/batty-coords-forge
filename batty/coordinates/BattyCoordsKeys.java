/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batty.coordinates;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
/**
 * Handles the detection of key-presses that Batty's Coordinates mod is interested in 
 * @author BatHeart
 */
public class BattyCoordsKeys {

    public static boolean keyToggleCoords = false;

    public BattyCoordsKeys() {

    }

    @SubscribeEvent
    public void trackKeyInputs(KeyInputEvent event) {
		if (BattyBaseUI.hideunhideCoordskey.func_151468_f()) {
			keyToggleCoords = true;
        }


    }




}    
