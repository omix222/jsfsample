# JSFのサンプルプロジェクト　

## How to build and deploy

- ``mvn package``でwar作成
- GlassFishを起動し、出来たwarをサーバのautodeployフォルダにコピー
```bash
  /opt/glassfish5/glassfish/bin/asadmin start-domain
  cp target/jsfsample.war /opt/glassfish5/glassfish/domains/domain1/autodeploy
```
- ``sh buildAndRun.sh`` でGlassfishのDockerイメージでRunまで出来るが、JSFが動かないのでNG。。

## アクセスURL(ローカル)
- jsf.sample.ServletSample
  - http://localhost:8080/jsfsample

- JSF sample
  - http://localhost:8080/jsfsample/faces/index.xhtml