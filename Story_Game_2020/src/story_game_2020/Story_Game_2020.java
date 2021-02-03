package story_game_2020;

/**
 * Story Game (v.3.0.)
 * 01/29/2020
 * @author catofschroedinger
 */

import java.applet.Applet;
import java.awt.Graphics;

public class Story_Game_2020 extends Applet {
    @Override
    
    // Main method
    public static void main(String[] args) {
        // Declare three words
        String word_1, word_2, word_3;
        
        // Declare the letter rules (lipogram)
        String l_rule;
        String last; // Last letter of rule
        
        // Generate a new rule
        l_rule = words.generate(1);
            
        // Assign the last letter
        last = l_rule.substring(l_rule.length() - 1);
        
        // While the last letter is still in any of the words
        // Or the words have duplicates
        do {
            // Keep picking 3 words
            word_1 = words.generate(0);
            word_2 = words.generate(0);
            word_3 = words.generate(0);
            
            System.out.println("db:" + word_1 + " | " + word_2 + " | " + word_3);
        } while (
                (word_1.toUpperCase().contains(last) ||
                  word_2.toUpperCase().contains(last) ||
                  word_3.toUpperCase().contains(last)) ||
                (word_1.equals(word_2) ||
                 word_2.equals(word_3) ||
                 word_1.equals(word_3)
                ));
        
        // Print the 3 words
        g.drawString(word_1 + " | " + word_2 + " | " + word_3);
        
        // Print the rule
        g.drawString("Rule: " + l_rule);
    }
    
}
