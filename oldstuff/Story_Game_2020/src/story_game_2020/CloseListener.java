package story_game_2020;

/**
 * Close Listener
 * 02/02/2021
 * @author catofschroedinger
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CloseListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        //DO SOMETHING
        System.exit(0);
    }
}