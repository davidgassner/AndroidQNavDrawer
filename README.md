# AndroidQNavDrawer

This sample app is based on the Nav Drawer activity template in Android Studio 3.5 Beta 2. It shows how to resolve a conflict between the swipe needed to open the nav drawer and full gestural mode on Android Q. 

This repo's master branch has the starting app. When opened on an Android Q device, a swipe from the left closes the app. 

The 'override_gestures' branch adds the new custom View and uses it in the XML layout file. This version lets the user open the nav drawer with the same swipe gesture. CustomDrawerLayout is a custom View component that extends DrawerLayout. It overrides the onLayout() function and sets an "exclusion rectangle" on the left side of the screen, allowing the gesture to be handled by the nav drawer instead being interpreted by the system as a back gesture that closes the activity.
