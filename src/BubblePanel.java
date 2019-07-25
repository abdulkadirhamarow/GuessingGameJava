import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BubblePanel extends JPanel {
	
	private ArrayList<Bubble> bubbleList;
	private int size = 30;
	
	
	public BubblePanel()
	{
		
		bubbleList = new ArrayList<Bubble>();
		
		addMouseListener(new BubbleListener());
		
		setBackground(Color.black);
		
		setPreferredSize(new Dimension(600,450));
		
		
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		
		//draw all the bubbles from bubbleList
		
		   for(Bubble bubble : bubbleList)
		   {
			   page.setColor(Color.yellow);
			   page.fillOval(bubble.x - bubble.size/2, bubble.y - bubble.size/2, bubble.size, bubble.size);
		   }
		
		// write the numberof bubbles
		
		page.setColor(Color.GREEN);
		
		page.drawString("Count : " + bubbleList.size() ,5, 10);
	}
	
	
	//inner class for event handlers
	
	private class BubbleListener implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			//add bubbleList to mouse location
			bubbleList.add(new Bubble( e.getX(), e.getY(), size));
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class Bubble
	{
		private int x;
		private int y;
		private int size;
		
		public Bubble(int newY,int newX, int newSize)
		{
			x = newX;
			y = newY;
			size = newSize;
			
		}
	}

}
