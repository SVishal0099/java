class overload
{
     void area(float x)
     {
             System.out.println("the area of the square is  "+Math.pow(x ,2)+" sq units");
     }
     void area(float x, float y)
     {
            System.out.println("the area of rectangle is "+x*y+" sq units");
      }
      void area(double x)
      {
             double z = 3.14 * x * x;
              System.out.println("the area of the circle is "+z+" sq units");
       }
}
class overload
{
       public static void main(String args[])
           {
               overload ob = new overload();
               ob.area(5);
               ob.area(11,12);
               ob.area(2,5);
           }
}