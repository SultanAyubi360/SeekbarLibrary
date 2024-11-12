# customSeekBarAndroid
Custom seek bar/ progress bar with customizable multiple color on background.

[![](https://jitpack.io/v/SultanAyubi360/SeekbarLibrary.svg)](https://jitpack.io/#SultanAyubi360/SeekbarLibrary)

## Usage

**For a working implementation of this project see the `app/` folder.**

### Step 1

Add this in your root build.gradle at the end of repositories
```
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
     
}
```
---
### Step 2

Include the library as a local library project or add the dependency in your build.gradle.

# For groovy DSL

```
dependencies {
    implementation 'com.github.SultanAyubi360:SeekbarLibrary:1.2'
}
```

# For Kotlin DSL


```
dependencies {
    implementation ("com.github.SultanAyubi360:SeekbarLibrary:1.2")
}
```

---
### Step 3

Add the following xml to your layout file.You can use the custom view in following manner:

#### In XML:

```
  <androidx.cardview.widget.CardView
        android:id="@+id/seekCard"
        android:layout_width="match_parent"
        android:layout_height="14dp"
        android:layout_marginStart="@dimen/_2sdp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="@dimen/_2sdp"
        app:cardBackgroundColor="@android:color/transparent"
        app:cardCornerRadius="4dp"
        app:cardElevation="0dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <com.sultanayubi.seekbarlibrary.CustomSeekBarView
            android:id="@+id/seekBar"
            style="?android:attr/progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:paddingStart="0dp"
            android:paddingEnd="0dp"
            android:thumb="@null"/>
    </androidx.cardview.widget.CardView>


Carview use to make seekbar/progress bar corner round by giving radius. 
```
---
### Step 4

Reference the View in Kotlin code.

  ## CustomSeekBarView
* Kotlin
```kotlin
val customSeekBar = findViewById<CustomSeekBarView>(R.id.seekBar) //Find View By Id
val customSeekBar = binding.seekBar // using binding
```
* Java
```Java
CustomSeekBarView customSeekBar = findViewById(R.id.seekBar);
CustomSeekBarView customSeekBar = binding.seekBar;

```
---

## :heart: Support My Projects
However, if you get some profit from this or just want to encourage me to continue creating stuff, there are few ways you can do it. :coffee: :hamburger: :fries: :apple:

* Starring: You may give a star or share the projects you like.

Support it by joining stargazers to this. ⭐

Also, [follow me on GitHub](https://github.com/SultanAyubi360) for my next creations! 🤩
