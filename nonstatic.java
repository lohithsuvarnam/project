class A
{
  static float a=1.6f;
  static int b=20;
  String c="lohi";
  boolean d=true;
  public static void main(String[] args)
  {
    System.out.println(a);
    System.out.println(b);
    A obj=new A();
    System.out.println(obj.c);
    System.out.println(obj.d);
  }
}