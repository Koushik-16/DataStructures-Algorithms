package greedyAlgorithm;

import java.util.Arrays;

public class FractionalKnapsac {
	
	static class Item {
		int weight;
		int value;
		Item(){};
		Item(int weight, int value){
			this.weight = weight;
			this.value = value;
		}
	}
	
	public static double maxProfit(int W, Item arr[], int n) {
		Arrays.sort(arr,(a,b)-> Double.compare(valuePerWeight(b),valuePerWeight(a)));
		int currWeight = 0;
		double finalValue = 0.0;
		for(int i = 0 ; i < n ; i++) {
			if(currWeight + arr[i].weight <= W) {
				currWeight += arr[i].weight;
				finalValue +=arr[i].value;
			}else {
				int remain = W - currWeight;
				finalValue += valuePerWeight(arr[i]) * (double)remain;
				break;
			}
		}
		return finalValue;
	}
	
	static double valuePerWeight(Item itm) {
		return (double)itm.value/(double)itm.weight;
	}

	public static void main(String[] args) {
		
		

	}

}
