package kadai_018;

//親クラス Kato_Chapter18
public abstract class Kato_Chapter18 {
	
	//フィールド
	public String familyName; // 姓
	public String givenName; // 名
	public String address; // 住所

	//コンストラクタ
	public Kato_Chapter18(String familyName, String givenName, String address) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.address = address;
	}

	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("私の名前は " + familyName + " " + givenName + " です。");
		System.out.println("住所は " + address + " です。");
	}

	//個別の紹介を出力するための抽象メソッド
	public abstract void eachIntroduce();

	//紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
