# MaterialDesign
android5.0MD设计实践

 
补充内容 
toolbar 
 
android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
app:popupTheme="@style/ThemeOverlay.AppCompat.Light"

actionbar.setDisplayHomeAsUpEnabled(true)
actionbar.setHomeAsIndicator(R.drawable.ic_xxx)

case android.R.id.home:


menu
<item 
id
icon
title
app:showAsAction="always|ifRoom|never"


NavigationView:
navigation.setCheckedIitem(R.id.xxxx);

CardView extends FrameLayout--------------------------------support.v7.widget.CardView

app:cardCornerRadius="xdp"
app:elevation="xdp"




 








Question:
1:DrawerLayout中的两个布局，第二个一定要是NavigationView吗？不是，自己动手试一试

2：
 

 
说几个 比较有用的开源项目包


1：compile 'de.hdodenhof:cricleimageview:2.1.0'    https://github.com/hdodenhof/CricleImageView
2:compile 'com.github.bumptech.glide:glide:3.7.0'     https://github.com/bumptech/glide

Glide.width(Context).load(Url).into(imageView)

 

