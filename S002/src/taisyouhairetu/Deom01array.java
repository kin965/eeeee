package taisyouhairetu;

/*
 題目
 要求定义一个数组 用来存储3个People对象
 
  
  
  
  数组有一个缺点，程序运行期间 长度不可以发生改变
  
  
 */
public class Deom01array {

	public static void main(String[] args) {
//首先创建一个长度为3的数组,里面用来存放people类型的对象
		People[] array = new People[3];
		People one = new People("laki", 18);
		People two = new People("tony", 28);
		People three = new People("wib", 20);
		
		//将one当中的地址值赋值到数组的0号元素位置
		array[0] = one;//地址值
		array[1] = two;//地址值
		array[2] = three;//地址值
		System.out.println(array[0]);
		
		System.out.println(array[1].getName());
		
		
	}

}
