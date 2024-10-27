package kadai_018;

//KatoIchiro_Chapter18クラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	//コンストラクタ
	public KatoIchiro_Chapter18(String familyName, String address) {
		super(familyName, "一郎", address);
	}

	//名をセットするメソッド
	public void setGivenName() {
		this.givenName = "一郎";
	}

	//個別の紹介を出力するメソッド
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです。");
	}
}
