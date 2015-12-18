# VideoSplash
I think splash screens are cool, no matter what anybody says. Spotify's and Uber's login pages left me feeling envious. I wanted cool login splash screens too. So I made one.

Basically, it is a TextureView with a Media player built-in. The code I based off of was [Dmytro Danylyk's Video Crop library](https://github.com/dmytrodanylyk/video-crop). I utilized his cropping code to get a "center-crop" style video, whilst making it full screen and looping right off the bat.

All you have to do is copy in this code to your project:

**In layout XML**

```
 <com.jasonjohn.videosplash.VideoSplashView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/videoSplashView"/>
```

**...and in your Splash Activity**
```
splashVideo = (VideoSplashView) findViewById(R.id.videoSplashView);
splashVideo.setDataSource(getApplicationContext(), 
    Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tunnel_splash_video));
splashVideo.play();
```

...and you're done!
