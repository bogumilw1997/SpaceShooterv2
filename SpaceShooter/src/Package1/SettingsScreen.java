package Package1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SettingsScreen extends JFrame {
  
	FancyButton returnB;
    FancyButton controlsB;
    FancyButton musicB;
    JLabel backgroundL;
    JLabel titleL;
    
	public SettingsScreen() throws HeadlessException {

    	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ImageIcon img = new ImageIcon("pic/background.jpg");
        backgroundL = new JLabel("", img, JLabel.CENTER);
        backgroundL.setBounds(0, 0, 1920, 1080);
        GridBagLayout layout = new GridBagLayout();
        backgroundL.setLayout(layout);
        this.add(backgroundL);

        GridBagConstraints a = new GridBagConstraints();
        a.insets = new Insets(0, 0, 208, 0);
        a.anchor = GridBagConstraints.LINE_START;
        a.weightx = 1;
        a.weighty = 0;

        titleL = new JLabel("SPACE SHOOTER");
        titleL.setFont(new Font("Monospaced", Font.ITALIC, 150));
        titleL.setForeground(Color.WHITE);
        a.gridx = 0;
        a.gridy = 0;
        backgroundL.add(titleL, a);

        controlsB = new FancyButton("  Controls  ");
        a.gridx = 0;
        a.gridy = 2;
        a.insets = new Insets(0, 0, 20, 0);
        backgroundL.add(controlsB, a);

        musicB = new FancyButton("  Music  ");
        a.gridx = 0;
        a.gridy = 3;
        backgroundL.add(musicB, a);
       
        returnB = new FancyButton("  Return  ");
        a.gridx = 0;
        a.gridy = 4;
        backgroundL.add(returnB, a);
    }
	
}
