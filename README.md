# **Android Toast Manager**


---
A lightweight Android library to show custom styled Toast messages with different types like Success, Error, Warning, and Info.
This library provides a modern rounded (pill-shaped) toast design with customizable colors.

---

## ✨ **Features**

- Rounded modern toast UI

- Multiple toast types

- Easy integration

- Lightweight library

- Toast Types Supported:
    - SUCCESS

    - ERROR

    - WARNING

    -  INFO



  ---

# **Preview**
---
<p align="center">
  <img src="https://github.com/S13reya/Android_ToastManager/blob/stages/app/src/main/assets/demovideo.gif" height="320"/>




</p>




## ⚡ **Installation**

**Step 1:** Add JitPack repository to your root build.gradle:

```gradle
maven { url = uri("https://jitpack.io") }
```

**Step 2:** Add the dependency in your app `build.gradle` (example if hosted on JitPack):  

```gradle
dependencies {
	        implementation 'com.github.Excelsior-Technologies-Community:Android_AppVersionChecker:1.0.1'

}
```







## ⚡ **MainActivity**
```
package com.ext.android_toastmanager


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ext.android_toast_manager.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toast Examples
        ToastManager.show(this, "Success Message", ToastType.SUCCESS)
        ToastManager.show(this, "Error Message", ToastType.ERROR)

        // Snackbar Example
        SnackbarManager.show(
            this,
            "This is Snackbar",
            ToastType.WARNING,
            "Retry"
        ) {
            ToastManager.show(this, "Retry Clicked", ToastType.INFO)
        }
    }
}
```


## **📄 License**

**MIT License**  
```
Copyright (c) 2025 Excelsior Technologies

Permission is hereby granted, free of charge, to any person obtaining a copy  
of this software and associated documentation files (the "Software"), to deal  
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
copies of the Software, and to permit persons to whom the Software is  
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all  
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED **"AS IS"**, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
```



  
