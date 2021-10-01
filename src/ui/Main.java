package ui;

import java.util.Scanner;

public class Main {
	
		public static int lowest;
		public static int max;
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String matrixSize = sc.nextLine();
		int valueToBeNear = sc.nextInt();
		sc.nextLine();
		String[]line = matrixSize.split(" ");
		int column = Integer.parseInt(line[0]);
		int row = Integer.parseInt(line[1]);
		int [][] matrix = new int[column][row];
		lowest = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for(int i=0; i < column;i++) {
			String lineWithNumbers = sc.nextLine();
			String[]values = lineWithNumbers.split(" ");
			for(int j=0; j < row;j++) {
				matrix[i][j] = Integer.parseInt(values[j]);
			}
		}
		for(int i=0; i < column;i++) {
			int [] subArray = new int[row*column];
			for(int j=0; j < row;j++) {
				subArray[j] = matrix[i][j];
			}
		calculateNearestMax(subArray,0,row-1, valueToBeNear);
		}
		System.out.println(max);
	}
	public static void calculateNearestMax(int[]matrix, int firstPos, int lastPos, int toBeNear) {
		if(firstPos==lastPos) {
			int result = Math.abs(toBeNear-matrix[firstPos]);
			if(lowest>=result) {
				lowest = result;
				if(matrix[firstPos]>max) {
					max = matrix[firstPos];
				}
			return;
			}
		}else{
		int center = (firstPos+lastPos)/2;
		calculateNearestMax(matrix, firstPos, center, toBeNear);
		calculateNearestMax(matrix, center+1, lastPos, toBeNear);
		}
	}
}