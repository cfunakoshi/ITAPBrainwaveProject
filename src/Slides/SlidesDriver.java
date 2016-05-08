package Slides;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlidesDriver {
	private static int count = 0;

	public static void main(String[] args) {
		//set up frame for GUI
		JFrame frame = new JFrame("ITAP Neuro Experiment");
		
		//set panel for GUI
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		//set button panel for GUI
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		
		//set slide for GUI
		final JPanel slidePanel = new JPanel();
		slidePanel.setLayout(new GridBagLayout());
		
		//set button to change slides
		final JButton next = new JButton("Next");
		next.setFont(next.getFont().deriveFont(30.0f));
		
		final JLabel showPicture = new JLabel();
		
		//array list that contains slides
		final ArrayList<ImageIcon> slides = new ArrayList<ImageIcon>(24);
		Random rand = new Random();
		
		next.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(count == 24){
							showPicture.setIcon(null);
							showPicture.setText("Done");
							showPicture.setFont(showPicture.getFont().deriveFont(100.0f));
							next.setEnabled(false);
						}
						else{
							showPicture.setText(" ");
							int temp = rand.nextInt(24 - count);
							showPicture.setIcon(slides.get(temp));
							slides.remove(temp);
							count += 1;
						}
								 
						}
					 }
			);
		
		//retrieve pictures of problems from SlidesDriver class
		ImageIcon Pic1_1 = new ImageIcon(SlidesDriver.class.getResource("/Pics/1.1.jpg"));
		ImageIcon Pic1_2 = new ImageIcon(SlidesDriver.class.getResource("/Pics/1.2.jpg"));
		ImageIcon Pic1_3 = new ImageIcon(SlidesDriver.class.getResource("/Pics/1.3.jpg"));
		ImageIcon Pic1_4 = new ImageIcon(SlidesDriver.class.getResource("/Pics/1.4.jpg"));
		ImageIcon Pic1_5 = new ImageIcon(SlidesDriver.class.getResource("/Pics/1.5.jpg"));
		
		ImageIcon Pic2_1 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.1.jpg"));
		ImageIcon Pic2_2 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.2.jpg"));
		ImageIcon Pic2_3 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.3.jpg"));
		ImageIcon Pic2_4 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.4.jpg"));
		ImageIcon Pic2_5 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.5.jpg"));
		ImageIcon Pic2_6 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.6.jpg"));
		ImageIcon Pic2_7 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.7.jpg"));
		ImageIcon Pic2_8 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.8.jpg"));
		ImageIcon Pic2_9 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.9.jpg"));
		ImageIcon Pic2_10 = new ImageIcon(SlidesDriver.class.getResource("/Pics/2.10.jpg"));
		
		ImageIcon Pic3_1 = new ImageIcon(SlidesDriver.class.getResource("/Pics/3.1.jpg"));
		ImageIcon Pic3_2 = new ImageIcon(SlidesDriver.class.getResource("/Pics/3.2.jpg"));
		ImageIcon Pic3_3 = new ImageIcon(SlidesDriver.class.getResource("/Pics/3.3.jpg"));

		ImageIcon Pic4_1 = new ImageIcon(SlidesDriver.class.getResource("/Pics/4.0.1.jpg"));
		ImageIcon Pic4_2 = new ImageIcon(SlidesDriver.class.getResource("/Pics/4.0.jpg"));
		
		ImageIcon Pic5_1 = new ImageIcon(SlidesDriver.class.getResource("/Pics/5.1.jpg"));
		ImageIcon Pic5_2 = new ImageIcon(SlidesDriver.class.getResource("/Pics/5.2.jpg"));
		ImageIcon Pic5_3 = new ImageIcon(SlidesDriver.class.getResource("/Pics/5.3.jpg"));
		ImageIcon Pic5_4 = new ImageIcon(SlidesDriver.class.getResource("/Pics/5.4.jpg"));
		ImageIcon Pic5_5 = new ImageIcon(SlidesDriver.class.getResource("/Pics/5.5.jpg"));		
		
		//add problems to slides 
		slides.add(0,Pic1_1);
		slides.add(1,Pic1_2);
		slides.add(2,Pic1_3);
		slides.add(3,Pic1_4);
		slides.add(4,Pic1_5);
		
		slides.add(5,Pic2_1);
		slides.add(6,Pic2_2);
		slides.add(7,Pic2_3);
		slides.add(8,Pic2_4);
		slides.add(9,Pic2_5);
		slides.add(10,Pic2_6);
		slides.add(11,Pic2_7);
		slides.add(12,Pic2_8);
		slides.add(13,Pic2_9);
		slides.add(14,Pic2_10);
		
		slides.add(15,Pic3_1);
		slides.add(16,Pic3_2);
		slides.add(17,Pic3_3);

		slides.add(18,Pic4_1);
		slides.add(19,Pic4_2);

		slides.add(20,Pic5_1);
		slides.add(21,Pic5_2);
		slides.add(22,Pic5_3);
		slides.add(23,Pic5_4);
		slides.add(24,Pic5_5);		
		
		//set "next" button size
		next.setPreferredSize(new Dimension(40, 40));
		
		//set panel background
		panel.setBackground(Color.DARK_GRAY);
		
		//add "next" button to the panel
		buttonPanel.add(next);
		buttonPanel.setOpaque(false);	
		
		//add slides to the panel
		slidePanel.add(showPicture);
		slidePanel.setOpaque(false);
		
		//add slidePanel and buttonPanel to the main panel
		panel.add(slidePanel,BorderLayout.CENTER);
		panel.add(buttonPanel,BorderLayout.SOUTH);
		
		//set responsive frame dimensions 
		Toolkit tk = Toolkit.getDefaultToolkit();  
		int xSize = ((int) tk.getScreenSize().getWidth());  
		int ySize = ((int) tk.getScreenSize().getHeight());
		
		next.setPreferredSize(new Dimension(xSize-50, 50));
		
		frame.setSize(xSize,ySize);
		frame.setContentPane(panel);
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

