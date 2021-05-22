# Transportation-inf-app

## OnBoardingActivity<br>
The screen where allows user to login and register<br>

 
### File Related


#### activity_on_boarding.xml<br>
    Viewpager
    - OnBoardingActivity.java
    - It uses the OnBoardingPageAdapter to load LoginFragment and RegisterFragment
    
    OnBoardingBaseFragment
    - OnBoardingBaseFragment.java
    - Base fragment of the Login and RegisterFragment which has the shared logic setup
    
    LoginFragment
    - LoginFragment extends OnBoardingBaseFragment
    - Fragment defines the login related business logic


#### fragment_login.xml<br>
    - LoginFragment’s layout file
    - RegisterFragment
    - RegisterFragment extends OnBoardingBaseFragment
    - Fragment defines the register related business logic


#### fragment_register.xml<br>
    -RegisterFragment’s  layout file




## Control Panel(Activity)<br>
Control Panel is the container of everything inside, including MainFragment. Other than that Fragments, ControlPanel also contains ToolBar and Navigation View.

### Files Related<br>

#### activity_control_panel.xml<br>
    - ControlPanel includes Toolbar
    - NavigationView
    - ControlPanel.java
    - ControlPanel includes NavigationView

#### activity_control_panel.xml<br>
    - ControlPanel includes NavigationView


#### nav_header.xml<br>
    - The layout of navigationview header, at the top


#### drawer_view.xml<br>
    - The menu item below navigationvie header, includes settings & homes


## MainFragment<br>
Main Fragment is the main user interface, it includes several features
The main feature, it shows Google Map and event on screen.

### Related Files<br>

#### MainFragment.java<br>
    - Main Fragment logic java file 


#### fragment_main.xml<br>
    - Main Fragment main UI container


#### style_json<br>
    - Styling Google map

#### Open ReportDialog and take the dialog’s callback to upload Event to Firebase (Click button on right-bottom corner of picture above)


## MainFragment (Upload Event)<br>
### Related Files<br>
#### MainFragment.java<br>
    - Main Fragment contains Upload Event Feature

### showdialog <br>
    - Open the ReportDialog


### askSpeechInput<br>
    - Open the system speech recognition


### startCamer<br>
    - Take the callback from ReportDialog and open the camera


### onSubmit and uploadImage<br>
    - Take the callback and data from ReportDialog and uploadEvent


    interface DialogCallBack {
        void onSubmit(String editString, String event_type);
        void startCamera();
    }


    MainFragment’s callback listener from ReportDialog


## ReportDialog<br>
ReportDialog is dialog opened from MainFragment and used to display the event spec and report page. Users could switch between two page to choose the event type and data they are going to report

### dialog.xml<br>
    The top level of the reportdialog’s UI
    R.style.MyAlertDialogStyle
    
### styles<br>
    It defines the style of the dialog

### report_event_spec.xml<br>
    The second page of upload event, set event details


### report_event_type.xml<br>
    - The first page of upload event, set event type


### ReportRecyclerViewAdapter.java<br>
    - Recycler view adapter for setting up event type

### recyclerview_item.xml<br>
    - Recycler view child view that is going to adapt to recycler view

## Display Event details in BottomSheet (Click any event on screen)<br>

### Related Files<br>

#### MainFragment.java<br>
    - Main Fragment contains Upload Bottom Sheet


### Id: nestedScrollView<br>
#### Nested layout in the fragment_main.xml<br>
    - Bottom Sheet layout container



## Helper Classes<br>
### Related Files<br>

#### Item.java<br>
    - Holds all item attributes, this is used to show ReportRecyclerViewAdapter


#### TrafficEvent.java<br>
    - Holds all traffic event attributes


#### User.java<br>
    - Holds all user attributes


#### LocationTracker.java<br>
    - Get longitude and latitude of current location


#### Config.java<br>
    - Temperary Configurations


#### Utils.java<br>
    - Store util functions


## Firebase Notifications<br>
These files are used related to firebase cloud messaging, firebase cloud function and firebase database.

### Related Files<br>

#### MyFirebaseMessagingService.java<br>
    - Main Receiver of Firebase Cloud Messaging


### MatrixApplication<br>
    Help to register Firebase Cloud Messaging token when application boots





