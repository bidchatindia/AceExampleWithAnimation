package com.rahulverlekar.animations;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.nineoldandroids.animation.Animator;
import com.plattysoft.leonids.ParticleSystem;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by abhik on 26-10-2016.
 */

public class ParticleAnimator {

    public static com.rahulverlekar.animations.FakeR fakeR;
    public static void animateView(Activity activity)
    {
        fakeR = new FakeR(activity);
        View view = activity.getWindow().getDecorView().findViewWithTag("view");
        view.setBackgroundColor(fakeR.getId("color", "colorPrimary"));
        view.setVisibility(View.INVISIBLE);
        Toast.makeText(activity, "Hello From the Native Code", Toast.LENGTH_SHORT).show();
    }

    public static void changeNativeBackground(View view)
    {
        Activity activity = (Activity) view.getContext();
        activity.getWindow().getDecorView().findViewWithTag("view").setBackgroundColor(view.getContext().getColor(android.R.color.black));
        view.setVisibility(View.INVISIBLE);
    }

    public static void animateUI(Activity context, int i)
    {

    }

    public static void MakeListViewWithAnimations(final Activity activity)
    {
        View rootView = activity.getWindow().getDecorView();
        ListView listView = (ListView) rootView.findViewWithTag("lv_anim_table");
        EffectAdapter adapter = new EffectAdapter(activity);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Techniques technique = Techniques.values()[i];
                YoYo.with(technique)
                        .duration(1200)
                        .interpolate(new AccelerateDecelerateInterpolator())
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {

                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {
                                Toast.makeText(activity, "canceled", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(view);
            }
        });
    }

    public static void changeButtonMargin(Activity activity, int x, int y)
    {
        Button ivBowl = new Button(activity);
        ivBowl.setText("hi");
        RelativeLayout.LayoutParams layoutParams = new  RelativeLayout.LayoutParams(70, 70);
        layoutParams.setMargins(x, y, 0, 0); // left, top, right, bottom
        ivBowl.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = (RelativeLayout) activity.getWindow().getDecorView().findViewWithTag("rl_anim_parent");
        relativeLayout.addView(ivBowl);

    }

    public static void changeViewMargin(Activity activity, int x, int y, String tag)
    {
        View rootView = activity.getWindow().getDecorView();
        View view = rootView.findViewWithTag(tag);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(x, y, 0, 0); // left, top, right, bottom
        view.setLayoutParams(layoutParams);
    }

    public static void startShower(Activity activity, String options)
    {

        fakeR = new FakeR(activity);
        int drawableId = fakeR.getId("drawable", "ic_star_yellow");
        int x = 180, y = 180, duration = 2000, maxParticles = 50;
        try {
            JSONObject jsonObject = new JSONObject(options);
            x = jsonObject.getInt("x");
            y = jsonObject.getInt("y");
            duration = jsonObject.getInt("duration");
            maxParticles = jsonObject.getInt("max_particle");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        DisplayMetrics metrics = activity.getResources().getDisplayMetrics();
        int dpx = (int) pxFromDp(activity, x);
        int dpy = (int) dpFromPx(activity, y);
        new ParticleSystem(activity, maxParticles, drawableId, duration)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 180)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 180)
                .emit(dpx, dpy, 25);
    }

    public static float dpFromPx(final Activity context, final float px) {
        return px / context.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(final Activity context, final float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }


}