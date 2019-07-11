package com.example.fit;


import android.annotation.SuppressLint;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * TextViewをフェードイン、フェードアウトさせるクラス<br/>
 * アニメーションを適用させたいViewがある場合、.setTextView(viewのid)を呼び出した後、.fadeoutXml()/.fadeinXml()を実行<br/>
 * 以下、alpha_fadeout.xml/alpha_fadein.xmlの設定項目<br/>
 * interpolator：補間処理を行う<br/>
 * fromAlpha：アニメーション開始時のalpha値<br/>
 * toAlpha：アニメーション終了時のalpha値<br/>
 * fillAfter：アニメーション終了時にviewをそのまま残す(true)<br/>
 * duration：アニメーションの期間[msec]<br/>
 */
@SuppressLint("Registered")
public class Animation_fadeinXml extends AppCompatActivity implements Runnable {

    private TextView textView;

    public Animation_fadeinXml(int id) {
        textView = findViewById(id);
    }


    public void run() {
        Animation animation = AnimationUtils.loadAnimation(this,
                R.anim.alpha_fadein);
        textView.startAnimation(animation);
    }
}

