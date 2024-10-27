package kadai_026;

import java.util.HashMap;
import java.util.Map;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        // ①ジャンケンのインスタンスを作成する
        Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
        
        // ②自分のジャンケンの手を入力する
        String myChoice = jyanken.getMyChoice();
        
        // ③対戦相手のジャンケンの手が乱数で選ばれる
        String opponentChoice = jyanken.getRandom();
        
        // じゃんけんの手の辞書（HashMap）を作成
        Map<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
        
        // ④ジャンケンの結果を出力する
        jyanken.playGame(handMap);
    }
}