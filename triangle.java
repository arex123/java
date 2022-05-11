import java.util.*;

class triangle{

public static void main(String[] args){

Scanner scn = new Scanner(System.in);
System.out.println("enter size of traingle");
int n = scn.nextInt();

int space = n-1;
int star = 1;

for(int i=0;i<n;i++){

//number of space
for(int col=0;col<=space;col++){
System.out.print(" ");

}

//number of stars

for(int col=0;col<star;col++){
System.out.print("* ");

}

star++;
space--;
System.out.println();
}


}
}

/*
     *
   *  * 
*  *  *

*/











