import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Room  {
	private static JFrame RoomFrame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Room() {
		RoomFrame=new JFrame();
		RoomFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RoomFrame.setResizable(false);
		RoomFrame.setBounds(100, 100, 800,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		RoomFrame.setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Create Room");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("U press create room button.");
				RoomFrame.dispose();
				WaitingRoom waitingRoom=new WaitingRoom();
				waitingRoom.setVisible(true);
			}
		});
		btnNewButton.setBounds(301, 163, 172, 62);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Join Room");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("U press join room button.");
				RoomIP roomIP=new RoomIP();
				roomIP.setVisible(true);
			}
		});
		button.setBounds(301, 286, 172, 62);
		contentPane.add(button);
		contentPane.add(btnNewButton);
	}
	public static void roomClosed() {
		RoomFrame.dispose();
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		RoomFrame.setVisible(b);
	}
}
