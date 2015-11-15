import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Stack;

public class Mouselistener implements MouseListener,MouseMotionListener{

	static double scx;
	static double scy;
	static String tempstack= null;
	static Stack<String> sourcestack = null;
	
	
	public static void setW(double x) {
		// TODO Auto-generated method stub
		scx=x;
	}

	public static void setH(double y) {
		// TODO Auto-generated method stub
		scy=y;
	}
	
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
	
			double x = e.getX();
			double y = e.getY();
			
			double hx = scx/2;
			CardPanel cardPanel = (CardPanel)e.getSource();
			
			if(cardPanel._clearFlag==0)return;
			//FreeCells
			
			if(x>=20&&x<=170 & y>=40&&y<=225 && !cardPanel._localCL.fc1.isEmpty()){
				System.out.println("Clicked in 1st block");
					sourcestack=cardPanel._localCL.fc1;
					tempstack=sourcestack.pop();
			}
			else if(x>=190&&x<=340 & y>=40&&y<=225 && !cardPanel._localCL.fc2.isEmpty()){
				System.out.println("Clicked in 2nd block");
					sourcestack=cardPanel._localCL.fc2;
					tempstack=sourcestack.pop();
			}
			else if(x>=360&&x<=510 & y>=40&&y<=225 && !cardPanel._localCL.fc3.isEmpty()){
				System.out.println("Clicked in 3rd block");
				sourcestack=cardPanel._localCL.fc3;
					tempstack=sourcestack.pop();
			}
			else if(x>=530&&x<=680 & y>=40&&y<=225 && !cardPanel._localCL.fc4.isEmpty()){
				System.out.println("Clicked in 4th block");
					sourcestack=cardPanel._localCL.fc4;
					tempstack=sourcestack.pop();
			}
			
			//Foundations
			
			else if(x>=scx-680&&x<=scx-530 & y>=40&&y<=225 && !cardPanel._localCL.tf1.isEmpty()){
				System.out.println("Clicked in 1st foundations");
				sourcestack=cardPanel._localCL.tf1;
				tempstack=sourcestack.pop();
			}
			
			else if(x>=scx-510&&x<=scx-360 & y>=40&&y<=225 && !cardPanel._localCL.tf2.isEmpty()){
				System.out.println("Clicked in 2nd foundations");
				sourcestack=cardPanel._localCL.tf2;
				tempstack=sourcestack.pop();
			}
			else if(x>=scx-340&&x<=scx-190 & y>=40&&y<=225 && !cardPanel._localCL.tf3.isEmpty()){
				System.out.println("Clicked in 3rd foundations");
				sourcestack=cardPanel._localCL.tf3;
				tempstack=sourcestack.pop();
			}
			else if(x>=scx-170&&x<=scx-20 & y>=40&&y<=225 && !cardPanel._localCL.tf4.isEmpty()){
				System.out.println("Clicked in 4th foundations");
				sourcestack=cardPanel._localCL.tf4;
				tempstack=sourcestack.pop();
			}
			
			//CardPanel
			
			else if(x>=hx-670&&x<=hx-520 & y>=300 & !cardPanel._localCL.b1.isEmpty()){
				System.out.println("Clicked in 1st Column");
				sourcestack=cardPanel._localCL.b1;
				tempstack=sourcestack.pop();
			}
			else if(x>=hx-500&&x<=hx-350 & y>=300 & !cardPanel._localCL.b2.isEmpty()){
				System.out.println("Clicked in 2nd Column");
				sourcestack=cardPanel._localCL.b2;
				tempstack=sourcestack.pop();
			}
			else if(x>=hx-330&&x<=hx-180 & y>=300 & !cardPanel._localCL.b3.isEmpty()){
				System.out.println("Clicked in 3rd Column");
				sourcestack=cardPanel._localCL.b3;
				tempstack=sourcestack.pop();
			}
			else if(x>=hx-160&&x<=hx-10 & y>=300 & !cardPanel._localCL.b4.isEmpty()){
				System.out.println("Clicked in 4th Column");
				sourcestack=cardPanel._localCL.b4;
				tempstack=sourcestack.pop();
			}
			
