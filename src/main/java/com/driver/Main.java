package com.driver;

public class Main {
  public static void main(String args[]){
        B b = new B();
        String s = b.meth();
        System.out.println(s);
  }
  public static class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }
  public static class B extends A{
      B(){
          super();
      }
        public String meth(){

            return "Method is overridden in Extendend class B";
        }
  }
}