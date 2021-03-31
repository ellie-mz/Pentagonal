/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pentagonal;

/**
 *
 * @author Elaheh
 */
public class Pentagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0; i<=100; i++){
            if (i%10==0)
                System.out.printf("\n%7d",getPentagonal(i) );
            else
                System.out.printf("%7d ", getPentagonal(i));
            
        }
       
        
    }
   public static int getPentagonal(int n){
       int penNum=n*(3*n-1)/2;
       return(penNum);
   
   }
    
}
