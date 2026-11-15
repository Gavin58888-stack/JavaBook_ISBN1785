package goodMorning;

import java.awt.event.*;
import javax.swing.*;

class MyJFrame extends JFrame implements ActionListener {
	private JPanel contentPane;
	JButton btn1, btn2;
	public MyJFrame() {
		setTitle("問候");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 150);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btn1 = new JButton("中文");
		btn1.addActionListener(this);
		btn1.setBounds(50, 50, 90, 25);
		contentPane.add(btn1);

		btn2 = new JButton("英文");
		btn2.addActionListener(this);
		btn2.setBounds(150, 50, 90, 25);
		contentPane.add(btn2);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JButton hitBtn = (JButton) e.getSource();
		String msg = "早安!";
		if (hitBtn.getText().equals("英文"))
			msg = "Good morning!";
		JOptionPane.showMessageDialog(null, msg);
	}
}

public class GoodMorning {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}
