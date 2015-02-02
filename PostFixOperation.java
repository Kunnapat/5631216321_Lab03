
public class PostFixOperation {
	ListNode top;
	/**
	 * @param args
	 */
	// Add your members here 
	public PostFixOperation(String input) {
		for(int i = 0; i < input.length(); i++){
			String s = "" + input.charAt(i);
			if(s.equals("+")){
				int temp = this.pop() + this.pop();
				this.push(temp);
			} else if(s.equals("-")){
				int temp = this.pop();
				temp = this.pop() - temp;
				this.push(temp);
			} else if(s.equals("*")){
				int temp = this.pop() * this.pop();
				this.push(temp);
			} else if(s.equals("/")){
				int temp = this.pop();
				temp = this.pop() / temp;
				this.push(temp);
			} else {
				int temp = Integer.parseInt(s);
				this.push(temp);
			}
		}
		// Add your code here
	}
	public int getOutput() {
		// Add your code here
		return (Integer) this.top.element;
	}
	private int pop() {
		// Add your code here
		if( isEmpty() ){
			return 0;
		} else {
			int temp = (Integer) top.element;
			top = top.next;
			return temp;
		}
	}
	private void push(int in) {
		top = new ListNode(in, top);
		// Add your code here
	}
	private boolean isEmpty(){
		return top == null;
	}
}
