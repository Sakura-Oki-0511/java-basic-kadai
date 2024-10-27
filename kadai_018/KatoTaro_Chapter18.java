package kadai_018;

//KatoTaro_Chapter18クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	//コンストラクタ
	public KatoTaro_Chapter18(String familyName, String address) {
		super(familyName, "太郎", address);
	}

	//名をセットするメソッド
	public void setGivenName() {
		this.givenName = "太郎";
	}

	//個別の紹介を出力するメソッド
	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です。");
	}
}