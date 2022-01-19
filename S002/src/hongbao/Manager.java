package hongbao;

import java.util.ArrayList;

//群主的类 
public class Manager extends User {

	public Manager() {
		
	}

	public Manager(String name, int money) {
		super(name, money);
	}

	public ArrayList<Integer> send(int totalMoney, int count) {
		// 首先需要一个集合 来存储若干个红包的金额
		ArrayList<Integer> redList = new ArrayList<>();

		// 首先看一下群主自己有多少钱
		int leftMoney = super.getMoney();// 群主当前的余额
		if (totalMoney > leftMoney) {
			System.out.println("残高足りない");
			return redList;// 返回空集合
		}
        //扣钱，其实结束重新设置余额
		super.setMoney(leftMoney - totalMoney );
		
		//发红包需要平均拆分 拆成count份
		int avg =totalMoney/count;
		int mod =totalMoney%count;//余数 也就是甩下的零头
		//剩下的零头放在最后一个红包里
		//下面把红包一个一个放到集合当中
		for(int i =0;i<count-1;i++) {
			redList.add(avg);
			}
		//最后一个红包
		int last = avg+mod;
		redList.add(last);
		
		return redList;
	}
}
