package day7;

public class Weather {

	  public static void main(String[] args) {
	        final int YEARS = 3;
	        final int QUARTERS = 5;

	        double[][] rain = new double[][] {
	            {368.1, 586.5, 351.2, 66.5, 0.0},
	            {173.9, 493.0, 448.4, 168.1, 0.0},
	            {172.8, 1012.4, 259.4, 46.7, 0.0}
	        };

	        for (int i = 0; i < YEARS; i++) {
	            double sum = 0.0;

	            for (int j = 0; j < QUARTERS - 1; j++) {
	                rain[i][QUARTERS - 1] += rain[i][j]; // 각 연도의 강우량을 더함
	            }

	            System.out.println("연도 " + (i + 2018) + "의 분기별 강우량: ");
	            for (int j = 0; j < QUARTERS; j++) {
	                System.out.print(rain[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}