package arraylist;
import java.util.ArrayList;
import java.util.Random;
public class Deom06ArrayListRandom {
/*
  题目 
   生成六个 1至33之间的随机整数，添加到集合，并遍历集合
 
   思路 
   1需要存储六个数字，创建一个集合<Integer>
   2产生随机数需要用到random
   3循环六次，来产生六个随机数字
   4循环内调用 r.nextInt()方法 确定范围 参数是0—33 加1
   5把数字添加到集合中 ，add
   6遍历集合 for ，size， get
 
 
 
 
 
 */
	public static void main(String[] args) {
   ArrayList<Integer> list= new ArrayList<>();
   Random r = new Random(); 
   
   for(int i=0;i<6;i++) {
	  int num= r.nextInt(33)+1;
	  list.add(num);
   }
   
   for(int i =0;i<list.size();i++) {
	   System.out.println(list.get(i));
   }
   
   
   
	}

}
