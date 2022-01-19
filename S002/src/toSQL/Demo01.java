package toSQL;

public class Demo01 {

	public static void main(String[] args) {
     String q = "1234";
     q +="567";
     q +="890";
     
     String edit = "SELECT name FROM product WHERE name=";
     edit +="'"+"editname.getName()"+"'";
     System.out.println(edit);
	}

}