			else if(x>=hx+10&&x<=hx+160 & y>=300 & !cardPanel._localCL.b5.isEmpty()){
				System.out.println("Clicked in 5th Column");
				sourcestack=cardPanel._localCL.b5;
				tempstack=sourcestack.pop();
			}
			else if(x>=hx+180&&x<=hx+330 & y>=300 & !cardPanel._localCL.b6.isEmpty()){
				System.out.println("Clicked in 6th Column");
				sourcestack=cardPanel._localCL.b6;
				tempstack=sourcestack.pop();
			}
			else if(x>=hx+350&&x<=hx+500 & y>=300 & !cardPanel._localCL.b7.isEmpty()){
				System.out.println("Clicked in 7th Column");
				sourcestack=cardPanel._localCL.b7;
				tempstack=sourcestack.pop();
			}
			else if(x>=hx+520&&x<=hx+670 & y>=300 & !cardPanel._localCL.b8.isEmpty()){
				System.out.println("Clicked in 8th Column");
				sourcestack=cardPanel._localCL.b8;
				tempstack=sourcestack.pop();
			}
			else{
				sourcestack=null;
				tempstack=null;
				
			}
		
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		if(sourcestack==null) return;
		
	
			
			double x = e.getX();
			double y = e.getY();
		
			double hx = scx/2;
			CardPanel cardPanel = (CardPanel)e.getSource();
			
			//cardPanel.setSize(d);
			
			 if(x>=20&&x<=170 & y>=40&&y<=225 & cardPanel._localCL.fc1.isEmpty() & tempstack!=null ){
				System.out.println("Released in 1st block");
					cardPanel._localCL.fc1.push(tempstack);
					cardPanel.repaint();
					tempstack=null;
					sourcestack=null;
					cardPanel._dragCard=null;
			}
			else if(x>=190&&x<=340 & y>=40&&y<=225 & tempstack!=null & cardPanel._localCL.fc2.isEmpty()){
				System.out.println("Released in 2nd block");
				cardPanel._localCL.fc2.push(tempstack);
				cardPanel.repaint();
				sourcestack=null;
				tempstack=null;
				cardPanel._dragCard=null;
			}
			else if(x>=360&&x<=510 & y>=40&&y<=225 & tempstack!=null & cardPanel._localCL.fc3.isEmpty()){
				System.out.println("Released in 3rd block");
				cardPanel._localCL.fc3.push(tempstack);
				sourcestack=null;
				cardPanel.repaint();			
				tempstack=null;
				cardPanel._dragCard=null;
			}
			else if(x>=530&&x<=680 & y>=40&&y<=225 & tempstack!=null & cardPanel._localCL.fc4.isEmpty()){
				System.out.println("Released in 4th block");
				cardPanel._localCL.fc4.push(tempstack);
				sourcestack=null;
				cardPanel.repaint();
				tempstack=null;
				cardPanel._dragCard=null;
			}
			
			
			else if(x>=scx-680&&x<=scx-530 & y>=40&&y<=225 & tempstack!=null && cardPanel._localCL._suit.get(tempstack)==1){
				System.out.println("Released in 1st foundations");
				if(cardPanel._localCL.tf1.isEmpty() && cardPanel._localCL._rank.get(tempstack)==1)
					cardPanel._localCL.tf1.push(tempstack);
				else if(!cardPanel._localCL.tf1.isEmpty() && cardPanel._localCL._rank.get(tempstack)-1==cardPanel._localCL._rank.get(cardPanel._localCL.tf1.peek()))
					cardPanel._localCL.tf1.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				sourcestack=null;
				tempstack=null;
				cardPanel._dragCard=null;
			}
			
