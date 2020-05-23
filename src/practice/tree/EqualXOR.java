package practice.tree;

public class EqualXOR{

	//static int lg = 31; 

	static class TrieNode 
	{ 

		// [0] index is bit 0 
		// and [1] index is bit 1 
		TrieNode children[]; 

		// Sum of indexes 
		// inserted at at a node 
		int sum_of_indexes; 

		// Number of indexes 
		// inserted at a node 
		int number_of_indexes; 

		// Constructor to initialize 
		// a newly created node 
		TrieNode() 
		{ 
			children = new TrieNode[2]; 
			this.children[0] = null; 
			this.children[1] = null; 
			this.sum_of_indexes = 0; 
			this.number_of_indexes = 0; 
		} 
	}; 

	// Function to insert curr_xor 
	// into the trie 
	static void insert(TrieNode node, 
			int num, 
			int index) 
	{ 

		// Iterate from the 31st bit 
		// to the 0th bit of curr_xor 
		// number 
		for (int bits = 31; bits >= 0; bits--)  
		{ 

			// Check if the current 
			// bit is set or not 
			int curr_bit = (num >> bits) & 1; 

			// If this node isn't already 
			// present in the trie structure 
			// insert it into the trie. 
			if (node.children[curr_bit] 
					== null) 
			{ 
				node.children[curr_bit] 
						= new TrieNode(); 
			} 

			node = node.children[curr_bit]; 
		} 

		// Increase the sum of 
		// indexes by the current 
		// index value 
		node.sum_of_indexes += index; 

		// Increase the number 
		// of indexes by 1 
		node.number_of_indexes++; 
	} 

	// Function to check if curr_xor 
	// is present in trie or not 
	static int query(TrieNode node, 
			int num, 
			int index) 
	{ 

		// Iterate from the 31st bit 
		// to the 0th bit of curr_xor number 
		for (int bits = 31; bits >= 0; bits--) 
		{ 

			// Check if the current bit 
			// is set or not 
			int curr_bit = (num >> bits) & 1; 

			// If this node isn't already 
			// present in the trie structure 
			// that means no sub array till 
			// current index has 0 xor so 
			// return 0 
			if (node.children[curr_bit] 
					== null) 
			{ 
				return 0; 
			} 

			node = node.children[curr_bit]; 
		} 

		// Calculate the number of index 
		// inserted at final node 
		int sz = node.number_of_indexes; 

		// Calculate the sum of index 
		// inserted at final node 
		int sum = node.sum_of_indexes; 

		int ans = (sz * index) - (sum); 

		return ans; 
	} 

	//Function to return the count of 
	//valid triplets 
	static int no_of_triplets(int arr[], int n) 
	{ 

		// To store cumulative xor 
		int curr_xor = 0; 

		int number_of_triplets = 0; 

		// The root of the trie 
		TrieNode root = new TrieNode(); 

		for (int i = 0; i < n; i++) 
		{ 

			int x = arr[i]; 

			// Insert the curr_xor in the trie 
			insert(root, curr_xor, i); 

			// Update the cumulative xor 
			curr_xor ^= x; 

			// Check if the cumulative xor 
			// is present in the trie or not 
			// if present then add 
			// (sz * index) - sum 
			number_of_triplets 
			+= query(root, curr_xor, i); 
		} 

		return number_of_triplets; 
	} 
}