package keisyou;
/*
 在父子类继承关系中 创建子类对象 访问成员方法的规则
 创建的对象是谁 就优先用谁 如果没有 就想上找
 注意事项 
 无论是成员方法还是成员变量 如果没有都是向上找 绝不会向下找子类 

 方法的  重写 （override）
 概念  在继承关系当中 方法的名称一样 参数列表也一样,
 
 重写 override 方法的名称一样 参数列表也一样。(覆盖 覆写)
 重载  overload  方法的名称一样 参数列表不一样 ( )
 
 方法覆盖重写特点 ，创建的是子类对象则优先用子类方法。
 */
public class Demo03Extends {

	public static void main(String[] args) {
     Fu03 fu = new Fu03();
     Zi03 zi = new Zi03();
     
     zi.methodFu();
     zi.methodZi();
	//创建的是new了子类对象 所以优先用子类方法
	 zi.method();
	 
	}

}
