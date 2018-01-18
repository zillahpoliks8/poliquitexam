package com.uic.prelimexam.poliquitexam;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.uic.prelimexam.poliquitexam.Bugtong.items;

public class BugtongActivity extends AppCompatActivity {

    Button button_stop, button_A, button_B, button_C, button_D;
    TextView textView_time, textView_currentUsername, textView_questions,textView_answered,textView_items, textView_score;
    EditText editText_question;
    int items = Bugtong.items;
//    int intID;
    MediaPlayer word;
//  DatabaseHelper databaseHelper;
//  String currentUsername;


    DatabaseHelper databaseHelper;
    public static String currentUsername;

    CountDownTimer timer;
    Bugtong bugtong;
    long remainingSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bugtong);

        word = MediaPlayer.create(BugtongActivity.this,R.raw.background);
        word.setLooping(true);
        word.start();

        textView_time = (TextView) findViewById(com.uic.prelimexam.poliquitexam.R.id.textView_time);
        textView_currentUsername = (TextView) findViewById(com.uic.prelimexam.poliquitexam.R.id.textView_currentUsername);
//        textView_questions = (TextView) findViewById(com.uic.prelimexam.poliquitexam.R.id.textView_questions);
//        textView_answered = (TextView) findViewById(com.uic.prelimexam.poliquitexam.R.id.textView_answered);
//        textView_items = (TextView) findViewById(com.uic.prelimexam.poliquitexam.R.id.txtView_items);
        textView_score = (TextView) findViewById(R.id.textView_score);
        editText_question = (EditText) findViewById(com.uic.prelimexam.poliquitexam.R.id.editText_question);
        button_A = (Button) findViewById(com.uic.prelimexam.poliquitexam.R.id.button_A);
        button_B = (Button) findViewById(com.uic.prelimexam.poliquitexam.R.id.button_B);
        button_C = (Button) findViewById(com.uic.prelimexam.poliquitexam.R.id.button_C);
        button_D = (Button) findViewById(com.uic.prelimexam.poliquitexam.R.id.button_D);
        bugtong = new Bugtong();


        databaseHelper = new DatabaseHelper(this);

        //String currentUsername = uicGetIntentExtra("currentUsername");
        currentUsername = uicGetSharedPreferenceValue("userInfo","username");
        textView_currentUsername.setText(currentUsername);

//        uicCountDown(textView_time, 180);
//        generateBugtong();
//        Bugtong.SCORE = 50;
        uicCountDown(textView_time, 251 );
        generateBugtong();
        Bugtong.SCORE = 2;
//        textView_items.setText(items+"of50");


//        textView_items.setText(+items+"/50");
//        textView_questions.setText("/50");
//        textView_answered.setText(""+ Bugtong.answered++);


        button_stop = (Button) findViewById(R.id.button_stop);
        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                word.stop();
                saveUserData();
            }
        });


        button_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("A");
            }
        });

        button_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("B");
            }
        });

        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("C");
            }
        });

        button_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("D");
            }
        });
    }

    public void generateBugtong(){
        int currentIndex = Bugtong.questionShown;
        editText_question.setText(bugtong.getBugtong(currentIndex));
        button_A.setText(bugtong.getChoices(currentIndex,0));
        button_B.setText(bugtong.getChoices(currentIndex,1));
        button_C.setText(bugtong.getChoices(currentIndex,2));
        button_D.setText(bugtong.getChoices(currentIndex,3));
        if(currentIndex>=(bugtong.TOTAL_SIZE-1)){
            word.stop();
            saveUserData();
        }else{
            Bugtong.questionShown++;
        }
    }

    public void checkUserAnswer(String choice){
        int currentIndex = Bugtong.questionShown;
        MediaPlayer correct  = MediaPlayer.create(BugtongActivity.this,R.raw.correct);
        MediaPlayer incorrect  = MediaPlayer.create(BugtongActivity.this,R.raw.incorrect);
        if(bugtong.answer[currentIndex-1].equalsIgnoreCase(choice)){
            uicToastMessage("Correct!");
            correct.start();
            items++;
//            textView_items.setText(items+"of50");
            setAnswerCorrect();
            generateBugtong();

        }else {
            uicToastMessage("Incorrect!");
            bugtong.SCORE -= 0;
            incorrect.start();
            items++;
//            textView_items.setText(items+"of50");
            generateBugtong();

        }


        textView_score.setText(Bugtong.SCORE+"");
    }

    public void setAnswerCorrect(){
        Bugtong.SCORE += (2 * 2);
        generateBugtong();

    }

    public void saveUserData(){
        boolean insertData = databaseHelper.addData(currentUsername, Bugtong.SCORE);
        if(insertData) {
            timer.cancel();
            startActivity(new Intent(BugtongActivity.this, TallyActivity.class));
        }else{
            uicToastMessage("Something wrong in your database!");
        }
    }

    public void uicCountDown(final TextView textView, int seconds){
        int timeInSeconds = seconds * 1000;
        timer = new CountDownTimer(timeInSeconds, 1000) {

            public void onTick(long millisUntilFinished) {
                remainingSeconds = (millisUntilFinished / 1000);
                textView.setText(""+remainingSeconds);
            }

            public void onFinish() {
                saveUserData();
            }
        }.start();
    }

    public String uicGetIntentExtraValue(String key){
        Bundle mainActivityExtras = getIntent().getExtras();
        String value = mainActivityExtras.getString(key);
        return value;
    }

    public String uicGetSharedPreferenceValue(String sharedPrefName, String key){
        SharedPreferences sharedPreferences = getSharedPreferences(sharedPrefName, Context.MODE_PRIVATE);
        String value = sharedPreferences.getString(key, "");
        return value;
    }

    public void uicToastMessage(String message){
        Toast.makeText(this, message ,Toast.LENGTH_SHORT).show();
    }
}
