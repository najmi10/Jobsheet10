/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss3;
/**
 *
 * @author ica
 */
public class TugasSS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka = 0;
        int[] data = new int []{92,98,76,72,84,101,39};
        System.out.print("Nilai pada array: ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + "\t");
            
        }
        int[]bil = new int[]{72,84,39};
        for(int j=0; j<data.length; j++){
            System.out.println("Bilangan kelipatan 3 adalah: "+bil[j]+"\t");
        }
        
        
    }
    
}
