class A
{
  int a=10;
  int b=41;
  void add()
{
  System.out.println("Addition",a+b);
}
class B extends A
{
 
int passfail()
{
  if(Addition>=50)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
}
}
class C extends B
{
System.out.println("welcome to inheritance");
}
public static void main(String ar[])
{
 C obj=new C();
 obj.add();
 obj.passfail();
 obj.print();
 }
}
