import java.lang.*;
class slip_9
{
public static void main(String args[])
{
int i,j,k=1;
for(i=1;i<=4;i++)
{
for(j=i;j<=i;j++)
{
if(k%2==1)
{
System.out.print(1+" ");
}
else{
System.out.print(0+" ");
}
k++;
}
System.out.println();
}
}
}