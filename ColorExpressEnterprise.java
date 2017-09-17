import javax.swing.JFrame;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class ColorExpressEnterprise {
	private static JTextField rText;
	private static JTextField gText;
	private static JTextField bText;
	
	private static JTextArea textArea = new JTextArea();
	private static byte[] pathToCMYKProfile;
	


public static void showCode(Color i){
	
	
	
	String hex = String.format("#%02x%02x%02x", i.getRed(), i.getGreen(), i.getBlue());  
	textArea.setText("color information \n"+"rgb:	  "+ i.getRed() +"/"+ i.getGreen() +"/" +i.getBlue()+"\nRGB:	 "+i.getRGB()+"\nHEX/html: " + hex +"" );
}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Color Express Enterprise Pro ++");
		
		
	
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel colorView = new JPanel();
		colorView.setBounds(12, 13, 533, 287);
		colorView.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(colorView);
		colorView.setLayout(null);
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				textArea.setBackground(Color.DARK_GRAY);
				
			}
		});
		textArea.setForeground(Color.WHITE);
		textArea.setFont(new Font("Consolas", Font.BOLD, 17));
		
		
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setEditable(false);
		textArea.setBounds(332, 186, 189, 88);
		colorView.add(textArea);
		
		JSlider rSlider = new JSlider();
		rSlider.setBounds(68, 313, 477, 20);
		
		rSlider.setMaximum(255);
		
		frame.getContentPane().add(rSlider);
		
		rText = new JTextField();
		rText.setBounds(12, 311, 56, 22);
		rText.setEnabled(false);
		rText.setEditable(false);
		rText.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(rText);
		rText.setColumns(10);
		
		gText = new JTextField();
		gText.setBounds(12, 343, 56, 22);
		gText.setEnabled(false);
		gText.setEditable(false);
		gText.setColumns(10);
		gText.setBackground(new Color(50, 205, 50));
		frame.getContentPane().add(gText);
		
		
		
		bText = new JTextField();
		bText.setBounds(12, 376, 56, 22);
		bText.setEnabled(false);
		bText.setEditable(false);
		bText.setColumns(10);
		bText.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(bText);
		
		
		
		JSlider gSlider = new JSlider();
		gSlider.setBounds(68, 345, 477, 20);
		gSlider.setMaximum(255);
		frame.getContentPane().add(gSlider);
		
		JSlider bSlider = new JSlider();
		bSlider.setBounds(68, 378, 477, 20);
		bSlider.setMaximum(255);
		frame.getContentPane().add(bSlider);
		
		JLabel lblCodedBysmsh = new JLabel("Coded by ~SmSH");
		lblCodedBysmsh.setForeground(Color.GRAY);
		lblCodedBysmsh.setFont(new Font("Consolas", Font.BOLD, 15));
		lblCodedBysmsh.setBounds(445, 411, 112, 16);
		frame.getContentPane().add(lblCodedBysmsh);
		frame.setSize(575, 472);
		frame.setVisible(true);
		
		rSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Color i = new Color(rSlider.getValue(), gSlider.getValue(), bSlider.getValue());
				colorView.setBackground(i);
				textArea.setBackground(i);
				lblCodedBysmsh.setForeground(i);
				showCode(i);
				
			}
		});
		gSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Color i = new Color(rSlider.getValue(), gSlider.getValue(), bSlider.getValue());
				colorView.setBackground(i);
				textArea.setBackground(i);
				lblCodedBysmsh.setForeground(i);
				showCode(i);
			}
		});
		
		bSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Color i = new Color(rSlider.getValue(), gSlider.getValue(), bSlider.getValue());
				colorView.setBackground(i);
				textArea.setBackground(i);
				lblCodedBysmsh.setForeground(i);
				showCode(i);
			}
		});
		
	}
}
