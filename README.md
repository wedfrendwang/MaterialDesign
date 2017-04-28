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
  这里可以是任意一个布局内容，但是要保证在超出内容的时候，它是可以滑动的

  官方文档建议：使用Navigation，是因为如果使用统一定制，那么基本上市面上的所有的侧滑都可以保持一致
  当外表一致的时候，我们才会去发现内在
  但是，UI设计师可不是这样想的哦
  所以，定制自己的界面有时候还是有必要的，这个知道就好

2：关于android的主题，在相应的情况下，如果对于web前端了解的话，它其实跟css很类似，但是想要做一个通透的理解的话还是有些困难
    但是事件出真知，突然觉得，开发的程序猿完全可以找一设计师做男/女朋友了，还是由共通的地方

3：在使用DrawerLayout的时候麻烦多用点心，在使用界面布局的时候，使用可以滑动的控件对于你的软件健壮性来讲还是
    具有不可替代的方便性，也就是写基类的朋友很关键，好多的事情都需要想到，这样可以减少相应的工作

4：可折叠的控件CollapsingToolbarLayout控件，在平常的使用中，如果你想要达到一种效果，什么效果呢？

    1：折叠,去看看源码，你也会惊奇的发现，CollapsingToolbarLayout继承自FrameLayout
       但是也只有你将CollapsingToolbarLayout里面的布局设置Toolbar的时候，才会出现你想要的效果

       但是实际上，你所知道并不是你想要实现的功能，怎么办，继承重新实现，这就是java，
       但是我现在还是没有办法做到自如的实现：这个就是接下来的问题（等一下干一下）


    2：AppBarLayout:一个类似于线性布局，但是他本身有一个属性layout_scrollFlags可以作用于子控件中

    3：那么使用的时候该怎么搞？根据需求自己搞呗

    4：记住MD设计中有一个主要的控件就是CoordinatorLayout,它的特别之处在于behavior属性了。

    5：相应的之前有使用过的ScrollView跟换为NestedScrollView效果和性能会更好，原因是什么，我也不知道
       看看源码


       以上就是对android5.0版本之后设计页面新特性的一些整理了。也就这么多，至少目前就这样。


说几个 比较有用的开源项目包
1：compile 'de.hdodenhof:cricleimageview:2.1.0'    https://github.com/hdodenhof/CricleImageView
2:compile 'com.github.bumptech.glide:glide:3.7.0'     https://github.com/bumptech/glide

使用的方法,加載的是一張圖片
Glide.width(Context).load(Url).into(imageView)


那好，现在呢使用的东西我也差不多OK，但是有几个东西需要在今天一次性的将其搞定
不然好多的工作没法进行展开

1：ToolBar如何进行重写，不只是简单写布局，如果真的只是重写布局，那么真的是毫无意义?

        Toolbar extends ViewGroup

        我现在的目的是重写你








2：上下拉刷新
    新控件的使用，但是这个却只有下拉刷新，但是上拉加载却并不是很理想
    android.support.v4.widget.SwipeRefreshLayout

    所以这个东西需要好好使用一下

3：ScrollView的加载如何做？就是我想在ScrollView中也可以加载刷新数据，那么需要什么呢？

4：使用网络的框架，对于我而言我更加倾向于XUtils3.0

5: 目前这些问题只有一个个的去解决了。怎么办，看看还是挺多的问题。

6：今天还有一个问题，那就是怎么在web界面实现这个上下拉的问题，虽然后台的代码我可以写，但是相应技巧，
   框架，还是需要好好的整理一下。




7：如何写出一个让自己都感到骄傲的Web界面，以至于所有的功能都可以成形。

8：coordinatorLayout   appbarLayout    toolbar//在使用滑动隐藏的功能的时候，麻烦小心一些，对于theme的声明很重要