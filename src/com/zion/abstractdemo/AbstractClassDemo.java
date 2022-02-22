package com.zion.abstractdemo;

public abstract class AbstractClassDemo {
    public abstract void fun();
    public void play(){
          System.out.println("playing");
    }
    public void code(){
          System.out.println("coding");
    }

}
class AbstractImpl extends AbstractClassDemo{

      @Override
      public void fun() {
            System.out.println("Having fun");
      }


}
class Test{
      public static void main(String[] args) {
            AbstractImpl anAbstract = new AbstractImpl();
            anAbstract.fun();
            anAbstract.code();
            anAbstract.play();
      }
}