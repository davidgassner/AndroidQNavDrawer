# AndroidQNavDrawer

This sample app is based on the Nav Drawer activity template in Android Studio 3.5 Beta 2. It shows how to resolve a conflict between the swipe needed to open the nav drawer and full gestural mode on Android Q. The CustomDrawerLayout component overrides the onLayout() function and sets an "exclusion rectangle" on the left side of the screen, allowing the gesture to be handled by the drawer instead being interpreted as a back gesture (which would close the activity).
