# ShadowImageView
## Abstract
    More exquisite shadow effect, used in some special scene to enhance the user experience.

## Chinese Documents
[查看中文文档](https://github.com/yingLanNull/ShadowImageView/blob/master/READEME_CN.md)

## Picture
![1](https://github.com/yingLanNull/ShadowImageView/blob/master/show/shadow1.png)
![2](https://github.com/yingLanNull/ShadowImageView/blob/master/show/shadow2.png)

## GIF
![1](https://github.com/yingLanNull/ShadowImageView/blob/master/show/shadow.gif)

## Demo
[Download App](https://github.com/yingLanNull/ShadowImageView/blob/master/show/app-debug.apk)

## Usage

### In layout

```
	    <com.yinglan.shadowimageview.ShadowImageView
	            android:id="@+id/shadow"
                android:layout_width="300dp"
                android:layout_height="300dp"
                app:shadowRound="20dp"
                app:shadowSrc="@mipmap/lotus" />

```

### Set Picture
```
    shadow.setImageResource(resID); 
    shadow.setImageDrawable(drawable); 
```

## FAQ

See [PPMusicImageShadow](https://github.com/PierrePerrin/PPMusicImageShadow), the effect of time has made the simple implementation no upload Jcenter library, there may be a potential problem for study and communication, looking forward to you have a better way of implementation.


## License
The work done has been licensed under Apache License 2.0. The license file can be found
[here](LICENSE). You can find out more about the license at:

http://www.apache.org/licenses/LICENSE-2.0