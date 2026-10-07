# agent-sandbox

local-claude-app（[akagiryohei/MyClaudeProject](https://github.com/akagiryohei/MyClaudeProject)）のエージェントを試すための**練習用リポジトリ**。
エージェントが失敗しても困らないよう、本物のプロジェクトとは切り離している。壊れたらリポジトリごと作り直してよい。

## 構成
- Java 21 / Gradle（wrapper 同梱） / JUnit 5
- `src/main/java/sandbox/` … `Calculator`（四則演算）、`TextUtils`（文字列ユーティリティ）、`TodoList`（メモリ上の ToDo）
- `src/test/java/sandbox/` … 各クラスのテスト

## テスト
```bash
./gradlew test
```

## 運用
- エージェントへの依頼は Issue で行う（概要・やること・完了条件を書く）
- エージェントは `agent/<task-id>-<説明>` ブランチで作業し、Draft PR を作る。main への直接 push は禁止（ブランチ保護）
