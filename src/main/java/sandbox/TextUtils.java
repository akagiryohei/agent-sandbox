package sandbox;

/** 文字列の小さなユーティリティ。 */
public final class TextUtils {

  private TextUtils() {}

  /** 文字列を逆順にする。null は null を返す。 */
  public static String reverse(String s) {
    if (s == null) {
      return null;
    }
    return new StringBuilder(s).reverse().toString();
  }

  /** 回文（前から読んでも後ろから読んでも同じ）かどうか。null は false。 */
  public static boolean isPalindrome(String s) {
    if (s == null) {
      return false;
    }
    return s.equals(reverse(s));
  }

  /** 空白区切りの単語数を数える。null や空白だけの文字列は 0。 */
  public static int countWords(String s) {
    if (s == null || s.isBlank()) {
      return 0;
    }
    return s.trim().split("\\s+").length;
  }
}
