/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
		public void testMixed(){

        /** Test data contains with both positive, negative and zeros **/
    	int[] arr = new int[5];
        arr[0] = -2;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = -1;
        arr[4] = 2;

        SelectionSort temp= new SelectionSort();
        temp.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -1;
        Sortedarr[2] = 0;
        Sortedarr[3] = 1;
        Sortedarr[4] = 2;

        assertArrayEquals(Sortedarr,arr);
    }

    public void testDuplicates(){

        /** Test data contains duplicates **/
    	int[] arr = new int[7];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 2;
        arr[3] = 1;
        arr[4] = 2;
        arr[5]=-1;
        arr[6]=-1;


        SelectionSort temp= new SelectionSort();
        temp.basicSelectionSort(arr);

        int[] Sortedarr = new int[7];
        Sortedarr[0] = -1;
        Sortedarr[1] = -1;
        Sortedarr[2] = 0;
        Sortedarr[3] = 1;
        Sortedarr[4] = 1;
        Sortedarr[5] = 2;
        Sortedarr[6] = 2;

        assertArrayEquals(Sortedarr,arr);

    }

		public void testPositive(){
		 int[] arr = new int[5];
		 arr[0] = 8;
		 arr[1] = 9;
		 arr[2] = 7;
		 arr[3] = 10;
		 arr[4] = 2;

		 SelectionSort temp= new SelectionSort();
		 temp.basicSelectionSort(arr);

		 int[] Sortedarr = new int[5];
		 Sortedarr[0] = 2;
		 Sortedarr[1] = 7;
		 Sortedarr[2] = 8;
		 Sortedarr[3] = 9;
		 Sortedarr[4] = 10;

		 assertArrayEquals(Sortedarr,arr);
 }

 public void testNegative(){

	 /** Test data contains negative values only **/

	 int[] arr = new int[5];
		 arr[0] = -8;
		 arr[1] = -9;
		 arr[2] = -7;
		 arr[3] = -10;
		 arr[4] = -2;

		 SelectionSort temp= new SelectionSort();
		 temp.basicSelectionSort(arr);

		 int[] Sortedarr = new int[5];
		 Sortedarr[0] = -10;
		 Sortedarr[1] = -9;
		 Sortedarr[2] = -8;
		 Sortedarr[3] = -7;
		 Sortedarr[4] = -2;

		 assertArrayEquals(Sortedarr,arr);
 }

}
