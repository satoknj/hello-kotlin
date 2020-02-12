# hello Kotlin with Intellij IDEA
use Intellij

## tasks
1. create Gradle Project
2. unit test with Intellij and terminal
3. How do I use snippet?
4. How do I use template?

### setup kotlin and gradle to be compatible with Intellij
solve problem that gradle test task failed with terminal

```bash
brew uninstall --force gradle
brew uninstall kotlin

curl -s "https://get.sdkman.io" | bash
source ~/.zshrc

sdk install gradle 6.1.1
sdk install kotlin 1.3.61
```

### ktlint-gradle
チェック実行は `gradle ktlintCheck`

Intellij の設定は`gradle ktlintApplyToIde`。これで「.idea/codeStyle」配下が書き換わる？

#### なんかIntellijでエラー
* `Could not create task ':ktlintMainSourceSetCheck''`
* `File must end with a newline`のエラーがIntellij上では出ない

### EditorConfig
https://editorconfig.org/

.editorconfigファイルを配置したディレクトリで個別にCodingStyleを指定できる仕組み

らしいのだがどうもあまりうまくできない

### 結局
lintに関することはIssueにあげておく

## code snippets
It's called as "Live Template" in Intellij IDEA.

The custom Live Template file is in `~/Library/Preferences/IdeaIC2019.3/templates`

## File templates
* os user level 
    * file is in `~/Library/Preferences/IdeaIC2019.3/fileTemplates`
* Project Level
    * file is in `$ProjectRoot/.idea/fileTemplates`
    
 code template is for Intellij. if developer wants new snippets, use "Live Templates"
