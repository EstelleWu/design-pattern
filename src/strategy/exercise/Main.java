package strategy.exercise;

public class Main {

	public static void main(String[] args) {
		ChatClient cc = new ChatClient();
		cc.send("a", new Des());

	}

}
