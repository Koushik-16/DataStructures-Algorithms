package maps;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashMap {
	
	public static class HashMap<K,V>{
		
		
		public class HMNode{
			K key;
			V value;
			public HMNode(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}
		private  int size ;
		private  LinkedList<HMNode> [] buckets;
		
		public HashMap() {
			initbuckets(10);
			size = 0;
		}

		private void initbuckets(int N) {
			buckets = new LinkedList[N];
			for(int i = 0 ; i < buckets.length ; i++) {
				buckets[i] = new LinkedList<>();
			}
			
		}
		
		public void put(K key , V value) {
			int bi = hashFunction(key);
			int di = getIndexInBucket(key,bi);
			if(di != -1) {
				HMNode node = buckets[bi].get(di);
				node.value = value;
			}else {
			  HMNode node = new HMNode(key,value);
			  buckets[bi].add(node);
			  size++;
			}
			double lambda = size * 1.0 / buckets.length;
			if(lambda > 0.75) {
				rehash();
			}
		}

		private void rehash() {
			LinkedList<HMNode>[] oba = buckets;
			initbuckets(oba.length * 2);
			size = 0;
			for(int i = 0 ; i < oba.length; i++) {
				for(HMNode node : oba[i]) {
					put(node.key,node.value);
				}
			}
		}

		private int getIndexInBucket(K key, int bi) {
			int di = 0;
			for(HMNode node : buckets[bi]) {
				if(node.key.equals(key)) {
				  return di;	
				}
				di++;
			} 
			return -1;
		}

		private int hashFunction(K key) {
			int hc = key.hashCode();
			return Math.abs(hc) % buckets.length;
		}
		
		public boolean containsKey(K key) {
			int bi = hashFunction(key);
			int di = getIndexInBucket(key,bi);
			return di != -1 ? true : false;
		}
		
		public V get(K key) {
			int bi = hashFunction(key);
			int di = getIndexInBucket(key,bi);
			if(di != -1) {
				HMNode node = buckets[bi].get(di);
				return node.value;
			}else {
				return null;
			}
		}
		
		public V remove(K key) {
			int bi = hashFunction(key);
			int di = getIndexInBucket(key,bi);
			if(di != -1) {
				HMNode node = buckets[bi].remove(di);
				size--;
				return node.value;
			}else return null;
		}
		
		public int size() {
			return size;
		}
		
		public ArrayList<K> keySet(){
			ArrayList<K> keys = new ArrayList<>();
			for(int i = 0 ; i < buckets.length ; i++) {
				for(HMNode node : buckets[i]) {
					keys.add(node.key);
				}
			}
			return keys;
		}
		
		public V getOrDefault(K key, V value) {
			if(get(key) == null) return value;
			else return get(key);
		}
		
		
	}

	public static void main(String[] args) {
	 

	}

}
