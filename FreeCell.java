import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 */

/**
 * @author kskch
 *
 */
public class FreeCell extends JFrame{

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FreeCell _mainFrame = new FreeCell();
		JMenuBar menuBar = new JMenuBar();
		
		
		Dimension _dimensionFrame = new Dimension (1450,900);
		Dimension _screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		
		int xpos = (_screenSize.width/2)-(_dimensionFrame.width/2);
		int ypos = (_screenSize.height/2)-(_dimensionFrame.height/2);
		
		JMenu menu = new JMenu("Menu   ");
		JMenuItem menuItemDeal = new JMenuItem("Deal");
		JMenuItem menuItemClear = new JMenuItem("Clear Table");
		JMenuItem menuItemClose = new JMenuItem("Close");
		JMenuListen _menuListener = new JMenuListen();
		
		
		
		menuItemClose.addActionListener(_menuListener);
		menuItemDeal.addActionListener(_menuListener);
		menuItemClear.addActionListener(_menuListener);
	
		
		menuBar.add(menu);
		menu.add(menuItemDeal);
		menu.add(menuItemClear);
		menu.addSeparator();
		menu.add(menuItemClose);
		
		
		_mainFrame.setJMenuBar(menuBar);
		_mainFrame.setVisible(true);
		_mainFrame.setTitle("FreeCell");
		_mainFrame.setMinimumSize(_dimensionFrame);
		_mainFrame.setLocation(xpos,ypos);
	
		
		_menuListener.setCardPanel(_mainFrame);
		_mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	
}
