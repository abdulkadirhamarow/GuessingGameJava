import javax.swing.JFrame;

public class BubbleDraw extends JFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Abdul's bubble command version");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new BubblePanel());
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
