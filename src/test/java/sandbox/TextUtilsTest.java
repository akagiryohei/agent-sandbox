package sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TextUtilsTest {

  @Test
  void reverse() {
    assertEquals("cba", TextUtils.reverse("abc"));
    assertNull(TextUtils.reverse(null));
  }

  @Test
  void isPalindrome() {
    assertTrue(TextUtils.isPalindrome("level"));
    assertFalse(TextUtils.isPalindrome("java"));
    assertFalse(TextUtils.isPalindrome(null));
  }

  @Test
  void countWords() {
    assertEquals(3, TextUtils.countWords("  the quick  fox "));
    assertEquals(0, TextUtils.countWords("   "));
    assertEquals(0, TextUtils.countWords(null));
  }
}
