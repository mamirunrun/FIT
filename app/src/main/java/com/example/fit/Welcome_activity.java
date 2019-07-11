package com.example.fit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * ようこそ画面に関するクラス
 *
 * @author Y.Hirano
 */
public class Welcome_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.welcome);


        /* 前の画面から遷移後、文章を表示。フェードイン/アウトの秒数は要変更 */


        List<Animator> animatorList = new ArrayList<Animator>();
        // イベントハンドラ
        // 指定秒数後にイベントを実行
        Handler handler = new Handler();
        // welcomeText1を0.5秒後にフェードインさせる
        final TextView textView1 = findViewById(R.id.welcomeText1);

        ObjectAnimator fadeInAnimator1 = ObjectAnimator.ofFloat(textView1, View.ALPHA, 0f, 1f);
        fadeInAnimator1.addListener(new AnimatorListenerAdapter() {
            @NonNull
            @Override
            public void onAnimationStart(Animator animation) {
                textView1.setVisibility(View.VISIBLE);
            }
        });
        fadeInAnimator1.setDuration(1000);
        fadeInAnimator1.setStartDelay(1000);
        animatorList.add(fadeInAnimator1);


        // welcomeText1を5秒後にフェードアウトさせる
        ObjectAnimator fadeOutAnimator1 = ObjectAnimator.ofFloat(textView1, "alpha", 1, 0f);

        fadeOutAnimator1.setDuration(1000);
        fadeOutAnimator1.setStartDelay(2000);
        animatorList.add(fadeOutAnimator1);


        // welcomeText2を0.5秒後にフェードインさせる
        final TextView textView2 = findViewById(R.id.welcomeText2);
        ObjectAnimator fadeInAnimator2 = ObjectAnimator.ofFloat(textView2, "alpha", 0f, 1f);
        fadeInAnimator2.addListener(new AnimatorListenerAdapter() {
            @NonNull
            @Override
            public void onAnimationStart(Animator animation) {
                textView2.setVisibility(View.VISIBLE);
            }
        });
        fadeInAnimator2.setDuration(1000);
        fadeInAnimator2.setStartDelay(500);
        animatorList.add(fadeInAnimator2);
        // welcomeText2を5秒後にフェードアウトさせる
        ObjectAnimator fadeOutAnimator2 = ObjectAnimator.ofFloat(textView2, "alpha", 1, 0f);
        fadeOutAnimator2.setDuration(1000);
        fadeOutAnimator2.setStartDelay(2000);
        animatorList.add(fadeOutAnimator2);

        // welcomeText3を0.5秒後にフェードインさせる
        final TextView textView3 = findViewById(R.id.welcomeText3);
        ObjectAnimator fadeInAnimator3 = ObjectAnimator.ofFloat(textView3, "alpha", 0f, 1f);
        fadeInAnimator3.addListener(new AnimatorListenerAdapter() {
            @NonNull
            @Override
            public void onAnimationStart(Animator animation) {
                textView3.setVisibility(View.VISIBLE);
            }
        });
        fadeInAnimator3.setDuration(1000);
        fadeInAnimator3.setStartDelay(500);
        animatorList.add(fadeInAnimator3);
        // welcomeText3を5秒後にフェードアウトさせる
        ObjectAnimator fadeOutAnimator3 = ObjectAnimator.ofFloat(textView3, "alpha", 1, 0f);
        fadeOutAnimator3.addListener(new AnimatorListenerAdapter() {
            @NonNull
            @Override
            public void onAnimationEnd(Animator animation) {
                Intent intent = new Intent(getApplication(), RegisterProfile_activity.class);
                startActivity(intent);
            }
        });
        fadeOutAnimator3.setDuration(1000);
        fadeOutAnimator3.setStartDelay(2000);
        animatorList.add(fadeOutAnimator3);


        // アニメーションの開始
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorList);
        animatorSet.start();

        /* 次の画面へ遷移 */

    }


}
