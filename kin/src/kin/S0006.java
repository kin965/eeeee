package kin;

public class S0006 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      long kn =2888;
      if(kn>=500) {
    	  System.out.println(kn/500+"枚５００円");
      }
      kn=kn%500;
      if(kn>=100) {
    	System.out.println(kn/100+"枚１００円");
    	}
      kn=kn%100;
      if(kn>=50) {
    	  System.out.println(kn/50+"枚50円");
      }
      kn=kn%50;
      if(kn>=1) {
    	  System.out.println(kn/1+"枚1円");
      }
	}

}
