import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;





public class RockOnGo extends JFrame implements ActionListener, WindowListener {

    Frame f;
    Frame f2;
    Font font,font2;
    private JButton rockButton, paperButton, scissorsButton,gobtn;
    private JTextField textField, textField2,textField3,textField4;
    Color frameColor, txtColor,btnColor,btnColor2;


    RockOnGo() {
 

        f = new Frame("Rock Paper Scissor");
        f2 = new Frame("Rock Paper Scissor");
        frameColor = new Color(0, 23, 45);
        txtColor = new Color(255,255,255);
        btnColor2=new Color(0,0,0);
        font = new Font("Algerian", 1, 17);
        font2=new Font("Times new Roman",1,26);
        btnColor=new Color(0,30,253);

        f.setLayout(null);
        f2.setLayout(null);
        f.setBackground(frameColor);
        f2.setBackground(frameColor);


        textField = new JTextField(15); // Setting up the buttons/fields
        textField2 = new JTextField(15);
        textField3=new JTextField();
        textField.setBounds(140, 40,130, 50);
        textField2.setBounds(80, 110, 260, 50);
        textField2.setText("Make your move");
        textField.setText("RockOnGo");
        textField.setBackground(frameColor);
        textField.setForeground(txtColor);
        textField.setFont(font2);
        textField2.setFont(font);
        textField2.setAlignmentX(CENTER_ALIGNMENT);
        textField2.setAlignmentY(CENTER_ALIGNMENT);
        textField2.setForeground(txtColor);
        textField2.setBackground(btnColor2);
        textField2.setBorder(null);
        textField.setBorder(null);
        textField3.setBackground(frameColor);
        textField3.setForeground(txtColor);
        textField3.setText("RockOnGo");
        textField3.setFont(font2);
        textField2.setFont(font);
        textField3.setBorder(null);
        textField3.setBounds(140, 40,130, 50);

        textField4 = new JTextField("Enter Your Name");
        textField4.setBounds(50, 100, 300, 30);
        textField4.setBounds(50, 150, 300, 30);
        textField4.setBorder(null);
        textField4.setBackground(btnColor);
        textField4.setFont(font);
        textField4.setForeground(txtColor);

    

        rockButton = new JButton("Rock");
        rockButton.addActionListener(this);
        rockButton.setBounds(125, 180, 125, 50);
        rockButton.setBackground(btnColor);
        rockButton.setForeground(txtColor);
        rockButton.setFont(font);


        gobtn = new JButton("Go");
        gobtn.addActionListener(this);
        gobtn.setBounds(150, 200,100, 50);
        gobtn.setBackground(btnColor);
        gobtn.setForeground(txtColor);
        gobtn.setFont(font);


        paperButton = new JButton("Paper");
        paperButton.addActionListener(this);
        paperButton.setBounds(125, 250, 125, 50);
        paperButton.setBackground(btnColor);
        paperButton.setForeground(txtColor);
        paperButton.setFont(font);

        scissorsButton = new JButton("Scissors");
        scissorsButton.addActionListener(this);
        scissorsButton.setBounds(125, 320, 125, 50);
        scissorsButton.setBackground(btnColor);
        scissorsButton.setForeground(txtColor);
        scissorsButton.setFont(font);

        f.add(textField);
        f.add(textField2);
        f.add(rockButton);
        f.add(paperButton);
        f.add(scissorsButton);
        f.addWindowListener(this);
        f2.addWindowListener(this);
        f2.add(textField3);
        f2.add(textField4);
        f2.add(gobtn);
       

        //f.setSize(400, 400);
        f2.setSize(400, 400);
        //f.setVisible(true);
        f.setResizable(false);
        f2.setVisible(true);
        f2.setResizable(false);

    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        int playerChoice; 
        int compChoice;   
        String winner;
        Random randomSeed = new Random(); 
        
        if(source==gobtn){
            f.setSize(400, 400);
            f.setVisible(true);
            f2.dispose();
        }
        if (source == rockButton) { 
            playerChoice = 0;
        }
        else if (source == paperButton){ 
            playerChoice = 1;
        } else {
            playerChoice = 2; 
        }
        compChoice = randomSeed.nextInt(3); 
        winner = findWinner(playerChoice, compChoice);
        JOptionPane.showMessageDialog(f, winner, "winner", JOptionPane.PLAIN_MESSAGE);       

        if (compChoice == 0) { 
            textField2.setText("Computer choice is rock");
        } else if (compChoice == 1) {
            textField2.setText("Computer choice is paper");
        } else {
            textField2.setText("Computer choice is scissors");
        }

    }
    private String findWinner(int playerChoice, int compChoice) {
        String winner;
        String Name=textField4.getText().toString();
        if (playerChoice == compChoice) { 
            winner = "Noone, it's a tie";
        } else if (playerChoice == 0 && compChoice == 1) {
            winner = "Computer is the Winner"; 
        } else if (playerChoice == 1 && compChoice == 2) {
            winner = "Computer is the Winner"; 
        } else if (playerChoice == 2 && compChoice == 0) {
            winner = "Computer is the Winner"; 
        } else {
            winner = Name+" is the Winner"; 
        } return winner; 
    }
    public void windowClosing(WindowEvent e) {

    	f.dispose();
        f2.dispose();
    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowOpened(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }
        public static void main(String[] args) {
        RockOnGo paper = new RockOnGo();
        //paper.setSize(1250,1250); // Setting up the pane
        //paper.createGUI();/*www.j  av  a 2s  .  co m*/
        //paper.show();
    }

    
}