			else if(x>=scx-510&&x<=scx-360 & y>=40&&y<=225 & tempstack!=null && cardPanel._localCL._suit.get(tempstack)==2){
				System.out.println("Released in 2nd foundations");
				if(cardPanel._localCL.tf2.isEmpty() && cardPanel._localCL._rank.get(tempstack)==1)
					cardPanel._localCL.tf2.push(tempstack);
				else if(!cardPanel._localCL.tf2.isEmpty() && cardPanel._localCL._rank.get(tempstack)-1==cardPanel._localCL._rank.get(cardPanel._localCL.tf2.peek()))
					cardPanel._localCL.tf2.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			else if(x>=scx-340&&x<=scx-190 & y>=40&&y<=225 & tempstack!=null && cardPanel._localCL._suit.get(tempstack)==3){
				System.out.println("Released in 3rd foundations");
				if(cardPanel._localCL.tf3.isEmpty() && cardPanel._localCL._rank.get(tempstack)==1)
					cardPanel._localCL.tf3.push(tempstack);
				else if(!cardPanel._localCL.tf3.isEmpty() && cardPanel._localCL._rank.get(tempstack)-1==cardPanel._localCL._rank.get(cardPanel._localCL.tf3.peek()))
					cardPanel._localCL.tf3.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			else if(x>=scx-170&&x<=scx-20 && y>=40&&y<=225 && tempstack!=null && cardPanel._localCL._suit.get(tempstack)==4){
				System.out.println("Released in 4th foundations");
				if(cardPanel._localCL.tf4.isEmpty() && cardPanel._localCL._rank.get(tempstack)==1)
					cardPanel._localCL.tf4.push(tempstack);
				else if(!cardPanel._localCL.tf4.isEmpty() && cardPanel._localCL._rank.get(tempstack)-1==cardPanel._localCL._rank.get(cardPanel._localCL.tf4.peek()))
					cardPanel._localCL.tf4.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			
			//CardPanel
			
			else if(x>=hx-670&&x<=hx-520 & y>=300 & tempstack!=null ){
				
				System.out.println("Released in 1st Column");
				if(!cardPanel._localCL.b1.isEmpty() && cardPanel._localCL._color.get(tempstack)!=cardPanel._localCL._color.get(cardPanel._localCL.b1.peek()) && cardPanel._localCL._rank.get(tempstack)+1==cardPanel._localCL._rank.get(cardPanel._localCL.b1.peek()))
					cardPanel._localCL.b1.push(tempstack);
				else if(cardPanel._localCL.b1.isEmpty())
					cardPanel._localCL.b1.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			else if(x>=hx-500&&x<=hx-350 & y>=300 & tempstack!=null ){
					System.out.println("Released in 2nd Column");
				if(!cardPanel._localCL.b2.isEmpty() && cardPanel._localCL._color.get(tempstack)!=cardPanel._localCL._color.get(cardPanel._localCL.b2.peek()) && cardPanel._localCL._rank.get(tempstack)+1==cardPanel._localCL._rank.get(cardPanel._localCL.b2.peek()))
					cardPanel._localCL.b2.push(tempstack);
				else if(cardPanel._localCL.b2.isEmpty())
					cardPanel._localCL.b2.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			else if(x>=hx-330&&x<=hx-180 & y>=300 & tempstack!=null){
				System.out.println("Released in 3rd Column");
				if(!cardPanel._localCL.b3.isEmpty() && cardPanel._localCL._color.get(tempstack)!=cardPanel._localCL._color.get(cardPanel._localCL.b3.peek()) && cardPanel._localCL._rank.get(tempstack)+1==cardPanel._localCL._rank.get(cardPanel._localCL.b3.peek()))
					cardPanel._localCL.b3.push(tempstack);
				else if(cardPanel._localCL.b3.isEmpty())
					cardPanel._localCL.b3.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			else if(x>=hx-160&&x<=hx-10 & y>=300 & tempstack!=null){
				System.out.println("Released in 4th Column");
				if(!cardPanel._localCL.b4.isEmpty() && cardPanel._localCL._color.get(tempstack)!=cardPanel._localCL._color.get(cardPanel._localCL.b4.peek()) && cardPanel._localCL._rank.get(tempstack)+1==cardPanel._localCL._rank.get(cardPanel._localCL.b4.peek()))
					cardPanel._localCL.b4.push(tempstack);
				else if(cardPanel._localCL.b4.isEmpty())
					cardPanel._localCL.b4.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
					
			else if(x>=hx+10&&x<=hx+160 & y>=300 & tempstack!=null ){
				System.out.println("Released in 5th Column");
				if(!cardPanel._localCL.b5.isEmpty() && cardPanel._localCL._color.get(tempstack)!=cardPanel._localCL._color.get(cardPanel._localCL.b5.peek()) && cardPanel._localCL._rank.get(tempstack)+1==cardPanel._localCL._rank.get(cardPanel._localCL.b5.peek()))
					cardPanel._localCL.b5.push(tempstack);
				else if(cardPanel._localCL.b5.isEmpty())
					cardPanel._localCL.b5.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			else if(x>=hx+180&&x<=hx+330 & y>=300 & tempstack!=null ){
				System.out.println("Released in 6th Column");
				if(!cardPanel._localCL.b6.isEmpty() && cardPanel._localCL._color.get(tempstack)!=cardPanel._localCL._color.get(cardPanel._localCL.b6.peek()) && cardPanel._localCL._rank.get(tempstack)+1==cardPanel._localCL._rank.get(cardPanel._localCL.b6.peek()))
					cardPanel._localCL.b6.push(tempstack);
				else if(cardPanel._localCL.b6.isEmpty())
					cardPanel._localCL.b6.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			else if(x>=hx+350&&x<=hx+500 & y>=300 & tempstack!=null){
				System.out.println("Released in 7th Column");
				if(!cardPanel._localCL.b7.isEmpty() && cardPanel._localCL._color.get(tempstack)!=cardPanel._localCL._color.get(cardPanel._localCL.b7.peek()) && cardPanel._localCL._rank.get(tempstack)+1==cardPanel._localCL._rank.get(cardPanel._localCL.b7.peek()))
					cardPanel._localCL.b7.push(tempstack);
				else if(cardPanel._localCL.b7.isEmpty())
					cardPanel._localCL.b7.push(tempstack);
				else
					sourcestack.push(tempstack);
				cardPanel.repaint();
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
			}
			else if(x>=hx+520&&x<=hx+670 & y>=300 & tempstack!=null ){
				System.out.println("Released in 8th Column");
				if( !cardPanel._localCL.b8.isEmpty() && cardPanel._localCL._color.get(tempstack)!=cardPanel._localCL._color.get(cardPanel._localCL.b8.peek()) && cardPanel._localCL._rank.get(tempstack)+1==cardPanel._localCL._rank.get(cardPanel._localCL.b8.peek()))
					cardPanel._localCL.b8.push(tempstack);
				else if(cardPanel._localCL.b8.isEmpty())
					cardPanel._localCL.b8.push(tempstack);
				else
					sourcestack.push(tempstack);
				
				tempstack=null;
				sourcestack = null;
				cardPanel._dragCard=null;
				cardPanel.repaint();
				
			}
			else{
				sourcestack.push(tempstack);
				cardPanel.repaint();
				cardPanel._dragCard=null;
				tempstack=null;
				sourcestack = null;
			}
		
				
	}

	

	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		if(sourcestack==null)return;
		
		CardPanel cardPanel = (CardPanel)e.getSource();
		double x = e.getX();
		double y = e.getY();
		cardPanel._dragX = x;
		cardPanel._dragY = y;
		cardPanel._dragCard = tempstack;
		cardPanel.repaint();
		
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
