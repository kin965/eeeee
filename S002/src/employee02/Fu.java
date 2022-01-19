package employee02;
/*
 一个抽象类不一定含有抽象方法
 只要保证抽象方法所在的类是抽象类即可
 
 没有抽象方法的抽象类 也不能直接创建对象 在一些特殊场景下有用途
 
 
  */
public abstract  class Fu {

public Fu() {
	System.out.println("抽象父类的构造方法执行");
}	
	
public abstract void eat() ;
}

