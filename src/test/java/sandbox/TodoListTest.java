package sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TodoListTest {

  @Test
  void addAssignsSequentialIds() {
    TodoList list = new TodoList();
    assertEquals(1, list.add("買い物"));
    assertEquals(2, list.add("掃除"));
    assertEquals(2, list.size());
  }

  @Test
  void addRejectsBlankTitle() {
    TodoList list = new TodoList();
    assertThrows(IllegalArgumentException.class, () -> list.add("  "));
  }

  @Test
  void completeRemovesFromOpenList() {
    TodoList list = new TodoList();
    int first = list.add("買い物");
    list.add("掃除");
    list.complete(first);
    assertEquals(1, list.listOpen().size());
    assertEquals("掃除", list.listOpen().get(0).title());
  }
}
