public class Calculator {
	private int result;
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	public void minus(int ... params) {
		for (Integer param : params) {
			this.result = params[0] - params[1];
		}
	}
	public int getResult() {
		return this.result;
	}
	public void cleanResult() {
		this.result = 0;
	}
}