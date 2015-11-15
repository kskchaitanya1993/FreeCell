import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

public class CardLoader{

	HashMap <String, BufferedImage> _hashMap = new HashMap <String, BufferedImage>();
	HashMap <Integer, String> _cardMap = new HashMap <Integer,String>();
	HashMap <String, String> _color = new HashMap <String, String>();
	HashMap <String, Integer> _rank = new HashMap <String, Integer>();
	HashMap <String, Integer> _suit = new HashMap <String, Integer>();
	Stack<String> b1=null,b2=null,b3=null,b4=null,b5=null,b6=null,b7=null,b8=null;
	Stack<String> fc1=null,fc2=null,fc3=null,fc4=null;
	Stack<String> tf1=null, tf2=null, tf3=null, tf4 =null;
	
	
	
	CardLoader()  {
		
		BufferedImage[] bImg = new BufferedImage[52];
		
		File crddir=new File("..//FreeCell/PNG-cards-1.3/");
		String s ="..//FreeCell/PNG-cards-1.3/";
		String imgs[]=crddir.list();
		
		String SuitFace = null;
		String Suit = null;
		String Face = null;
		
		
		for(int i=0;i<52;i++){
						
			StringTokenizer st = new StringTokenizer(imgs[i],"_");
			
			Face = st.nextToken(); //2
			st.nextToken(); //of

			StringTokenizer s1= new StringTokenizer(st.nextToken(),".");
			Suit = s1.nextToken();//clubs
			SuitFace = Suit+Face; //clubs2
			
			
			
			imgs[i]=s+imgs[i];
			
			try {
				bImg[i]=ImageIO.read(new File(imgs[i]));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			_hashMap.put(SuitFace, bImg[i]);
			_cardMap.put(i, SuitFace);
			
			
			switch(Suit){
			case "clubs":
				_color.put(SuitFace, "Black");
				_suit.put(SuitFace, 1);
				break;
			case "diamonds":
				_color.put(SuitFace, "Red");
				_suit.put(SuitFace, 2);
				break;
			case "hearts":
				_color.put(SuitFace, "Red");
				_suit.put(SuitFace, 3);
				break;
			case "spades":
				_color.put(SuitFace, "Black");
				_suit.put(SuitFace, 4);
			}
			
			
			
			switch(Face){
			case "ace":
				_rank.put(SuitFace, 1);
				break;
			case "2":
				_rank.put(SuitFace, 2);
				break;
			case "3":
				_rank.put(SuitFace, 3);
				break;
			case "4":
				_rank.put(SuitFace, 4);
				break;
			case "5":
				_rank.put(SuitFace, 5);
				break;
			case "6":
				_rank.put(SuitFace, 6);
				break;
			case "7":
				_rank.put(SuitFace, 7);
				break;
			case "8":
				_rank.put(SuitFace, 8);
				break;
			case "9":
				_rank.put(SuitFace, 9);
				break;
			case "10":
				_rank.put(SuitFace, 10);
				break;
			case "jack":
				_rank.put(SuitFace, 11);
				break;
			case "queen":
				_rank.put(SuitFace, 12);
				break;
			case "king":
				_rank.put(SuitFace, 13);
				break;
			default:
				_rank.put(null, 0);
				break;
			
				
			}
				
			
		}
		
	}
 
	private void initializeBuckets()
	{
		b1 = new Stack<String>();
		b2 = new Stack<String>();
		b3 = new Stack<String>();
		b4 = new Stack<String>();
		b5 = new Stack<String>();
		b6 = new Stack<String>();
		b7 = new Stack<String>();
		b8 = new Stack<String>();
		
		fc1=new Stack<String>();
		fc2=new Stack<String>();
		fc3=new Stack<String>();
		fc4=new Stack<String>();
		
		tf1 = new Stack<String>();
		tf2 = new Stack<String>();
		tf3 = new Stack<String>();
		tf4 = new Stack<String>();
		
	}
	
	public void Shuffle(){
		
		 System.out.println("Shuffeling");
		 
		 ArrayList<Integer> numbers = new ArrayList<Integer>();   
		 Random randomGenerator = new Random();
		 while (numbers.size() < 52) {

		     int random = randomGenerator.nextInt(52);
		     if (!numbers.contains(random)) {
		         numbers.add(random);
		     }
		 }

		 initializeBuckets();
		 
		int i =0;
		while(i<52){
			b1.push( _cardMap.get(numbers.get(i)));
			b2.push( _cardMap.get(numbers.get(i+1)));
			b3.push( _cardMap.get(numbers.get(i+2)));
			b4.push( _cardMap.get(numbers.get(i+3)));
			
			if(i==48)
			{break;}
			
			b5.push( _cardMap.get(numbers.get(i+4)));
			b6.push( _cardMap.get(numbers.get(i+5)));
			b7.push( _cardMap.get(numbers.get(i+6)));
			b8.push( _cardMap.get(numbers.get(i+7)));
			i+=8;
		}
		
		System.out.println("b1: "+Arrays.toString(b1.toArray()));
		System.out.println("b2: "+Arrays.toString(b2.toArray()));
		System.out.println("b3: "+Arrays.toString(b3.toArray()));
		System.out.println("b4: "+Arrays.toString(b4.toArray()));
		System.out.println("b5: "+Arrays.toString(b5.toArray()));
		System.out.println("b6: "+Arrays.toString(b6.toArray()));
		System.out.println("b7: "+Arrays.toString(b7.toArray()));
		System.out.println("b8: "+Arrays.toString(b8.toArray()));
		
		
		
	}

	
	
}
