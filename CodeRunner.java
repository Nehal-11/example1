package factoryPattern;

public class CodeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryCodeRunner oFactoryPatternCodeRunner = new FactoryCodeRunner();
		Os Os1 = oFactoryPatternCodeRunner.getInstance("Andriod");
		Os1.spec();
	}

}
