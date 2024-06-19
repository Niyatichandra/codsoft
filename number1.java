import java.util.Scanner;
public class number1 {
    public static void main(String[] args) {

    }
}
public static void game(){
    int d=1+(int)(100*Math.random());
    int s=0;
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=3;i++)
    {
    System.out.println("enter a number");
    int n=sc.nextInt();
    if(d==n) {
        System.out.println("correct guess");
        s++;
        break;
    }
    else {
        if (n > (d + 10))
            System.out.println("number iis very large");
        else if (n < (d - 10))
            System.out.println("number is very small");
        else if ((d - 10) < n)
            System.out.println("number is close and smaller");
        else if((d + 10) > n)
        System.out.println("number is close and large");
    }



    }
    System.out.println("chance over the number was "+d);
    if(s==0)
        System.out.println("score is 0");
    else
        System.out.println("score ="+ s*2);

        }

public void main() {
    Scanner sc=new Scanner(System.in);

game();
for(int j=0;j<5;j++) {
    System.out.println("enter 1 to play again else enter 2 to exit");
    int q = sc.nextInt();
    if (q == 1)
        game();
    else if(q==2)
        break;
}

}