package class14;

import java.util.Scanner;

public class Array2ndDay {
    public static void main(String[]args){
        Scanner user_input=new Scanner(System.in);
        
                   //-----------Task_1-----------
                   
       int [] Marks=new int[5];
        System.out.println("Enter 5 Numbers : ");
        for(int i=0;i<Marks.length;i++){
            Marks[i]=user_input.nextInt();
        }
        int min=Marks[0];
        for(int i=0;i<Marks.length;i++){
            if(min>Marks[i]){
                min=Marks[i];
            
        }

        }
        System.out.println("The minimun number is : "+min);  
        System.out.println(); 
        System.out.println("----------------Task 1 End--------------");
        System.out.println();
        
                  //------------TASK_2-------------
                  
     
        System.out.println("----------------Task 2 Begin---------------- ");
        System.out.println();
        
        String [] name=new String[5];
        System.out.println("Enter 5 Name ");
        for(String n:name){
            name [n]=user_input.nextLine();
        }
        
    }
    
}
