package edu.ucsb.cs56.projects.games.country_runner;

import sun.audio.AudioPlayer;
import edu.ucsb.cs56.projects.games.country_runner.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/** Controller
 * Handles controls for Runner object
 * @author Anna Lee
 * @version cs56, F17
 */

public class Controller extends JPanel implements Runnable
{
    //This part if ro regestering keyboard keys
	//each overridden function is used to manage what
	//happens when keys are pressed and released
	//keyPressed - when the key goes down
	//keyReleased - when the key comes up
	//keyTyped - when the unicode character represented
	//by this key is sent by the keyboard to system input.
	addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
		    //Here, we say that when a key is pressed,
		    //the "pressed" function should be carried out
		    pressed(e, "keyPressed");
		    //NOTE: right now we are only handling the
		    //keyPressed actions and don't care about
		    //anything else. This may change in the future
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
		    released(e,"keyReleased");
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
		    //Not currently using
		}
	    });
    }
    
    /** pressed
     * Handles all key pressed events, if the up
     * arrow was pressed, we set the upArrowPressed
     * boolean to true, so the run method picks it up
     */
    private void pressed(KeyEvent e, String text)
    {
	    int key = e.getKeyCode();
	    //VK_SPACE = space bar
	    if(key == KeyEvent.VK_SPACE && !drawingLevel)
	    {
		    fired = true;
	    }
	    //VK_UP = Up arrow
	    if (key == KeyEvent.VK_UP)
	    {
	    	upArrowPressed = true;
	    }
	    if (key== KeyEvent.VK_X)
	    {
		    superJumpPressed = true;
	    }
	    if (key== KeyEvent.VK_LEFT)
	    {runner.move2();}
	    if (key == KeyEvent.VK_RIGHT)
	    {runner.move1();}
    }
}
