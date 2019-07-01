# About
This app is created for learning purpose of android activity lifecycle. It only shows login screen with simple hard-coded
login logic. After successfully logging in, a home screen will appear. Android activity has several callbacks which
is called as described below.

1. onCreate is called when the context of the activity doesn't exist in memory. It happens when the activity is
created in the first time. Initial setup of the activity can be put in here such as: inserting layout XML,
inserting data to the view, etc.
2. onStart is called when the context of the activity exists in memory but the screen has displayed on the
foreground.
3. onResume is called when the activity has been completely visible, focused, and ready for user interaction.
4. onPause is called when the user is navigating away from the activity, so the activity is partially visible.
5. onStop is called when the activity has been completely hidden from user. This callback is guaranteed to be called
before the activity can be killed. Any resources is released in here.
6. onDestroy is called when the activity has been completely destroyed.

# Development Setup
This app is developed using Android Studio 3.4.1
