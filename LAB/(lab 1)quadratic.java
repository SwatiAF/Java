class quadratic {
public static void main(String args[]) {
int a=1, b=2, c=1;
double det = b*b -4*a*c;
double r1, r2;

if( det > 0)
{
  r1= (-b + Math.sqrt(det)) / (2*a);
  r2 = (-b - Math.sqrt(det)) / (2*a);
System.out.println("r1: " + r1 + "r2: " + r2);
}
else if(det==0)
{
  r1=r2= -b/(2*a);
  System.out.println("r1=r2= "+r1);
}
else
{
  double real= -b/(2*a);
  double img= Math.sqrt(-det)/(2*a);
System.out.println("r1= " + real - imgi);
System.out.println("r2= " + real + "+" imgi);
}
}
}

