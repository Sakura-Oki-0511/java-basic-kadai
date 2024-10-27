package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    // 自分のじゃんけんの手を保持するフィールド
    private String myChoice;
    // 対戦相手のじゃんけんの手を保持するフィールド
    private String opponentChoice;
    // 選択肢を表す配列（r: グー, s: チョキ, p: パー）
    private static final String[] choices = {"r", "s", "p"};
    // じゃんけんの手を日本語で表示するためのマップ
    private static final Map<String, String> choiceMap = new HashMap<>();

    // 静的ブロックでchoiceMapに値をセット
    static {
        choiceMap.put("r", "グー");
        choiceMap.put("s", "チョキ");
        choiceMap.put("p", "パー");
    }

    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        	// メッセージを変更
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            myChoice = scanner.nextLine();
            if (choiceMap.containsKey(myChoice)) {
                return myChoice;
            } else {
                System.out.println("エラー: 正しいじゃんけんの手を入力してください。");
            }
        }
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶメソッド
    public String getRandom() {
        Random random = new Random();
        // 0から2の間の整数を生成し、choices配列のインデックスとして使用
        int index = (int) Math.floor(random.nextInt(3));
        opponentChoice = choices[index];
        return opponentChoice;
    }

    // じゃんけんの勝敗を判定し、結果を出力するメソッド
    public void playGame(Map<String, String> handMap) {
        // 自分と対戦相手の手を出力
        System.out.println("自分の手: " + handMap.get(myChoice));
        System.out.println("対戦相手の手: " + handMap.get(opponentChoice));

        // じゃんけんの結果を判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです。");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです。");
        } else {
            System.out.println("自分の負けです。");
        }
    }
}