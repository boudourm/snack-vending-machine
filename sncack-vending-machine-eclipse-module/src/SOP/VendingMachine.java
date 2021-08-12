package SOP;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import jdk.internal.dynalink.support.DefaultInternalObjectFilter;

public class VendingMachine
{
	private JFrame frame = new 	JFrame("Vending Machine");
	private JPanel mainPanel = new JPanel(new BorderLayout());
	private JPanel displayPanel = new JPanel(new GridLayout(4,3));
	private JPanel userPanel = new JPanel(new BorderLayout());
	private JPanel totalPanel = new JPanel(new GridLayout(2,1));
	private JPanel selectionPanel = new JPanel(new GridLayout(5,1));
	private JPanel paymentPanel = new JPanel(new GridLayout(4,1));
	private JButton doritos_ = new JButton();
	private JButton nestea_ = new JButton();
	private JButton coca_ = new JButton();
	private JButton mnms_ = new JButton();
	private JButton submit = new JButton("Pay");
	private JButton clear = new JButton("Clear Selection");
	private JLabel select = new JLabel("Press a Button",SwingConstants.CENTER);
	private JLabel pay = new JLabel("Enter Amount",SwingConstants.CENTER);
	private JLabel total = new JLabel("Total",SwingConstants.CENTER);
	private JTextField acceptPay = new JTextField();
	private JTextField totalDisplay  = new JTextField();
	ItemComponent[] items = new ItemComponent[12];
	private int index;
	private int doritosCount;
	private int nesteaCount;
	private int cocaCount;
	private int mnmsCount;
	
	
	public static void main(String[] args) throws IOException, URISyntaxException
	{
		VendingMachine vm =  new VendingMachine();
		vm.setUp();
	}
	
	public void setUp() throws IOException, URISyntaxException
	{
		index=-1;
		doritosCount= 3;
		nesteaCount=3;
		cocaCount=3;
		mnmsCount=3;
		
		frame.setSize(520,750);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(mainPanel,BorderLayout.CENTER);
		totalDisplay.setText("$0.00");
		totalDisplay.setHorizontalAlignment(JTextField.CENTER);
		Item doritos1 = new Item("Doritos","Doritos.jpg",1.25);
		Item doritos2 = new Item("Doritos","Doritos.jpg",1.25);
		Item doritos3 = new Item("Doritos","Doritos.jpg",1.25);
		Item nestea1 = new Item("Nestea","Nestea.jpg",2.25);
		Item nestea2 = new Item("Nestea","Nestea.jpg",2.25);
		Item nestea3 = new Item("Nestea","Nestea.jpg",2.25);
		Item coca1 = new Item("Coca","Coca.jpg",0.75);
		Item coca2 = new Item("Coca","Coca.jpg",0.75);
		Item coca3 = new Item("Coca","Coca.jpg",0.75);
		Item mnms1 = new Item("Mnms","Mnms.jpg",1.25);
		Item mnms2 = new Item("Mnms","Mnms.jpg",1.25);
		Item mnms3 = new Item("Mnms","Mnms.jpg",1.25);
		
		
		items[0] = new ItemComponent(doritos1);
		items[1] = new ItemComponent(doritos2);
		items[2] = new ItemComponent(doritos3);
		items[3] = new ItemComponent(nestea1);
		items[4] = new ItemComponent(nestea2);
		items[5] = new ItemComponent(nestea3);
		items[6] = new ItemComponent(coca1);
		items[7] = new ItemComponent(coca2);
		items[8] = new ItemComponent(coca3);
		items[9] = new ItemComponent(mnms1);
		items[10] = new ItemComponent(mnms2);
		items[11] = new ItemComponent(mnms3);
	
		displayPanel.add(items[0]);
		displayPanel.add(items[1]);
		displayPanel.add(items[2]);
		displayPanel.add(items[3]);
		displayPanel.add(items[4]);
		displayPanel.add(items[5]);
		displayPanel.add(items[6]);
		displayPanel.add(items[7]);
		displayPanel.add(items[8]);
		displayPanel.add(items[9]);
		displayPanel.add(items[10]);
		displayPanel.add(items[11]);
		
		
		//for (int i = 0; i < 12; i++)
		//{
		//	displayPanel.add(items[i]);
		//}
		mainPanel.add(displayPanel,BorderLayout.CENTER);
		doritos_.setIcon(new ImageIcon("Doritos_.jpg"));
		nestea_.setIcon(new ImageIcon("Nestea_.jpg"));
		coca_.setIcon(new ImageIcon("Coca_.jpg"));
		mnms_.setIcon(new ImageIcon("Mnms_.jpg"));
		doritos_.setBorder(new TitledBorder(new EtchedBorder()));
		nestea_.setBorder(new TitledBorder(new EtchedBorder()));
		coca_.setBorder(new TitledBorder(new EtchedBorder()));
		mnms_.setBorder(new TitledBorder(new EtchedBorder()));
		mainPanel.add(userPanel,BorderLayout.EAST);
		
		userPanel.add(totalPanel,BorderLayout.NORTH);
		totalPanel.setBorder(new TitledBorder(new EtchedBorder()));
		total.setFont(new Font("Button Font",Font.BOLD,20));
		totalDisplay.setEditable(false);
		totalPanel.add(total);
		totalPanel.add(totalDisplay);
		
		userPanel.add(selectionPanel,BorderLayout.CENTER);
		selectionPanel.setBorder(new TitledBorder(new EtchedBorder()));
		select.setFont(new Font("Button Font",Font.BOLD,20));
		selectionPanel.add(select);
		selectionPanel.add(doritos_);
		selectionPanel.add(nestea_);
		selectionPanel.add(coca_);
		selectionPanel.add(mnms_);
		
		userPanel.add(paymentPanel,BorderLayout.SOUTH);
		paymentPanel.setBorder(new TitledBorder(new EtchedBorder()));
		pay.setFont(new Font("Button Font",Font.BOLD,20));
		paymentPanel.add(pay);
		paymentPanel.add(acceptPay);
		paymentPanel.add(submit);
		paymentPanel.add(clear);
		
		submit.setEnabled(false);
		defineAction();
		frame.setVisible(true);
		
		}
	
