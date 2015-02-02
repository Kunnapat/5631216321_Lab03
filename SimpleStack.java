
public class SimpleStack {
	ListNode top;
	int outputSum = 0;
	/**
	 * @param args
	 */
	// Add your members here
	public SimpleStack(int[] in) {
		for(int i = 0; i < in.length; i++){
			if(in[i] > 0){
				this.push(in[i]);
			} else {
				outputSum += this.pop();
			}
		}
		// Add your code here
	}
	public int getOutput() {
		// Add your code here
		return outputSum;
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
