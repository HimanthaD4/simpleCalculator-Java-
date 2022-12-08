import java.util.Scanner;

class mainP{

    
public static void main (String args[]){


Scanner sc = new Scanner(System.in);


System.out.print("enter number 01 :");
int n1 =  sc.nextInt();

System.out.print("enter number 02 :");
int n2 =  sc.nextInt();

calculation c1 = new calculation();


System.out.println("what do you want (add-press 1),(sub-press 2),(multiply-press 3),(dev-press 4)");
int calMethod = sc.nextInt();

if(calMethod == 1){
           c1.add(n1,n2); 
}


else if(calMethod == 2){
    c1.sub(n1,n2); 
}



else if(calMethod == 3){
          c1.multiply(n1,n2); 
}


else if(calMethod == 4){
           c1.dev(n1, n2); 
}




}
}




