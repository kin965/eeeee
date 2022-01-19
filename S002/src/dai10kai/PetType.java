package dai10kai;

public enum PetType {
	Orange("Ehime"),
    Apple("Aomori"),
    Melon("Ibaraki");
	
	 // フィールドを定義
    private String name;
    
    // コンストラクタを定義
    private PetType(String name) {
        this.name = name;
    }
    
    // メソッド
    public String getValue() {
        return this.name;
    }
}
