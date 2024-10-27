package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
    // HashMapの宣言
    private Map<String, String> dictionary;

    // コンストラクタ
    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        initializeDictionary();
    }

    // 辞書の初期化
    private void initializeDictionary() {
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 単語の意味を取得するメソッド
    public String getMeaning(String word) {
        return dictionary.get(word);
    }

    // 辞書の内容を表示するメソッド
    public void displayDictionary() {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
