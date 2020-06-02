/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchalgo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Gerges hanna FCI-H
 */
public class FindDominator {  
    
    // Solution 1 
    //Time complexity : O(n^2)
    public String daimondElement(int[] arr) {
        String indx="";
        int len=arr.length;
        int daimondCount = len/2;
        for (int i=0;i<len;i++) {
            int count = 0;
            for (int k=0 ; k<len ; k++) {
                if (arr[k] == arr[i]) {
                    count += 1;
                    indx=indx+k+',';
                }
            }
            if (count > daimondCount) {
                return indx;
            }
            indx="";
        }
        return "-1";    
    }
    
    // Solution 2
    //Time complexity : O(n)
    public String secondSolution(int[] arr) {
        int count = 0;
        int daimond = 0;
        String indx="";

        for (int i=0 ; i<arr.length ;i++) {
            if (count == 0) {
                daimond = arr[i];
                count = 1;
                continue;
            }else
            {
                if(daimond==arr[i])
                {
                    count++;
                }else
                {
                    count--;
                }
            }
            
        }
        if(count==0)
        {
            return "-1";
        }
        count=0;
        for (int i = 0; i < arr.length; i++) {
            if (daimond==arr[i]) {
                indx=indx+i+',';
                count++;
            }
        }
        if(count>arr.length/2)
        {
            return indx;
        }else
        {
            return "-1";
        }
    }
    
}
