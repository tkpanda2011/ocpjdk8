package com.aurotech.techgig;

public class HelicopterProblem {

	public static void main(String[] args) {
		int[] input1 = { 5, 5 };
		String[] input2 = { "11111", "01010", "10001", "00001", "11110" };
		int result = landingPosition(input1, input2);
		System.out.println(result);
	}



    public static int landingPosition(int[] input1,String[] input2)
    {
        int result = -1;
        if (input1 != null && input1.length == 2 
                && input2 != null && input2.length > 0
                && input1[0] == input2.length) {
            int rows = input1[1];
            int symbols = input1[0];
            int[] emptySpaceinRows = new int[rows];
            for (int i = 0 ; i < rows ; i++) {
                    if (input1[1] == input2[i].length()) {
                        String chars = input2[i];
                        int emptySpaceCountOfRow = 0 ;
                        int maxSpace = 0 ; 
                         for (int sym = 0; sym < symbols ; sym++) {
                            if (chars.charAt(sym)=='0') {
                                emptySpaceCountOfRow++;
                            } else {
                                emptySpaceCountOfRow = 0 ;
                            }
                            
                            if (emptySpaceCountOfRow >= 1) {
                                maxSpace = emptySpaceCountOfRow;
                            }
                    }
                 emptySpaceinRows[i] = maxSpace;   
            }
            }
            
            for (int k = 0; k< emptySpaceinRows.length ; k++ ) {
                if (emptySpaceinRows[0] < emptySpaceinRows[k]) {
                    emptySpaceinRows[0] = emptySpaceinRows[k];
                }
            }
            if (emptySpaceinRows[0] != 0) {
                result = emptySpaceinRows[0];
            }
        }
        return result;
    }

}
