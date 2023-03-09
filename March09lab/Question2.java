package March09lab;
public class Question2 {
	public static void main(String args[]) {
		//create array
		int arr1[] = {1, 4, 25, 55, 78, 99};
		int arr2[] = {2, 3, 4, 34, 55, 68, 75, 78, 100};
		int arr3[] = {4, 55, 62, 78, 88, 98};
		int i = 0, j = 0, k = 0, x = 0;
		// print the array1
		System.out.print("Array1: ");
		// use for loop
		for(x = 0; x < arr1.length; x++) {
		System.out.print(arr1[x] + " ");
		}
		System.out.println(" ");
		System.out.print("Array2: ");// print the array2
		for(x = 0; x < arr2.length; x++) {
		System.out.print(arr2[x] + " ");
		}
		System.out.println(" ");
		System.out.print("Array3: ");// print the array3
		for(x = 0; x < arr3.length; x++) {
		System.out.print(arr3[x] + " ");
		}
		System.out.println(" ");
		System.out.println("The common elements in the 3 sorted arrays are: ");
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
		if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
		System.out.print(arr1[i] + " ");
		i++;
		j++;
		k++;
		}else if (arr1[i] < arr2[j]) {
		i++;
		}else if (arr2[j] < arr3[k]) {
		j++;
		}else {
		k++;
		}}}}
		