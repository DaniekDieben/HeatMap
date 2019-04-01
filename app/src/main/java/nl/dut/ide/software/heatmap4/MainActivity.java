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

    private Button[][] btnTag = new Button [10][10];
    private int[][] matrix = new int [10][10] ;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateButtons();

        matrix[1][2] = 3;
        matrix[3][4]=12;
        matrix[3][6]=9;
        matrix[1][3]=7;
        matrix[1][1]=14;


        // Uitgaand van 0-5 , 5-10, 10-15
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++) {
                if (matrix[i][j] < 5) {
                    //change color button
                    btnTag[i][j].setBackgroundColor(Color.parseColor("#01ff90"));

                } else if (matrix[i][j] < 10) {
                    //change color button
                    btnTag[i][j].setBackgroundColor(Color.parseColor("#FBA80E"));

                } else if (matrix[i][j] < 15) {
                    //change color button
                    btnTag[i][j].setBackgroundColor(Color.parseColor("#EE1C1C"));

                }
            }
        }
    }
    private void populateButtons() {
        TableLayout table = findViewById(R.id.TabelForButtons);
        int k = 0;
        for (int i=0; i<10; i++){
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT));
            matrix[i] = new int[10];
            for (int j=0; j<10;j++){
                btnTag[i][j] = new Button(this);
                k++;
                btnTag[i][j].setId(k);
                matrix[i][j] = 0;
                tableRow.addView(btnTag[i][j]);

            }
            table.addView(tableRow);
        }
//        btnTag[1][1].setBackgroundColor(Color.parseColor("#01ff90"));



    }


}