	public void defineAction()
	{
		doritos_.addActionListener(new ActionListener()
				{public void actionPerformed(ActionEvent event)
				{
			       if(doritosCount>0)
			       {
			    	totalDisplay.setText("$1.25");
			    	for (int i = 2; i >=0; i--)
			    	{
			    		if(items[i].item.name.equals("Doritos"))
			    		{
			    			index =i;
			    			break;
			    		}
					}
			    	submit.setEnabled(true);
			       }
				}});
		
		nestea_.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent event)
		{
	       if(nesteaCount>0)
	       {
	    	totalDisplay.setText("$2.50");
	    	for (int i = 5; i >=3; i--)
	    	{
	    		if(items[i].item.name.equals("Nestea"))
	    		{
	    			index =i;
	    			break;
	    		}
			}
	    	submit.setEnabled(true);
	       }
		}});

		
		coca_.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent event)
		{
	       if(cocaCount>0)
	       {
	    	totalDisplay.setText("$0.75");
	    	for (int i = 8; i >=6; i--)
	    	{
	    		if(items[i].item.name.equals("Coca"))
	    		{
	    			index =i;
	    			break;
	    		}
			}
	    	submit.setEnabled(true);
	       }
		}});

		
		mnms_.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent event)
		{
	       if(mnmsCount>0)
	       {
	    	totalDisplay.setText("$1.25");
	    	for (int i = 11; i >9; i--)
	    	{
	    		if(items[i].item.name.equals("Mnms"))
	    		{
	    			index =i;
	    			break;
	    		}
			}
	    	submit.setEnabled(true);
	       }
		}});

		submit.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				if((!acceptPay.getText().equals("")))
				{
					double required;
					double provided;
					String s = totalDisplay.getText();
					s=s.substring(1);
					required = Double.parseDouble(s);
					s=acceptPay.getText();
					provided=Double.parseDouble(s);
					if(provided<required)
					{
						required = required - provided;
						totalDisplay.setText("$"+required);
						acceptPay.setText("");
						return;
					
					}
					if(index<0) return;
					if(provided>=required)
					{
						try{
							items[index].item.remove();
							
						}
						catch(IOException e)
						{
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						String itemPurchased = items[index].item.name;
						switch(itemPurchased)
						{
						case "Doritos" : doritosCount--;
						                 break;
						case "Nestea" : nesteaCount--;
		                 break;
		
						case "Coca" : cocaCount--;
		                 break;
						
						case "Mnms" : mnmsCount--;
		                 break;
		
						}
						frame.repaint();
						
					}
					totalDisplay.setText("$0.00");
					acceptPay.setText("");
					submit.setEnabled(false);
						
				}
				else
				{
					totalDisplay.setText("$0.00");
					submit.setEnabled(false);
				}
				
			}
		});
		
     clear.addActionListener(new ActionListener()
    		 {
    	        public void actionPerformed(ActionEvent event)
    	        {
    	        	totalDisplay.setText("$0.00");
    	        	acceptPay.setText("");
    	        	index = -1;
    	        	submit.setEnabled(false);
    	        	
    	        }
    		 });
	}
	
	
	
}
