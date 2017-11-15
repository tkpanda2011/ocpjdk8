package lambda.built.in.functional.interfaces;

import java.util.function.Function;

//What changes, when applied independent of each other, will enable the following code to compile?

//assume appropriate import statements
class TestClass{
   public double process(double payment, int rate)
   {
       double defaultrate = 0.10;        //1
   //   if(rate>10) defaultrate = rate;  //2
      class Implement{
         public int apply(double data){
             Function<Integer, Integer> f = x->x+(int)(x*rate);  //3
             return f.apply((int)data); //4
         }
      }
      Implement i = new Implement();
      return i.apply(payment);
   }
}
