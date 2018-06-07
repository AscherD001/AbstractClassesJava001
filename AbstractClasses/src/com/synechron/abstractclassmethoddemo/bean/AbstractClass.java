package com.synechron.abstractclassmethoddemo.bean;

abstract class AbstractClass
{
    AbstractClass()
    {
        //First Constructor
    }
 
    AbstractClass(int i)
    {
        //Second Constructor
    }
 
    abstract void abstractMethodOne();  //Abstract Method
}
abstract class AbstractClass1 extends AbstractClass
{
   abstract void abstractMethodTwo();
}
class ConcreetClass extends AbstractClass1
{
    void abstractMethodOne() {
        // Do Nothing
    }
    void abstractMethodTwo(){
        // Do Nothing
    }
}
