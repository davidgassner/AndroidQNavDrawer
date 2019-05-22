# AndroidQNavDrawer

This sample app is based on the Nav Drawer activity template in Android Studio 3.5 Beta 2. It shows how to resolve a conflict between the swipe needed to open the nav drawer and full gestural mode on Android Q. 

This repo's master branch has the starting app. When opened on an Android Q device, a swipe from the left closes the app. 

The 'override_gestures' branch shows in general terms how to create exclusion areas on the screen that don't react to system gestures. WARNING: THIS ISN'T REALLY NECESSARY FOR THE DrawerLayout COMPONENT AND IS FOR DEMONSTRATION ONLY. This branch adds a new custom DrawerLayout component and uses it in the XML layout file. The custom View component overrides the onLayout() function and sets an "exclusion rectangle" on the left side of the screen, allowing the gesture to be handled by the drawer instead being interpreted by the system as a back gesture that closes the activity.

The 'new_drawer_layout' branch shows the correct way to handle this with DrawerLayout. It adds a dependency for the most recent version of DrawerLayout, which uses the same rectangle exclusion technique but does a more thorough and specific job of it. It also ensures that apps that don't target Android Q work correctly on Android Q devices.

More documentation and the most recent dependency version are available at:

https://developer.android.com/jetpack/androidx/releases/drawerlayout
