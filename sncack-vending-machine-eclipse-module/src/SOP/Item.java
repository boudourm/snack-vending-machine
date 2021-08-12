package SOP;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

public class Item
{
	protected String name;
	protected BufferedImage image;
	protected double price;

	public Item(String name , String imageName , double price) throws IOException, URISyntaxException
	{
		this.name = name;
		System.out.println(new File((imageName)));
		this.image = ImageIO.read(new File(imageName));
		this.price = price;
	}
		
	public void remove() throws IOException, InterruptedException
	{
		name = "Empty";
		image = ImageIO.read(new File("Empty.jpg"));
		price = 0.00;
	}
	
}
