# hello Kotlin with Intellij IDEA
use Intellij

## tasks
1. create Gradle Project
2. with Intellij and terminal
    1. succeed test with Intellij but failed with terminal
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