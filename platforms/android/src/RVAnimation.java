package com.rahulverlekar.animations;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.nineoldandroids.animation.Animator;

public class RVAnimation {

    public static FakeR fakeR;
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

    public static void animateUI(Activity context)
    {
        // fakeR = new FakeR(context);
        // Animation animation = AnimationUtils.loadAnimation(context, fakeR.getId(context, "anim", "bounce_and_dissapear"));
        // view.startAnimation(animation);
        View view = context.getWindow().getDecorView().findViewWithTag("view");
        YoYo.with(Techniques.Bounce)
                .duration(500)
                .playOn(view);
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
}
