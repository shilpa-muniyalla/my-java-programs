package com.shil;

public class DuplicateNumberInArray2 {
	
	
		
		public static void findDuplicateNumberInArray2(int[] array) {
			
			for (int i=0;i<array.length-1;i++) {
				for(int j=i+1;j<array.length;j++) {
					if(array[i]==array[j]) {
						System.out.println("The duplicatenumber in the array is: "+array[j]);
					}
				}
			}
		}

		public static void main(String[] args) {
			int[] array= {1,2,3,2,1,2,5,6};
		
			DuplicateNumberInArray2.findDuplicateNumberInArray2(array);
		}

	}


