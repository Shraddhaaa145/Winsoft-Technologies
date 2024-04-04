class MergeArrays { 
	
	void moveToEnd(int X[], int size) 
	{ 
		int i, j = size - 1; 
		for (i = size - 1; i >= 0; i--) { 
			if (X[i] != -1) { 
				X[j] = X[i]; 
				j--; 
			} 
		} 
	} 

	void merge(int X[], int Y[], int m, int n) 
	{ 
		int i = n; 

		int j = 0; 
		
		int k = 0; 

		while (k < (m + n)) 
		{ 
			if ((i < (m + n) && X[i] <= Y[j]) 
				|| (j == n)) { 
				X[k] = X[i]; 
				k++; 
				i++; 
			} 
			else  
			{ 
				X[k] = Y[j]; 
				k++; 
				j++; 
			} 
		} 
	} 

	
	void printArray(int arr[], int size) 
	{ 
		int i; 
		for (i = 0; i < size; i++) 
			System.out.print(arr[i] + " "); 

		System.out.println(""); 
	} 

	
	public static void main(String[] args) 
	{ 
		MergeArrays mergearray = new MergeArrays(); 

		
		int X[] = { -1, 2, -1, 3, -1, 5, 6, -1, -1  }; 
		int Y[] = { 1, 8, 9, 10, 15  }; 
		int n = Y.length; 
		int m = X.length - n; 
		
		mergearray.moveToEnd(X, m + n); 

		mergearray.merge(X, Y, m, n); 

		mergearray.printArray(X, m + n); 
	} 
}