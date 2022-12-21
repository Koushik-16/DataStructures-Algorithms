package vectorAndStacks;
import java.util.*;
import java.io.*;


public class FrequencyStack {
	
	Map<Integer,Integer> freqMap;
	Map<Integer,Stack<Integer>> freqStack;
	int maxFreq;
	
    public FrequencyStack() {
    	freqMap = new HashMap<>();
    	freqStack = new HashMap<>();
    	maxFreq = 0;
    }
    // Incrementing value in freqMap
    // updating maxFreq
    // Adding value in freqStack
    public void push(int val) {
        int freq = freqMap.getOrDefault(val,0) + 1;
        freqMap.put(val, freq);
        maxFreq = Math.max(maxFreq, freq);
        freqStack.computeIfAbsent(freq, f -> new Stack<Integer>()).push(val);
    }
    //return and remove top of maxFreq
    // update maxFreq
    //update freqMap
    public  int pop() {
    	Stack<Integer> st = freqStack.get(maxFreq);
    	int top = st.pop();
    	if(st.isEmpty()) maxFreq--;
    	freqMap.put(top, freqMap.get(top)-1);
		return top;
    }

	public static void main(String[] args) {
		

	}

}
