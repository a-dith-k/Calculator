import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.Cleaner.Cleanable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener {
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton sixButton;
	JButton fiveButton;
	JButton fourButton;
	JButton threeButton;
	JButton twoButton;
	JButton oneButton;
	JButton zeroButton;
	JButton clearButton;
	JButton deleteButton;
	JButton addButton;
	JButton multiplyButton;
	JButton divideButton;
	JButton substractButton;
	JButton dotButton;
	JButton equalButton;
	JButton magicButton;
	boolean isOperatorclicked=false;
	String oldValue;
		 public Calculator( ) {
		jf=new JFrame("Calculator");
		jf.setLayout(null );
		jf.setSize(485,610);
		jf.setLocation(1000,100);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(20,20,260,80);
		displayLabel.setBackground(Color.WHITE);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.black);
		displayLabel.setFont(new Font("",Font.PLAIN,20));
		jf.add(displayLabel); 
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(20, 110, 80, 80);
		sevenButton.setFont(new Font("Arial",Font.BOLD ,40));
		sevenButton.addActionListener(this);
		
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setFont(new Font("",Font.BOLD ,40));
		eightButton.setBounds(110, 110, 80, 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setFont(new Font("",Font.BOLD,40));
		nineButton.setBounds(200,110,80,80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(20, 200, 80, 80);
		fourButton.setFont(new Font("",Font.BOLD,40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5"); 
		fiveButton.setBounds(110,200,80,80);
		fiveButton.setFont(new Font("",Font.BOLD,40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(200,200,80,80);
		sixButton.setFont(new Font("",Font.BOLD,40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(20,290,80,80);
		oneButton.setFont(new Font("",Font.BOLD,40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(110,290,80,80);
		twoButton.setFont(new Font("",Font.BOLD,40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(200,290,80,80);
		threeButton.setFont(new Font("",Font.BOLD,40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		zeroButton=new  JButton("0");
		zeroButton.setBounds(20,380,170,80);
		zeroButton.setFont(new Font("",Font.BOLD,40));
		zeroButton.addActionListener(this);
		jf.add( zeroButton);
		
		deleteButton=new  JButton("BackSpace");
		deleteButton.setBounds(290,20,160,80);
		deleteButton.setFont(new Font("",Font.ITALIC,20));
		deleteButton.addActionListener(this);
		jf.add(deleteButton);
		
		addButton=new  JButton("+");
		addButton.setBounds(290,110,160,80);
		addButton.setFont(new Font("",Font.PLAIN,40) );
		addButton.addActionListener(this);
		jf.add(addButton);
		
		substractButton=new  JButton("-");
		substractButton.setBounds(290,200,160,80);
		substractButton.setFont(new Font("",Font.PLAIN,40));   
		substractButton.addActionListener(this);
		jf.add(substractButton);
		
		multiplyButton=new  JButton("*");
		multiplyButton.setBounds(290,290,160,80);
		multiplyButton.setFont(new Font("",Font.PLAIN,40));
		multiplyButton.addActionListener(this);
		jf.add(multiplyButton);
		
		dotButton=new  JButton(".");
		dotButton.setBounds(200,380,80,80);
		dotButton.setFont(new Font("",Font.BOLD,40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		equalButton=new  JButton("=");
		equalButton.setBounds(290,470,160,80);
		equalButton.setFont(new Font("",Font.PLAIN,40));
		equalButton.addActionListener(this);
		jf.add( equalButton);
		
		divideButton=new  JButton("/");
		divideButton.setBounds(20,470,170,80);
		divideButton.setFont(new Font("",Font.PLAIN,40));
		divideButton.addActionListener(this);
		jf.add(divideButton);
		
		magicButton=new  JButton("MaGiC");
		magicButton.setBounds(200,470,80,80);
		magicButton.setFont(new Font("",Font.PLAIN,15));
		magicButton.addActionListener(this);
		jf.add(magicButton);
		
		clearButton=new JButton("clear");
		clearButton.setBounds(290,380,160,80);
		clearButton.setFont(new Font("",Font.PLAIN,40));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		
		
		
		
	}
	 public static void main(String[] args) {
	      new Calculator();
	   
		
	
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(isOperatorclicked) {
				displayLabel.setText("7");
				displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		
		else if(e.getSource()==eightButton) {
			if(isOperatorclicked) {
				displayLabel.setText("8");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if(e.getSource()==nineButton) {
			if(isOperatorclicked) {
				displayLabel.setText("9");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if(e.getSource()==fourButton) {
			if(isOperatorclicked) {
				displayLabel.setText("4");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if(e.getSource()==fiveButton) {
			if(isOperatorclicked) {
				displayLabel.setText("5");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if(e.getSource()==sixButton) {
			if(isOperatorclicked) {
				displayLabel.setText("6");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if(e.getSource()==threeButton) {
			if(isOperatorclicked) {
				displayLabel.setText("3");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if(e.getSource()==twoButton) {
			if(isOperatorclicked) {
				displayLabel.setText("2");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if(e.getSource()==oneButton) {
			if(isOperatorclicked) {
				displayLabel.setText("1");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if(e.getSource()==zeroButton) {
			if(isOperatorclicked) {
				displayLabel.setText("0");
				oldValue=displayLabel.getText();
				isOperatorclicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		else if(e.getSource()==clearButton) {
			displayLabel.setText(" ");
		}
		else if(e.getSource()==deleteButton) {
			displayLabel.setText(displayLabel.getText());
		}
		else if(e.getSource()==addButton) {
			isOperatorclicked=true;
			
		}
		else if(e.getSource()==substractButton) {
			isOperatorclicked=true;
		}
		else if(e.getSource()==multiplyButton) {
			isOperatorclicked=true;
		}
		else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
		}
		else if(e.getSource()==divideButton) {
			isOperatorclicked=true;
		}
		else if(e.getSource()==equalButton) {
			String newValue=displayLabel.getText();
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			float result=oldValuef+newValuef;
			displayLabel.setText(result+"");
			
		}
		else if(e.getSource()==magicButton) {
			displayLabel.setText("go away stupid");
			
		}
		
		
		
		
		
		 
		 //JOptionPane.showMessageDialog(this, textBox.getText());
		
	}
}
