import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

class OrderScreen extends JFrame  /*implements ActionListener*/ { 
	JTextField nameField = new JTextField(20);
	
	String types[] = {"Blueberry Cheese", "Choc Oreo", "Rich Chocolate", "Salted Caramel"};
	String sizes[] = {"7 inch", "8 inch", "10 inch", "12 inch"};
	JComboBox typeCombo = new JComboBox(types),
			sizeCombo = new JComboBox(sizes);
	
//	JRadioButton economy = new JRadioButton("Economy box (RM3)"),
//			standard = new JRadioButton("Standard box (RM6)"),
//			premium = new JRadioButton("Premium box (RM10)"),
//			yes = new JRadioButton("Yes (add Rm10)"),
//			no = new JRadioButton("No");
//	
//	JButton order = new JButton("ORDER"),
//			cancel = new JButton("CANCEL");


	public OrderScreen() {
		Container pane = getContentPane(); 
		//pane.setBackground(Color.white); 
		pane.setLayout(new FlowLayout());
		
		ImageIcon icon = new ImageIcon("brownies.jpg");
		JLabel image = new JLabel(icon);
	
		JPanel p1 = new JPanel ();
		JLabel name = new JLabel("NAME");
		p1.add(name);
		p1.add(nameField);
		
		JPanel banner = new JPanel();
		banner.setLayout(new BorderLayout());
		banner.add(image, BorderLayout.CENTER);
		banner.add(p1, BorderLayout.SOUTH);
		
		JPanel p2 = new JPanel();
		JLabel type = new JLabel("Type of Brownies :");
		p2.add(type);
		p2.add(typeCombo);
		
		JLabel size = new JLabel("Size of Brownies :");
		p2.add(size);
		p2.add(sizeCombo);
		

		
		JPanel select = new JPanel();
		select.setLayout(new BorderLayout(1,4));
		select.add(p2, BorderLayout.EAST);
//		banner.add(p1, BorderLayout.SOUTH);
		
		

		
		
		
		
		
		
		
		pane.add(banner);
		pane.add(select);


		
		
//		pane.add(new JLabel("Type of Brownies :"));
//
//		pane.add(new JLabel("Size of Brownies :"));
//
//		
//		pane.add(new JLabel("Type of Packaging :"));
//		pane.add(economy);
//		pane.add(standard);
//		pane.add(premium);
//		ButtonGroup packaging = new ButtonGroup();
//		packaging.add(economy);
//		packaging.add(standard);
//		packaging.add(premium);
//		
//		pane.add(new JLabel("Delivery :"));
//		pane.add(yes);
//		pane.add(no);
//		ButtonGroup delivery = new ButtonGroup();
//		delivery.add(yes);
//		delivery.add(no);
//
//		pane.add(order);
//		pane.add(cancel);

// 
//		my_text1.addActionListener(this);
//		my_text2.setEditable(false);
	}

//	public void actionPerformed(ActionEvent e) {
//		String input = my_text1.getText();
//
//		if (input.equals(""))
//			my_text2.setText("You didn't type anything");
//		else
//			my_text2.setText(input);
//	}

	public static void main(String [] args) { 
		OrderScreen frame = new OrderScreen();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("Safeyya Brownies House");
		frame.setSize(600, 520); 
		frame.setVisible(true);
	}
}