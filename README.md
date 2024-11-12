# customSeekBarAndroid
Custom seek bar/ progress bar with customizable multiple color on background.

<div align="center">
	
[![](https://jitpack.io/v/SultanAyubi360/SeekbarLibrary.svg)](https://jitpack.io/#SultanAyubi360/SeekbarLibrary)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)  ![Kotlin](https://img.shields.io/badge/Kotlin-100%25-brightgreen)

</div>

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
---

### Step 5
How to use and pass values in CustomSeekBarView.
  
* For showing multiple progess bars.
```kotlin
customSeekBar.configureSegments(
            isMultipleCheck = true, // Set whether multiple segments should be checked
            segmentCheckValue = 10, // Set the segment check value
            totalEmployee = 100,    // Set the total number of employees
            presentEmployee = 50,   // Set the number of present employees
            absentEmployee = 20,    // Set the number of absent employees
            leaveEmployee = 15,     // Set the number of employees on leave
            lateEmployee = 15      // Set the number of late arrivals
        )

```

* For showing single progess bar.
```kotlin
customSeekBar.configureSegments(
                isMultipleCheck = false, // Set whether multiple segments should be checked
                segmentCheckValue = 1, // Set the segment check value
                totalEmployee = 50,    // Set the total number of employees
                presentEmployee = 50,   // Set the number of present employees
                absentEmployee = 0,    // Set the number of absent employees
                leaveEmployee = 0,     // Set the number of employees on leave
                lateEmployee = 0      // Set the number of late arrivals
            )

isMultipleCheck  means just show single progress and make other values 0 to not show.If any progress have zero value it will not show progress bar.
```
---

## ✨ Screenshots

<kbd>
  <img src="https://i.ibb.co/s51m1nV/screenshot1.png" width=30% height=30%/>
  <img src="https://i.ibb.co/mFvQv4T/screenshot3.png" width=30% height=30%/>
  <img src="https://i.ibb.co/gT8BVyq/screenshot4.png" width=30% height=30%/>

  <img src="https://i.ibb.co/Y7XvTWQ/screenshot5.png" width=30% height=30%/>
  <img src="https://i.ibb.co/ZfspXPh/screenshot2.png" width=30% height=30%/>
  
</kbd>


## OverView:
* **isMultipleCheck**: This is use for whether to show multiple progress bar just do true otherwise for single false.
* **segmentCheckValue**: If progress has value less then given segment it not show the value on progress so it not cut off.
* **presentEmployee**: show present employees using green color.
* **absentEmployee**: show absent employees using red color.
* **leaveEmployee**: show leave employees using sky bue color.
* **lateEmployee**: show late employees using yellow color.
  

## Find this library useful? :heart:

However, if you get some profit from this or just want to encourage me to continue creating stuff, there are few ways you can do it. :coffee: :hamburger: :fries: :apple:

Support it by joining stargazers to this. ⭐

Also, [follow me on GitHub](https://github.com/SultanAyubi360) for my next creations! 🤩
