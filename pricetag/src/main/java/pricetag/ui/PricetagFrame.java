package pricetag.ui;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pricetag.Main;

public class PricetagFrame extends JFrame {

	private static final long serialVersionUID = -7249952855398551719L;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	
	public PricetagFrame(Main main) {
		super("Pricetag 0.0.1");
		
		Image icon = Toolkit.getDefaultToolkit().getImage(PricetagFrame.class.getResource("/pricetag.png"));
		this.setIconImage(icon);
		
		StashPanel stashPanel = new StashPanel(main);
		
	}
	

}
