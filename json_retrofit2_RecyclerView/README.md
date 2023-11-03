# 우선작업
1. build.gradle 수정
Retrofit, Picasso, Gson의 의존성 추가
```
dependencies {
    //의존성 추가
    implementation("com.squareup.picasso:picasso:2.5.2")
    implementation("com.squareup.retrofit2:retrofit:2.3.0")
    implementation("com.squareup.retrofit2:converter-gson:2.3.0")
    implementation("com.jakewharton.picasso:picasso2-okhttp3-downloader:1.1.0")
```

2. AndroidManifest.xml 수정
Manifest에서 Internet 허용
```
<uses-permission android:name="android.permission.INTERNET"/>
```
![mm](https://github.com/rosa2070/MinorAndroid/assets/46918839/2ac5342a-133b-4def-8ab8-2e0834ecf1ea)

3. 패키지명 변경도 잊지말기!


# 시연영상
[Screen_recording_20231103_110355.webm](https://github.com/rosa2070/MinorAndroid/assets/46918839/2cb21889-e7f0-4dc8-bf18-2923e110ff84)


# 참고한 블로그
https://velog.io/@appletorch/Retrofit%EC%9C%BC%EB%A1%9C-%ED%86%B5%EC%8B%A0%ED%95%B4%EB%B3%B4%EA%B8%B0


