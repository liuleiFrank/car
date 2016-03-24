package com.ubird.demo;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.ubird.sort.merge.ui.SortPanel;
import com.ubird.ui.UFrame;

public class SortDemo {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				UFrame frame = new UFrame("Merge sort V0.5.0 by JohnCha");
				int[] sortData = gererateSortData(100);
				frame.getContentPane().add(new SortPanel(900, 400, 1, sortData ));
				frame.pack();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}

	public static int[] gererateSortData(int num) {
		Random rand = new Random();
		int[] data = new int[num];
		int i=0;
		while(i<num){
			int rn = rand.nextInt(num)+1;
			if(isNotIn(rn, data)){
				data[i++] = rn;
			}
		}
		return data;
	}

	private static boolean isNotIn(int rn, int[] data) {
		for(int d : data){
			if(d==rn)
				return false;
		}
		return true;
	}

}