package story_game_2020;

/**
 * Story Game (v.3.0.)
 * 01/29/2020
 * @author catofschroedinger
 */

// Import List
import java.applet.*;
import java.awt.event.*;  
import javax.swing.*;

public class Story_Game_2020_1 extends JApplet implements ActionListener{
    
    // Is there a rule?
    static boolean has_rule = false;
    
    // Choosing Words method
    public static String [] choose(boolean rule) {
        // Declare the returnable array
        String [] arr = new String[2];
        
        // Declare three words
        String word_1, word_2, word_3;
        
        // Declare the letter rules (lipogram)
        String s_rule = "";
        String l_rule = " ";
        String last; // Last letter of rule
        
        // If there is a rule,
        if (rule) {
            // Generate a new rule
            l_rule = words.generate(1);
            
            // Set the rule text
            s_rule = "Rule: No " + l_rule.substring(l_rule.length() - 1);
        }
        
        // Assign the last letter
        last = l_rule.substring(l_rule.length() - 1);
        
        // While the last letter is still in any of the words
        // Or the words have duplicates
        do {
            // Keep picking 3 words
            word_1 = words.generate(0);
            word_2 = words.generate(0);
            word_3 = words.generate(0);
            
            System.out.println("db:" + word_1 + " | " + word_2 + " | " 
                    + word_3);
        } while (
                (word_1.toUpperCase().contains(last) ||
                  word_2.toUpperCase().contains(last) ||
                  word_3.toUpperCase().contains(last)) ||
                (word_1.equals(word_2) ||
                 word_2.equals(word_3) ||
                 word_1.equals(word_3)
                ));
        
        // Set arr to the 3 words (and rule)
        arr[0] = word_1 + " | " + word_2 + " | " + word_3;
        arr[1] = s_rule;
        
        // Return arr
        return arr;
    }
    
    public static void init (String[] args) {
        // Create a frame
        JFrame f = new JFrame("Story Game Rules");
        
        // Create a label
        JLabel label1 = new JLabel("...");
        label1.setBounds(50, 150, 300, 20);
        
        // Create a toggle display
        JLabel toggletext = new JLabel("Letter Rule: Off");
        toggletext.setBounds(50, 200, 200, 20);
        
        // Create ruletext
        JLabel ruletext = new JLabel("");
        ruletext.setBounds(50, 175, 100, 20);
        
        // Start Button
        JButton start = new JButton("Start");
        start.setBounds(50, 100, 95, 30);
        start.addActionListener(new ActionListener() {
            @Override
            // What happens when the button is pressed?
            public void actionPerformed(ActionEvent e) {
                // Select the words
                String [] prompt = choose(has_rule);
                
                // Set the label
                label1.setText(prompt[0]);
                
                // If there's a rule,
                if (has_rule) {
                    // Display the rule
                    ruletext.setText(prompt[1]);
                }
                // Else,
                else {
                    // Leave it blank
                    ruletext.setText("");
                }
            }
        });
        
        // Toggle Rule Button
        JButton toggle = new JButton("Toggle");
        toggle.setBounds(150, 100, 95, 30);
        toggle.addActionListener(new ActionListener() {
            // This line has to be here, I don't know what it does
            @Override
            
            public void actionPerformed(ActionEvent e) {
                // Toggle the boolean 'has_rule'
                has_rule = !has_rule;
                
                // Set the toggle text
                if (has_rule) {
                    toggletext.setText("Letter Rule: On");
                }
                else {
                    toggletext.setText("Letter Rule: Off");
                }
            }
        });
        
        // Close Button
        JButton close = new JButton("Close");
        close.setBounds(250, 100, 95, 30);
        close.addActionListener(new CloseListener());
        
        // Add everything to the frame
        f.add(start);
        f.add(toggle);
        f.add(close);
        f.add(label1);
        f.add(toggletext);
        f.add(ruletext);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
