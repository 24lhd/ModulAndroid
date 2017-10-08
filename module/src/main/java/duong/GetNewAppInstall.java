package duong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by d on 9/15/2017.
 */

public class GetNewAppInstall extends BroadcastReceiver {

    Context context;

    /*
     <receiver
                android:name="com.lhd.mvp.newapp.GetNewAppInstall"
                android:enabled="true"
                android:priority="0">
                <intent-filter>
                    <action android:name="android.intent.action.PACKAGE_ADDED"></action>
                    <action android:name="android.intent.action.PACKAGE_REMOVED"></action>

                    <data android:scheme="package" />
                </intent-filter>
            </receiver>
     */
    @Override
    public void onReceive(final Context context, Intent intent) {
        this.context = context;

        // when package removed
        if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {

        } else if (intent.getAction().equals(
                "android.intent.action.PACKAGE_ADDED")) {

        }
    }

    private String getLabelNameByPackageName(Context context, String packageNameToFind) {
        ArrayList<PackageInfo> res = new ArrayList<PackageInfo>();
        PackageManager pm = context.getPackageManager();
        List<PackageInfo> packs = pm.getInstalledPackages(0);
        for (int i = 0; i < packs.size(); i++) {
            PackageInfo p = packs.get(i);
            String description = (String) p.applicationInfo.loadDescription(pm);
            String label = p.applicationInfo.loadLabel(pm).toString();
            String packageName = p.packageName;
            String versionName = p.versionName;
            int versionCode = p.versionCode;
            Drawable icon = p.applicationInfo.loadIcon(pm);
            if (packageNameToFind.equals(packageName))
                return label;
        }
        return "";
    }
}