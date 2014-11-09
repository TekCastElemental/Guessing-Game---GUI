  package GGgui;

  import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
  
  
  
class GameFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	int randomNumber = new Random().nextInt(10) + 1;
	int numGuesses = 0;
	
	JTextField textField = new JTextField(5);
	JButton button = new JButton("Guess");
	JLabel label = new JLabel(numGuesses + " guesses");
	

	
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("Guessing Game");
		add(textField);
		add(button);
		add(label);
		button.addActionListener(this);
		setBackground(Color.white);
		pack();
		setVisible(true);
		setSize(350,75);
	} 
	String textFieldText = textField.getText();


	
	@Override
	public void actionPerformed(ActionEvent e) {
		String textFieldText = textField.getText();

		
		if (Integer.parseInt(textFieldText)==randomNumber) {
			button.setEnabled(false);
			textField.setText(textField.getText() + " Yes!");
			textField.setEnabled(false);
		} else {
			textField.setText("");
			textField.requestFocus();
		}
		numGuesses++;
		String guessWord =
				(numGuesses == 1) ? " guess" : " guesses";
		label.setText(numGuesses + guessWord);
		
		
		} 
		

		
	}
	
	
	
	



