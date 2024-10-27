package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 myDictionary = new Dictionary_Chapter21();

        // 調べる単語を配列にセット
        String[] wordsToCheck = {"apple", "banana", "grape", "orange"};

        // 辞書を調べる
        for (String word : wordsToCheck) {
            String meaning = myDictionary.getMeaning(word);
            if (meaning != null) {
                System.out.println(word + " の意味は: " + meaning);
            } else {
                System.out.println(word + " は辞書に存在しません。");
            }
        }
    }
}