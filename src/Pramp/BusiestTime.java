package Pramp;

/**
 * Created by sunginjung on 1/4/18.
 */
public class BusiestTime {

    static int findBusiestPeriod(int[][] data) {

        int currentCustomer = 0;
        int maximumCustomer = Integer.MIN_VALUE;
        int timeStamp = 0;
        // 0 : 10, 1    0 : 4, 0
        for(int i = 0; i < data.length;  i++) {
            if(data[i][2] == 1) {
                currentCustomer += data[i][1];
            } else {
                currentCustomer -= data[i][1];
            }

            if ( i < data.length - 1 && data[i + 1][0] == data[i][0]){
                continue;
            }

            if(currentCustomer > maximumCustomer) {
                maximumCustomer = currentCustomer;
                timeStamp = data[i][0];
            }

        }

        return timeStamp;

    }
