# Transportation-inf-app

## OnBoardingActivity<br>
The screen where allows user to login and register<br>


Part<br>
Files Related<br>
Description<br>
Onbroading<br>
OnBoardingActivity.java<br>
The screen where allows user to login and register<br>


res/layout/activity_on_boarding.xml<br>
Layout file<br>
Viewpager<br>
OnBoardingActivity.java<br>
It uses the OnBoardingPageAdapter to load LoginFragment and RegisterFragment<br>
OnBoardingBaseFragment<br>
OnBoardingBaseFragment.java<br>
Base fragment of the Login and RegisterFragment which has the shared logic setup<br>
LoginFragment<br>
LoginFragment extends OnBoardingBaseFragment<br>
Fragment defines the login related business logic<br>


res/layout/fragment_login.xml<br>
LoginFragment’s layout file<br>
RegisterFragment<br>
RegisterFragment extends OnBoardingBaseFragment<br>
Fragment defines the register related business logic<br>


res/layout/fragment_register.xml<br>
RegisterFragment’s  layout file<br>




## Control Panel(Activity)<br>
Control Panel is the container of everything inside, including MainFragment. Other than that Fragments, ControlPanel also contains ToolBar and Navigation View.<br>

Following table describes related files and corresponding descriptions <br>
Part<br>
Files Related<br>
Description<br>
Toolbar<br>
ControlPanel.java<br>
ControlPanel includes Toolbar<br>


res/layout/activity_control_panel.xml<br>
ControlPanel includes Toolbar<br>
NavigationView<br>
ControlPanel.java<br>
ControlPanel includes NavigationView<br>


res/layout/activity_control_panel.xml<br>
ControlPanel includes NavigationView<br>


res/layout/nav_header.xml<br>
The layout of navigationview header, at the top <br>


res/menu/drawer_view.xml<br>
The menu item below navigationvie header, includes settings & homes<br>


## MainFragment<br>
Main Fragment is the main user interface, it includes several features<br>
The main feature, it shows Google Map and event on screen.<br>



Part <br>
Related Files<br>
Description<br>
MainFragment (Main Feature)<br>
ControlPanel.java<br>
ControlPanel contains MainFragment<br>


MainFragment.java<br>
Main Fragment logic java file <br>


res/layout/fragment_main.xml<br>
Main Fragment main UI container<br>


res/raw/style_json<br>
Styling Google map<br>

Open ReportDialog and take the dialog’s callback to upload Event to Firebase (Click button on right-bottom corner of picture above)<br>
Part <br>
Related Function<br>
Description<br>
MainFragment (Upload Event)<br>
MainFragment.java<br>
Main Fragment contains Upload Event Feature <br>


showdialog <br>
Open the ReportDialog<br>


askSpeechInput<br>
Open the system speech recognition <br>


startCamer<br>
Take the callback from ReportDialog and open the camera<br>


onSubmit and uploadImage<br>
Take the callback and data from ReportDialog and uploadEvent<br>


    interface DialogCallBack {
        void onSubmit(String editString, String event_type);<br>
        void startCamera();
    }


MainFragment’s callback listener from ReportDialog<br>


## ReportDialog<br>
ReportDialog is dialog opened from MainFragment and used to display the event spec and report page. Users could switch between two page to choose the event type and data they are going to report<br>

ReportDialog<br>
res/layout/dialog.xml<br>
The top level of the reportdialog’s UI<br>
R.style.MyAlertDialogStyle<br>
res/values/styles<br>
It defines the style of the dialog<br>


res/layout/report_event_spec.xml<br>
The second page of upload event, set event details<br>


res/layout/report_event_type.xml<br>
The first page of upload event, set event type<br>


ReportRecyclerViewAdapter.java<br>
Recycler view adapter for setting up event type<br>


res/layout/recyclerview_item.xml<br>
Recycler view child view that is going to adapt to recycler view<br>

Display Event details in BottomSheet (Click any event on screen)<br>
Part <br>
Related Files<br>
Description<br>
MainFragment (Bottom Sheet)<br>
MainFragment.java<br>
Main Fragment contains Upload Bottom Sheet<br>


Id: nestedScrollView<br>
Nested layout in the fragment_main.xml<br>
Bottom Sheet layout container<br>



Helper Classes<br>
Part <br>
Related Files<br>
Description<br>
Helper<br>
Item.java<br>
Holds all item attributes, this is used to show ReportRecyclerViewAdapter<br>


TrafficEvent.java<br>
Holds all traffic event attributes<br>


User.java<br>
Holds all user attributes<br>


LocationTracker.java<br>
Get longitude and latitude of current location<br>


Config.java<br>
Temperary Configurations <br>


Utils.java<br>
Store util functions<br>


## Firebase Notifications<br>
These files are used related to firebase cloud messaging, firebase cloud function and firebase database.<br>

Part <br>
Related Files<br>
Description<br>
Firebase Cloud Messaging<br>
MyFirebaseMessagingService
.java<br>
Main Receiver of Firebase Cloud Messaging<br>


MatrixApplication<br>
Help to register Firebase Cloud Messaging token when application boots<br>





