import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Stack;

import javax.swing.JPanel;

public class CardPanel extends JPanel{
	
	
	
	/**
	 * 
	 */
	CardLoader _localCL = null;
	int _animationFlag=0;
	double _dragX = 0;
	double _dragY = 0;
	String _dragCard = null;
	int _clearFlag = 0;
//	
	
	public CardPanel() {
		// TODO Auto-generated constructor stub
		Mouselistener ml = new Mouselistener();
		this.addMouseListener(ml);
		this.addMouseMotionListener(ml);
	}
	
	
	
	public void setcardLoader(CardLoader cl){
		_localCL = cl;
	
	}
	
	

	public void paint(Graphics g) {
		super.paint(g);
		
		
		
				int x=getWidth();
				int hx= x/2;
				g.setColor(Color.white);
				
				g.drawString("FREE CELLS", 317, 20);
				g.drawRoundRect(20, 40, 151, 216, 10, 10);
				g.drawRoundRect(190,40, 151, 216, 10, 10);
				g.drawRoundRect(360, 40, 151, 216, 10, 10);
				g.drawRoundRect(530, 40, 151, 216, 10, 10);
				
				g.drawString("FOUNDATIONS", x-388, 20);
				g.drawRoundRect(x-170, 40, 151, 216, 10, 10);
				g.drawRoundRect(x-340, 40, 151, 216, 10, 10);
				g.drawRoundRect(x-510, 40, 151, 216, 10, 10);
				g.drawRoundRect(x-680, 40, 151, 216, 10, 10);
		
			
		
			Mouselistener.setW(getWidth());
			Mouselistener.setH(getHeight());
			
			
			if(_clearFlag!=0){
				
				Stack<String> b1 = (Stack<String>) _localCL.b1.clone();
				Stack<String> b2 = (Stack<String>) _localCL.b2.clone();
				Stack<String> b3 = (Stack<String>) _localCL.b3.clone();
				Stack<String> b4 = (Stack<String>) _localCL.b4.clone();
				Stack<String> b5 = (Stack<String>) _localCL.b5.clone();
				Stack<String> b6 = (Stack<String>) _localCL.b6.clone();
				Stack<String> b7 = (Stack<String>) _localCL.b7.clone();
				Stack<String> b8 = (Stack<String>) _localCL.b8.clone();
						
				Stack<String> _localb1 = reverse(b1);
				Stack<String> _localb2 = reverse(b2);
				Stack<String> _localb3 = reverse(b3);
				Stack<String> _localb4 = reverse(b4);
				Stack<String> _localb5 = reverse(b5);
				Stack<String> _localb6 = reverse(b6);
				Stack<String> _localb7 = reverse(b7);
				Stack<String> _localb8 = reverse(b8);
				
				Stack<String> tf1 = (Stack<String>) _localCL.tf1.clone();
				Stack<String> tf2 = (Stack<String>) _localCL.tf2.clone();
				Stack<String> tf3 = (Stack<String>) _localCL.tf3.clone();
				Stack<String> tf4 = (Stack<String>) _localCL.tf4.clone();
						
				Stack<String> f1 = reverse(tf1);
				Stack<String> f2 = reverse(tf2);
				Stack<String> f3 = reverse(tf3);
				Stack<String> f4 = reverse(tf4);
				
				Stack<String> tfc1 = (Stack<String>) _localCL.fc1.clone();
				Stack<String> tfc2 = (Stack<String>) _localCL.fc2.clone();
				Stack<String> tfc3 = (Stack<String>) _localCL.fc3.clone();
				Stack<String> tfc4 = (Stack<String>) _localCL.fc4.clone();
				
				if(f1.isEmpty())
					g.drawString("CLUBS", x-625, 148);
				if(f2.isEmpty())
					g.drawString("DIAMONDS", x-467, 148);
				if(f3.isEmpty())
					g.drawString("HEARTS", x-290, 148);
				if(f4.isEmpty())
					g.drawString("SPADES", x-121, 148);
				
				
				//CardPanel
			
				int j=0;
				while(!_localb1.isEmpty()){
					String s = _localb1.pop();
					g.drawImage(_localCL._hashMap.get(s), hx-670, 300+j, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!_localb2.isEmpty()){
					String s = _localb2.pop();
					g.drawImage(_localCL._hashMap.get(s), hx-500, 300+j, 150, 215, null);
					j=j+50;
						
				}
				j=0;
				while(!_localb3.isEmpty()){
					String s = _localb3.pop();
					g.drawImage(_localCL._hashMap.get(s), hx-330, 300+j, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!_localb4.isEmpty()){
					String s = _localb4.pop();
					g.drawImage(_localCL._hashMap.get(s), hx-160, 300+j, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!_localb5.isEmpty()){
					String s = _localb5.pop();
					g.drawImage(_localCL._hashMap.get(s), hx+10, 300+j, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!_localb6.isEmpty()){
					String s = _localb6.pop();
					g.drawImage(_localCL._hashMap.get(s), hx+180, 300+j, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!_localb7.isEmpty()){
					String s = _localb7.pop();
					g.drawImage(_localCL._hashMap.get(s), hx+350, 300+j, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!_localb8.isEmpty()){
					String s = _localb8.pop();
					g.drawImage(_localCL._hashMap.get(s), hx+520, 300+j, 150, 215, null);
					j=j+50;
				}
				
				//FreeCells
				j=0;
				if(!tfc1.isEmpty()){
					String s = tfc1.pop();
					g.drawImage(_localCL._hashMap.get(s), 21, 41, 150, 215, null);
					j=j+50;
				}
				if(!tfc2.isEmpty()){
					String s = tfc2.pop();
					g.drawImage(_localCL._hashMap.get(s), 191, 41, 150, 215, null);
					j=j+50;
				}
				if(!tfc3.isEmpty()){
					String s = tfc3.pop();
					g.drawImage(_localCL._hashMap.get(s), 361, 41, 150, 215, null);
					j=j+50;
				}
				if(!tfc4.isEmpty()){
					String s = tfc4.pop();
					g.drawImage(_localCL._hashMap.get(s), 531, 41, 150, 215, null);
					j=j+50;
				}
				
				//Foundations
				j=0;
				while(!f1.isEmpty()){
					String s = f1.pop();
					g.drawImage(_localCL._hashMap.get(s), x-679, 41, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!f2.isEmpty()){
					String s = f2.pop();
					g.drawImage(_localCL._hashMap.get(s), x-509, 41, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!f3.isEmpty()){
					String s = f3.pop();
					g.drawImage(_localCL._hashMap.get(s), x-339, 41, 150, 215, null);
					j=j+50;
				}
				j=0;
				while(!f4.isEmpty()){
					String s = f4.pop();
					g.drawImage(_localCL._hashMap.get(s), x-169, 41, 150, 215, null);
					j=j+50;
				}
				
				
					if(_dragCard!=null)
					g.drawImage(_localCL._hashMap.get(_dragCard),(int) _dragX-75,(int) _dragY-107, 150, 215, null);
					
					
				
					
				
			}
			
			
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Color _backgroundColor = new Color(30,90,25);
		setBackground(_backgroundColor);
		
	}
	public Stack<String> reverse(Stack <String> q)
	{
	    Stack<String> s = new Stack<String>();
	   
	   while(!q.isEmpty()){
		   s.push(q.pop());
	   }
	  
	   return s;
	    

	}



	

	
	
}
