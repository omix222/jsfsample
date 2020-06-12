# JSFのサンプルプロジェクト　

## How to build and deploy

- ``mvn package``でwar作成
- 出来たwarをサーバのautodeployフォルダにコピー
```bash
  cp target/jsfsample.war /opt/glassfish5/glassfish/domains/domain1/autodeploy
```

## アクセスURL(ローカル)
- jsf.sample.ServletSample
  - http://localhost:8080/jsfsample

- JSF sample
  - http://localhost:8080/jsfsample/faces/index.xhtml