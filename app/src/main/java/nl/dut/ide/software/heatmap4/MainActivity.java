package nl.dut.ide.software.heatmap4;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    private TableLayout boardTableLayout;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boardTableLayout = findViewById(R.id.board_tablelayout);
        //
        Button btn0000 = findViewById(R.id.button0000);
        Button btn0001 = findViewById(R.id.button0001);
        Button btn0002 = findViewById(R.id.button0002);
        Button btn0003 = findViewById(R.id.button0003);
        Button btn0004 = findViewById(R.id.button0004);
        Button btn0005 = findViewById(R.id.button0005);
        Button btn0006 = findViewById(R.id.button0006);
        Button btn0007 = findViewById(R.id.button0007);
        Button btn0008 = findViewById(R.id.button0008);
        Button btn0009 = findViewById(R.id.button0009);
        Button btn0010 = findViewById(R.id.button0010);

        Button[][] btnTag = new Button [10][10];
        private void createb(){
            int k=0;
            for (int i=0; i<9; i++){
                TableRow row = new TableRow(this);
                row.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.));
            }
        }
        

        int [ ] [ ] matrix = new int [ 10 ] [ 10 ] ;
        // declare 2d 10x10 matrix

        // Uitgaand van 0-5 , 5-10, 10-15
        for (int i=0; i<10; i++){
            if ((matrix[0][i]) < 5){

                //change color button
            }
            if (matrix[0][i] > 5 && matrix[0][i] < 10){
                //change color button
            }
            if (matrix[0][i] < 15 && matrix[0][i] > 10){
                //change color button
            }
        }



        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn1.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn1.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn2.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn2.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn3.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn3.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn4.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn4.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn5.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn5.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn6.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn6.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn7.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn7.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn8.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn8.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn9.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn9.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn10.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn10.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });

        btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== KeyEvent.ACTION_DOWN) {
                    btn11.setBackgroundColor(Color.BLUE);
                } else if (event.getAction() == KeyEvent.ACTION_UP){
                    btn11.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });


    }


}
