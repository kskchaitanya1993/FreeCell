import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuListen implements ActionListener{

	FreeCell _localCP = null;
	CardPanel _cardPane = new CardPanel();
	CardLoader _cardLoader = new CardLoader();

	
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		_cardPane.setcardLoader(_cardLoader);
		
		
		if(e.getActionCommand()=="Close")
		{
			System.exit(0);
		}
		else if(e.getActionCommand()=="Clear Table"){
			
			_cardPane._clearFlag=0;
			_cardPane.repaint();
			
		}
		else if (e.getActionCommand() == "Deal"){
			_cardLoader.Shuffle();
			_cardPane._clearFlag=1;
			_cardPane.repaint();
		}
	}

		public void setCardPanel(FreeCell _mainFrame){
			_localCP = _mainFrame;
			_localCP.add(_cardPane);
		}
}
