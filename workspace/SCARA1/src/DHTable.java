import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class DHTable {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] headers = {
			     "i",
			     "alpha(i-1)",
			     "a(i-1)",
			     "d(i)",
			     "theta(i)"
			}; 
		
		String[][] data = {
				{"1","0","0","55","theta1"},
				{"2","0","55","0","theta2"},
				{"3","180","80","d3","0"},
				{"4","0","0","75","0"},
		};
		
		final JTextField theta1 = new JTextField("theta1");
		final JTextField theta2 = new JTextField("theta2");
		final JTextField d3 = new JTextField("d3");
		
		
		JTable DHtable = new JTable(data, headers);
		DHtable.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(DHtable);
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		panel.add(scrollPane);
		panel.add(theta1);
		panel.add(theta2);
		panel.add(d3);
		JButton button = new JButton("Ok");
        panel.add(button);
                
        button.addActionListener(new java.awt.event.ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
        	//String t1 = "";
        	//t1 = theta1.getText();
        	int t_1 = Integer.parseInt(theta1.getText());
        	int t_2 = Integer.parseInt(theta2.getText());
        	int d_3 = Integer.parseInt(d3.getText());
        	
        	//SCARA1.operating(t_1, t_2, d_3);
        	
        	//System.out.print(t_1);
        	//System.out.print(" ");
        	//System.out.print(t_2);
        	//System.out.print(" ");
        	//System.out.print(d_3);
        	
        	
            }
        });
        
		frame.getContentPane().add(panel);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}

}
