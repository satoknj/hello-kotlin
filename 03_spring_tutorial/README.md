# spring with Kotlin
[this tutorial](https://spring.io/guides/tutorials/spring-boot-kotlin/)

## create project
1. make this project dir
2. import demo files to Intellij

or from command line. e.g. blog project
```bash
mkdir blog && cd blog
curl https://start.spring.io/starter.zip \
    -d language=kotlin \
    -d style=web,mustache,jpa,h2,devtools \ 
    -d packageName=com.example.blog \
    -d name=Blog \
    -o blog.zip
```

## run application
access to http://localhost:8080 after run `gradle bootRun`

## repository
* interfaceに決まった命名規則でメソッドを定義すると、自動で実装してくれる
    * https://docs.spring.io/spring-data/jpa/docs/1.6.0.RELEASE/reference/html/jpa.repositories.html

## docker-compose
IntellijのDockerプラグインを入れてみたが、あまりCLIオプションを指定できない？

結局このコマンドで起動
```bash
docker-compose \
    -f docker/dev/docker-compose.yml \
    -p spring-tut-dev \
    --project-directory docker/dev \
    up -d
```

上記で作ったコンテナを再開する場合、`up -d`の部分を`start`にする

## db
h2以外は自分で作る必要あり  
```sql
mysql -p
create database sampleDB
```