# Transportation-inf-app

OnBoardingActivity
The screen where allows user to login and register


Part
Files Related
Description
OnBoardingActivity
OnBoardingActivity.java
The screen where allows user to login and register


res/layout/activity_on_boarding.xml
Layout file
Viewpager
OnBoardingActivity.java
It uses the OnBoardingPageAdapter to load LoginFragment and RegisterFragment
OnBoardingBaseFragment
OnBoardingBaseFragment.java
Base fragment of the Login and RegisterFragment which has the shared logic setup
LoginFragment
LoginFragment extends OnBoardingBaseFragment
Fragment defines the login related business logic


res/layout/fragment_login.xml
LoginFragment’s layout file
RegisterFragment
RegisterFragment extends OnBoardingBaseFragment
Fragment defines the register related business logic


res/layout/fragment_register.xml
RegisterFragment’s  layout file




Control Panel(Activity)
Control Panel is the container of everything inside, including MainFragment. Other than that Fragments, ControlPanel also contains ToolBar and Navigation View.

Following table describes related files and corresponding descriptions 
Part
Files Related
Description
Toolbar
ControlPanel.java
ControlPanel includes Toolbar


res/layout/activity_control_panel.xml
ControlPanel includes Toolbar
NavigationView
ControlPanel.java
ControlPanel includes NavigationView


res/layout/activity_control_panel.xml
ControlPanel includes NavigationView


res/layout/nav_header.xml
The layout of navigationview header, at the top 


res/menu/drawer_view.xml
The menu item below navigationvie header, includes settings & homes


MainFragment
Main Fragment is the main user interface, it includes several features
The main feature, it shows Google Map and event on screen.



Part 
Related Files
Description
MainFragment (Main Feature)
ControlPanel.java
ControlPanel contains MainFragment


MainFragment.java
Main Fragment logic java file 


res/layout/fragment_main.xml
Main Fragment main UI container


res/raw/style_json
Styling Google map

Open ReportDialog and take the dialog’s callback to upload Event to Firebase (Click button on right-bottom corner of picture above)
Part 
Related Function
Description
MainFragment (Upload Event)
MainFragment.java
Main Fragment contains Upload Event Feature 


showdialog 
Open the ReportDialog


askSpeechInput
Open the system speech recognition 


startCamer
Take the callback from ReportDialog and open the camera


onSubmit and uploadImage
Take the callback and data from ReportDialog and uploadEvent


    interface DialogCallBack {
        void onSubmit(String editString, String event_type);
        void startCamera();
    }


MainFragment’s callback listener from ReportDialog


ReportDialog
ReportDialog is dialog opened from MainFragment and used to display the event spec and report page. Users could switch between two page to choose the event type and data they are going to report

ReportDialog
res/layout/dialog.xml
The top level of the reportdialog’s UI
R.style.MyAlertDialogStyle
res/values/styles
It defines the style of the dialog


res/layout/report_event_spec.xml
The second page of upload event, set event details


res/layout/report_event_type.xml
The first page of upload event, set event type


ReportRecyclerViewAdapter.java
Recycler view adapter for setting up event type


res/layout/recyclerview_item.xml
Recycler view child view that is going to adapt to recycler view

Display Event details in BottomSheet (Click any event on screen)
Part 
Related Files
Description
MainFragment (Bottom Sheet)
MainFragment.java
Main Fragment contains Upload Bottom Sheet


Id: nestedScrollView
Nested layout in the fragment_main.xml
Bottom Sheet layout container



Helper Classes
Part 
Related Files
Description
Helper
Item.java
Holds all item attributes, this is used to show ReportRecyclerViewAdapter


TrafficEvent.java
Holds all traffic event attributes


User.java
Holds all user attributes


LocationTracker.java
Get longitude and latitude of current location


Config.java
Temperary Configurations 


Utils.java
Store util functions


Firebase Notifications
These files are used related to firebase cloud messaging, firebase cloud function and firebase database.

Part 
Related Files
Description
Firebase Cloud Messaging
MyFirebaseMessagingService
.java
Main Receiver of Firebase Cloud Messaging


MatrixApplication
Help to register Firebase Cloud Messaging token when application boots





