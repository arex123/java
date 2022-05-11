import java.util.Scanner;
class fibonacci{
public static void main(String[] args){
 Scanner scn = new Scanner(System.in);
System.out.println("length of the fibonacci: ");
int n = scn.nextInt();

int a = 0;
int b = 1;
int c;

System.out.println("your fibonacci series is ");
for(int i=0;i<n;i++){
c = a + b;
System.out.print(a+"  ");
a = b;
b = c;
}


}
}

/*

fibo series:

0 1 1 2 3 5 8 

*/