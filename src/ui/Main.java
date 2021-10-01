package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);   
        
        String[] data = br.readLine().split(" ");
        int numberToFind = br.read();
        int matrix[][] = new int[Integer.parseInt(data[0])][Integer.parseInt(data[1])];
        for (int x=0; x < matrix.length; x++) {
        	  for (int y=0; y < matrix[x].length; y++) {
        	    matrix[x][y] = br.read();
        	  }
        	}
        
	}
}
