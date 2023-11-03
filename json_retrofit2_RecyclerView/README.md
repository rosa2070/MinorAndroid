# 우선작업
1. build.gradle 수정
Retrofit, Picasso, Gson의 의존성 추가
```
dependencies{
    //의존성 추가
    implementation 'com.squareup.picasso:picasso:2.5.2'
    implementation 'com.squareup.retrofit2:retrofit:2.3.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.3.0'
    implementation 'com.jakewharton.picasso:picasso2-okhttp3-downloader:1.1.0'
}
```

2. AndroidManifest.xml 수정
Manifest에서 Internet 허용
![image](https://github.com/rosa2070/MinorAndroid/assets/46918839/eb715322-5c18-4028-8ae0-5dcebffc7ace)
