package com.example.fit;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

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

        // イベントハンドラ
        // 指定秒数後にイベントを実行
        Handler handler = new Handler();
        // welcomeText1を0.5秒後にフェードインさせる
        handler.postDelayed(new Animation_fadeinXml(R.id.welcomeText1), 500);
        // welcomeText1を5秒後にフェードアウトさせる
        handler.postDelayed(new Animation_fadeoutXml(R.id.welcomeText1), 5000);

        // welcomeText2を0.5秒後にフェードインさせる
        handler.postDelayed(new Animation_fadeinXml(R.id.welcomeText2), 500);
        // welcomeText2を5秒後にフェードアウトさせる
        handler.postDelayed(new Animation_fadeoutXml(R.id.welcomeText2), 5000);

        // welcomeText3を0.5秒後にフェードインさせる
        handler.postDelayed(new Animation_fadeinXml(R.id.welcomeText3), 500);
        // welcomeText3を5秒後にフェードアウトさせる
        handler.postDelayed(new Animation_fadeoutXml(R.id.welcomeText3), 5000);

        /* 次の画面へ遷移 */

    }
}
