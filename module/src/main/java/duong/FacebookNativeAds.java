package duong;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.ads.NativeAd;

import duong.update.code.R;


/**
 * Created by d on 9/29/2017.
 */

public class FacebookNativeAds extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_ads);
    }
    NativeAd nativeAd;

    /*
        thêm    compile 'com.facebook.android:audience-network-sdk:4.+'
         */
//    public void loadFacebookAds(View view, Context context) {
//        nativeAd = new NativeAd("Mã_quảng_cáo");
//        nativeAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded(Ad ad) {
////                    if (ad != nativeAd) {
////                        return;
////                    }
//
//                // Add the Ad view into the ad container.
//                LinearLayout nativeAdContainer = (LinearLayout) findViewById(R.id.settings_layout_ads);
//                LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
//                // Inflate the Ad view.  The layout referenced should be the one you created in the last step.
//                View adView = inflater.inflate(R.layout.native_ad_layout_300, nativeAdContainer, false);
//                nativeAdContainer.removeAllViews();
//                nativeAdContainer.addView(adView);
//
//                // Create native UI using the ad metadata.
//                ImageView nativeAdIcon = (ImageView) adView.findViewById(R.id.native_ad_icon);
//                TextView nativeAdTitle = (TextView) adView.findViewById(R.id.native_ad_title);
//                MediaView nativeAdMedia = (MediaView) adView.findViewById(R.id.native_ad_media);
//                TextView nativeAdSocialContext = (TextView) adView.findViewById(R.id.native_ad_social_context);
//                TextView nativeAdBody = (TextView) adView.findViewById(R.id.native_ad_body);
//                Button nativeAdCallToAction = (Button) adView.findViewById(R.id.native_ad_call_to_action);
//
//                // Set the Text.
//                nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
//                nativeAdTitle.setText(nativeAd.getAdTitle());
//                nativeAdBody.setText(nativeAd.getAdBody());
//                nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
//
//                // Download and display the ad icon.
//                NativeAd.Image adIcon = nativeAd.getAdIcon();
//                NativeAd.downloadAndDisplayImage(adIcon, nativeAdIcon);
//
//                // Download and display the cover image.
//                nativeAdMedia.setNativeAd(nativeAd);
//
//                // Add the AdChoices icon
//                LinearLayout adChoicesContainer = (LinearLayout) findViewById(R.id.ad_choices_container);
//                AdChoicesView adChoicesView = new AdChoicesView(getApplicationContext(), nativeAd, true);
//                adChoicesContainer.addView(adChoicesView);
//
//                // Register the Title and CTA button to listen for clicks.
//                List<View> clickableViews = new ArrayList<>();
//                clickableViews.add(nativeAdIcon);
//                clickableViews.add(nativeAdTitle);
//                clickableViews.add(nativeAdMedia);
//                clickableViews.add(nativeAdSocialContext);
//                clickableViews.add(nativeAdBody);
//                clickableViews.add(nativeAdCallToAction);
//                nativeAd.registerViewForInteraction(nativeAdContainer, clickableViews);
//            }
//
//            @Override
//            public void onError(Ad ad, AdError error) {
//            }
//
//            @Override
//            public void onAdClicked(Ad ad) {
//            }
//
//            @Override
//            public void onLoggingImpression(Ad ad) {
//
//            }
//        });
//        nativeAd.loadAd();
//
//    }
}

