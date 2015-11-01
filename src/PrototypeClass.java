import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class PrototypeClass {

	private static JFrame frmDumplingMan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrototypeClass window = new PrototypeClass();
					window.frmDumplingMan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrototypeClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDumplingMan = new JFrame();
		frmDumplingMan.setTitle("Dumpling Man");
		frmDumplingMan.setBounds(100, 100, 800, 600);
		frmDumplingMan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDumplingMan.setResizable(false);
		frmDumplingMan.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("U press start button.");
				NameInput nameInput=new NameInput();
				nameInput.setVisible(true);
			}
		});
		btnNewButton.setBounds(567, 351, 157, 52);
		frmDumplingMan.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("U press exit button.");
				frmDumplingMan.dispose();			}
		});
		button.setBounds(567, 448, 157, 52);
		frmDumplingMan.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("Dumpling Man");
		lblNewLabel.setFont(new Font("·s²Ó©úÅé", Font.PLAIN, 41));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(182, 172, 318, 80);
		frmDumplingMan.getContentPane().add(lblNewLabel);
	}
	public static void frmClosed() {
		frmDumplingMan.dispose();
	}

}
