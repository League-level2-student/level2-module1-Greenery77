package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	
	JButton add = new JButton();
	 
	 JButton view = new JButton();
	 
	 ArrayList<String> names = new ArrayList<String>();
	 
	public void createUI(){
	
	 JFrame frame = new JFrame();
	 
	 frame.show();

	 JPanel panel = new JPanel();
	 
	 frame.add(panel);
	 
	 panel.add(add);
	 
	 panel.add(view);
	 
	 add.addActionListener(this);
	 
	 add.setLabel("Add Name");
	 
	 view.addActionListener(this);
	
	 view.setLabel("View Names");
	 
	 frame.pack();
	 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == add) {
			
			String name = JOptionPane.showInputDialog("Enter a name.");
			
			names.add(name);
			
		}
		
		if (e.getSource() == view) {
			
			for(String s : names){
				System.out.println("Guest #" +  +  s);
			}
			
		}
		
	}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
