# Crosspromote
Cross promote your android apps by using this library. We use it in most of our applications to cross promote our other android apps. 

**Preview:**
![](1.png =400px) ![](2.png =400px)

### Requirements:

To  use this library you need a list of app from a JSON web service. The schema should be as follows:

[Api Endpoint](https://crosspromote.firebaseio.com/recipe.json)

~~~js
[{
    "description": "Collection of Best Pakistani Recipes in Urdu.",
    "downloadUrl": "https://play.google.com/store/apps/details?id=com.kookydroidapps.pakistanifoodrecipes.urdu",
    "iconUrl": "https://goodfood.recipes/public/app/pakistaniUrduAppLogo.png",
    "isFree": true,
    "name": "Pakistani Recipes in Urdu",
    "order": 0,
    "visibile": true
}, {
    "description": "Collection of Best Pakistani Recipes in English.",
    "downloadUrl": "https://play.google.com/store/apps/details?id=com.kookydroidapps.pakistanifoodrecipes.english",
    "iconUrl": "https://goodfood.recipes/public/app/pakistaniEnglishAppLogo.png",
    "isFree": true,
    "name": "Pakistani Recipes in English",
    "order": 1,
    "visibile": true
}]
~~~

### Usage:

1. Add the `crosspromote` library dependency:

   ```
   implementation 'com.github.kookydroid-apps:crosspromote:${latest_version}'
   ```

   *Latest version from the release tab.*

2. Add the `crosspromote` Activity in the `AndroidManifest.xml` file.

   ```xml
   <activity android:name="com.kookydroidapps.crosspromote.CrossPromote"></activity>
   ```

3. Start this intent from anywhere inside your Android application, passing the endpoint of your webservice for JSON apps list:

   ```java
   Intent intent = new Intent(MainActivity.this, CrossPromote.class);
   intent.putExtra("url", "https://crosspromote.firebaseio.com/recipe.json");
   startActivity(intent);
   ```

   ##### That's it!

### Contributors:

* [Arshad Mehmood](<https://arshadmehmood.com/> ) - Maintainer & creator

If you want to contribute, please open a issue and/or create a Pull Request. 

### Used by:

If you want your app listed here, drop me a message on [Twitter](<https://twitter.com/arshad115> ).

Icon                                                                                                         | App link
-------------------------------------------------------------------------------------------------------------|-----------
<img src="https://lh3.googleusercontent.com/HoXI1vDFDQ4UI7yI0ycPnRy7LlM4-FC06uRwiXh2Uenls5n751G5_5jzxyVhMnovRzI=w48-rw" /> | [Pakistani Recipes in Urdu اردو][PakistaniRecipes]


[PakistaniRecipes]:      https://play.google.com/store/apps/details?id=com.kookydroidapps.pakistanifoodrecipes.urdu
