import java.util.Scanner;
public class result {
    public static void main(String[] args) {

    }
}
public static void grade(double m,double s,double ss,double e,double h,double t,double p)
{
    char grade;
     if(p>90)
          grade='A';
     else if(p<=90&&p>80)
         grade='B';
     else if(p<=80&&p>70)
         grade='C';
     else
         grade='D';
     System.out.println("MATHS="+m);
    System.out.println("SCIENCE="+s);
    System.out.println("S.ST="+ss);
    System.out.println("ENGLISH="+e);
    System.out.println("HINDI="+h);
    System.out.println("TOTAL="+t);
    System.out.println("PERCENTAGE="+p);
    System.out.println("GRADE="+grade);
}

public void main() {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter marks out of 100");
    double m=sc.nextInt();
    double s=sc.nextInt();
    double ss=sc.nextInt();
    double e=sc.nextInt();
    double h=sc.nextInt();
    double t=m+s+ss+e+h;
    double p=t/5;
    grade(m,s,ss,e,h,t,p);
}