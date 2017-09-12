package org.practice;

import java.util.*;
import java.lang.*;
import java.io.*;

public class NES {
	public static void main (String[] args) {
		//code
		int array[] ={1, 3, 2, 4} ;
		int n = array.length;
		System.err.println(n);
		checkNext(array,n);
	}

	private static void checkNext(int[] array, int n) {
		// TODO Auto-generated method stub
		int next, i, j;
		for (i = 0; i < n; i++) {
			next = -1;
			for (j = i + 1; j < n; j++) {
				if (array[i] < array[j]) {
					next = array[j];
					break;
				}
			}
			System.err.println(array[i] + " --- " + next);
		}
	}
}