# customSeekBarAndroid
Custom seek bar/ progress bar with customizable multiple color on background.

<div align="center">
	
[![](https://jitpack.io/v/SultanAyubi360/SeekbarLibrary.svg)](https://jitpack.io/#SultanAyubi360/SeekbarLibrary/1.2)
![Status](https://img.shields.io/badge/Status-Active-brightgreen) ![Kotlin](https://img.shields.io/badge/Kotlin-100%25-brightgreen)

</div>

## ✨ Live Demo

<kbd>

https://github.com/user-attachments/assets/bb3c671e-d6f9-44f9-a3e3-5eb387235e4a

</kbd>

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

Add the dependency in your build.gradle.

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
  <img src="https://i.ibb.co/26GmynP/screenshot1.jpg" width=30% height=30%/>
  <img src="https://i.ibb.co/6B32g9Z/screenshot2.jpg" width=30% height=30%/>
  <img src="https://i.ibb.co/s3sNJcP/screenshot3.jpg" width=30% height=30%/>
  <img src="https://i.ibb.co/pZ7ffmR/screenshot4.jpg" width=30% height=30%/>
  <img src="https://i.ibb.co/RDSMqw7/screenshot5.jpg" width=30% height=30%/>
</kbd>


## OverView:
* **isMultipleCheck**: This is use for whether to show multiple progress bar just do true otherwise for single false.
* **segmentCheckValue**: If progress has value less then given segment it not show the value on progress so it not cut off.
* **presentEmployee**: show present employees using green color.
* **absentEmployee**: show absent employees using red color.
* **leaveEmployee**: show leave employees using sky bue color.
* **lateEmployee**: show late employees using yellow color.


## Reporting an issue

If you are going to report an issue, I will greatly appreciate you including some code which I can run to see the issue. By doing so you maximize the chance that I will fix the problem. 
By the way, before reporting a problem, try replacing DiscreteScrollView with a RecyclerView. If the problem is still present, it's likely somewhere in your code.


## Find this library useful? :heart:

However, if you get some profit from this or just want to encourage me to continue creating stuff, there are few ways you can do it. :coffee: :hamburger: :fries: :apple:

Support it by joining stargazers to this. ⭐

Also, [follow me on GitHub](https://github.com/SultanAyubi360) for my next creations! 🤩
