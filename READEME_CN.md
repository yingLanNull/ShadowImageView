# ShadowImageView
## 摘要
    更加细腻的阴影效果，在一些提高用户体验的特殊场景使用

## 英文文档
[View English Documents](https://github.com/yingLanNull/ShadowImageView)

## 显示效果
![1](https://github.com/yingLanNull/ShadowImageView/blob/master/show/shadow1.png)
![2](https://github.com/yingLanNull/ShadowImageView/blob/master/show/shadow2.png)

## 动图
![1](https://github.com/yingLanNull/ShadowImageView/blob/master/show/shadow.gif)

## 下载APK体验
[点击下载](https://github.com/yingLanNull/ShadowImageView/blob/master/show/app-debug.apk)

## 使用方法

#### Gradle 配置
```
dependencies {
    compile 'com.yinglan.shadowimageview:shadowimageview:1.0.2'
}
```

### 布局

```
	    <com.yinglan.shadowimageview.ShadowImageView
	            android:id="@+id/shadow"
                android:layout_width="300dp"
                android:layout_height="300dp"
                app:shadowRound="20dp"
                app:shadowSrc="@mipmap/lotus" />

```

### 设置图片
```
    shadow.setImageResource(resID);
    shadow.setImageDrawable(drawable); 
```

### 设置图片半径
```
    shadow.setImageRadius(radius);
```

## 注意

看了[PPMusicImageShadow](https://github.com/PierrePerrin/PPMusicImageShadow)的效果，抽时间做了简单实现没有上传Jcenter库，可能会有潜在的问题做学习交流使用，期待大家有更好的实现方式。


## 开源协议
The work done has been licensed under Apache License 2.0. The license file can be found
[here](LICENSE). You can find out more about the license at:

http://www.apache.org/licenses/LICENSE-2.0