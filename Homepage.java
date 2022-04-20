import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Homepage {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//rename 
		JLabel lblNewLabel = new JLabel("Project 5");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(167, 19, 117, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("File: ");
		lblNewLabel_1.setBounds(33, 133, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);

                JButton fileButton = new JButton("Select File");
		fileButton.setBounds(167, 208, 117, 41);
                fileButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();//"Open");
				chooser.showOpenDialog(null);
				chooser.setBounds(119, 119, 202, 41);
				frame.getContentPane().add(chooser);
			}
		});

		frame.getContentPane().add(fileButton);
		
		/*JButton btnNewButton = new JButton("Open");
		//btnNewButton.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
			//}
		//});
		//btnNewButton.setBounds(167, 208, 117, 41);
		//frame.getContentPane().add(btnNewButton);*/
		
	}
}
