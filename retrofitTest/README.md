# 우선작업
1. build.gradle(module)에 다음 코드 추가
```
  buildFeatures {
    viewBinding = true
  }
```

2. 그래들에 레트로핏 추가
```
dependencies {
	//...
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

}
```

3. 매니페스트 권한 설정
```
<uses-permission android:name="android.permission.INTERNET" />
```

4. 매니페스트의 application 영역에 추가. 간단하게 진행하는 통신이라 http로 진행할 것인데 이를 허가해주는 설정
```
<application
        android:usesCleartextTraffic="true"
```
  
