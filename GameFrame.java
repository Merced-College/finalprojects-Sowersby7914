import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	//Checks the state of the code to ensure that upon startup, position remains the same, regardless of number of attempts
	
	GameFrame(){
			
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}