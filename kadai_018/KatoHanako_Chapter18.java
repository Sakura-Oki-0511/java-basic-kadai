package kadai_018;

//KatoHanako_Chapter18クラス
public class KatoHanako_Chapter18 extends Kato_Chapter18 {

//コンストラクタ
public KatoHanako_Chapter18(String familyName, String address) {
super(familyName, "花子", address);
}

//名をセットするメソッド
public void setGivenName() {
this.givenName = "花子";
}

//個別の紹介を出力するメソッド
@Override
public void eachIntroduce() {
System.out.println("趣味は読書です。");
}
}
