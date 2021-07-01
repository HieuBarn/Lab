/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaultdoor7;

/**
 *
 * @author win
 */
public class Vaultdoor7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1;i<500; i++) {
            for (int j = 1;j<500; j++) {
                for (int k = 1;k<500; k++) {
                    for (int l = 1;l<500; l++) {
                        for (int m = 1;m<500; m++) {
                            if(Math.abs(i-j)==2
                                    && Math.abs(j-k)==3
                                    && Math.abs(k-l)==4
                                    && Math.abs(l-m)==5
                                    && Math.abs(m-i)==6
                                    && (i+j+k+l+m)==1979)
                                System.out.println("i:"+i+", j:"+j+", k:"+k+", l:"+l+", m:"+m);
                                break;
                        }
                    }
                }
            }
        }
    }
    
}
