class Main
     {
         void m1()
         {
             System.out.println("m1 method");
         }
         Main()
         {
             System.out.println("constructer");
         }
         public static void main(String[]args)
         {
             Main s1=new Main();
             Main s2=new Main();
             s1.m1();
         }
     }
         