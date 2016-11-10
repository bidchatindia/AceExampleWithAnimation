# cordova-plugin-crop

> Add any gradle dependency to the main project


## Install

```
$ cordova plugin add --save https://github.com/rahul-bidchat/Bidchat-plugin-gradle.git
```


## Usage
 To use this plugin once you have added the plugin make sure that you change the build-extras.gradle. You can include any libraries as you would do in native android gradle file.
 Next time when we build the project, the build-extras.gradle and projects build.gradle will be merged. Now we have a single file with all dependecies merged

### Example 

```gradle
repositories {
    jcenter()
}

dependencies {
    compile 'com.plattysoft.leonids:LeonidsLib:1.3.2'
    compile 'com.nineoldandroids:library:2.4.0'
    compile 'com.daimajia.easing:library:1.0.1@aar'
    compile 'com.daimajia.androidanimations:library:1.1.3@aar'
}
```

## License

MIT © [Bidchat](https://github.com/bidchatindia)
