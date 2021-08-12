package SOP;

import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JComponent;


public class ItemComponent extends JComponent
{
	protected Item item;
	public ItemComponent(Item item)
	{
		this.item=item;
		
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent( g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(item.image,0,0 , null);
	}
}
