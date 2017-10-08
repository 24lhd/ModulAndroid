package duong;

/**
 * Created by d on 10/2/2017.
 */

public class FacebookAnalytic {
// hướng dẫn  https://developers.facebook.com/docs/analytics/quickstart-android
    /* build.gradle
            repositories {
                mavenCentral()
            }
            compile 'com.facebook.android:facebook-android-sdk:[4,5)'
     */

    /*  Value
             <string name="facebook_app_id">day_la_id_app</string>
     */
    /*  Manafest
            <meta-data android:name="com.facebook.sdk.ApplicationId"android:value="@string/facebook_app_id"/>
     */
    /* Activity
            protected void onResume(){
                super.onResume();
                AppEventsLogger.activateApp(this);
            }
                // for Android, you should also log app deactivation

            protected void onPause(){
                super.onPause();
                AppEventsLogger.deactivateApp(this);
            }
     */
    /* Gọi sau setContentView
        FacebookSdk.sdkInitialize(getApplicationContext());
     */
    /*
       Gửi mã tracking lên FB analytic
       AppEventsLogger logger=AppEventsLogger.newLogger(this);

        Add to a button click handler
       logger.logEvent("Button_start_click");  // Đặt vào sự kiện muốn tracking, key này sẽ gửi lên FB analytic"
     */
}