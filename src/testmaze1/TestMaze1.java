package testmaze1;

import java.util.Scanner;

public class TestMaze1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size,x,y;
        int diff=1;
        
        System.out.print("Masukkan Input ukuran: ");
        size=input.nextInt();
        
            for(x=1;x<=size;x++){
                for(y=1;y<=size;y++){
                    if (x%2==0){
                        if(y==1||y==size){System.out.print("@");}
                        else{System.out.print(" ");}
                        if(y==size)diff++;
                    }else{
                        if((diff%2==1&&y==2)||(diff%2==0&&y==size-1)){                        
                            System.out.print(" ");                                            
                        }
                        else{
                            System.out.print("@");
                        }
                    }                    
                }
                System.out.println("");
            }          
    }
}
