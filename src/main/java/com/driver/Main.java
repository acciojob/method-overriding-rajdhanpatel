package com.driver;

public class Main {
    public static void main(String args[]) {
        A a = new A();
        System.out.println(a.meth());
        B b = new B();
        System.out.println(b.meth());

  }
  public static class A{
      public String meth(){
//          System.out.println("parent classs");
          return "Invoking method from class A";
      }
  }
  public static class B extends A{

        public String meth(){

            return "Method is overridden in Extendend class B";
        }
    }
}
