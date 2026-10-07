package sandbox;

import java.util.ArrayList;
import java.util.List;

/** メモリ上で動く簡単な ToDo リスト。 */
public class TodoList {

  /** ToDo 1件。 */
  public record Todo(int id, String title, boolean done) {}

  private final List<Todo> todos = new ArrayList<>();
  private int nextId = 1;

  /**
   * ToDo を追加して、振られた ID を返す。
   *
   * @throws IllegalArgumentException title が null または空白だけのとき
   */
  public int add(String title) {
    if (title == null || title.isBlank()) {
      throw new IllegalArgumentException("タイトルは必須です");
    }
    int id = nextId++;
    todos.add(new Todo(id, title.trim(), false));
    return id;
  }

  /**
   * 指定した ID の ToDo を完了にする。
   *
   * @throws IllegalArgumentException 存在しない ID のとき
   */
  public void complete(int id) {
    for (int i = 0; i < todos.size(); i++) {
      Todo t = todos.get(i);
      if (t.id() == id) {
        todos.set(i, new Todo(t.id(), t.title(), true));
        return;
      }
    }
    throw new IllegalArgumentException("ID " + id + " の ToDo はありません");
  }

  /** 未完了の ToDo を追加した順に返す。 */
  public List<Todo> listOpen() {
    return todos.stream().filter(t -> !t.done()).toList();
  }

  /** 全件数。 */
  public int size() {
    return todos.size();
  }
}
