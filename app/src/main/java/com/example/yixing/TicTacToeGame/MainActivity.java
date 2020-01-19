package com.example.yixing.TicTacToeGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
 /*   static final String STATE_SCORE = "playerScore";
    static final String STATE_LEVEL = "playerLevel";
 */
    int c1,c2,c3,c4,c5,c6,c7,c8,c9= 0;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;

    int turn;
    boolean end = false;
    int xscore;
    int oscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(MainActivity.this, "X Starts first-designed by Yixing", Toast.LENGTH_SHORT).show();

        b1 = ((Button)findViewById(R.id. b1));
        b2 = ((Button)findViewById(R.id. b2));
        b3 = ((Button)findViewById(R.id. b3));
        b4 = ((Button)findViewById(R.id. b4));
        b5 = ((Button)findViewById(R.id. b5));
        b6 = ((Button)findViewById(R.id. b6));
        b7 = ((Button)findViewById(R.id. b7));
        b8 = ((Button)findViewById(R.id. b8));
        b9 = ((Button)findViewById(R.id. b9));

        turn = 1;
        c1= 0;
        c2=0;
        c3=0;
        c4=0;
        c5=0;
        c6=0;
        c7=0;
        c8=0;
        c9=0;
        end = false;


     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if (b1.getText().toString().equals("")) {
                 if (turn==1) {
                     turn=2;
                     b1.setText("X");
                 }else if (turn==2){
                     turn=1;
                     b1.setText("O");
                 }
             }
             c1= 1;
             endGame ();
         }
     });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn==1) {
                        turn=2;
                        b2.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b2.setText("O");
                    }
                }
                c2= 1;
                endGame ();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn==1) {
                        turn=2;
                        b3.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b3.setText("O");
                    }
                }
                c3= 1;
                endGame ();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn==1) {
                        turn=2;
                        b4.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b4.setText("O");
                    }
                }
                c4= 1;
                endGame ();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn==1) {
                        turn=2;
                        b5.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b5.setText("O");
                    }
                }
                c5=1;
                endGame ();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn==1) {
                        turn=2;
                        b6.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b6.setText("O");
                    }
                }
                c6= 1;
                endGame ();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn==1) {
                        turn=2;
                        b7.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b7.setText("O");
                    }
                }
                c7= 1;
                endGame ();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn==1) {
                        turn=2;
                        b8.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b8.setText("O");
                    }
                }
                c8= 1;
                endGame ();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn==1) {
                        turn=2;
                        b9.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b9.setText("O");
                    }
                }
                c9= 1;
                endGame ();
            }
        });

    }


    public void endGame () {    //checking if game will end



        String a,b,c,d,e,f,g,h,i;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

//variations of winning combinations
        //combo 1
        if (a.equals("X") && b .equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            end = true;
            xscore++;
        }
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            end = true;
            oscore++;
        }

        //combo 2
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            end = true;
            xscore++;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            end = true;
            oscore++;
        }

        //combo 3
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            end = true;
            xscore++;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            end = true;
            oscore++;
        }

        //combo 4
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            end = true;
            xscore++;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            end = true;
            oscore++;
        }

        //combo 5
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            end = true;
            xscore++;
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            end = true;
            oscore++;
        }

        //combo 6
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            end = true;
            xscore++;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            end = true;
            oscore++;
        }

        //combo 7
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            end = true;
            xscore++;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            end = true;
            oscore++;
        }

        //combo 8
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            end = true;
            xscore++;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            end = true;
            oscore++;
        }

        //combo 9- a tie
        if (c1==1 && c2 ==1 && c3==1 && c4==1 && c5==1 && c6==1 && c7==1 && c8==1 && c9==1) {
            Toast.makeText(MainActivity.this, "It's a Tie", Toast.LENGTH_LONG).show();
            end= true;
        }
        //closing the buttons when won
       if(end) {

         // b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }

        if (end || c1==1 & c2 ==1 & c3==1 & c4==1 & c5==1 & c6==1 & c7==1 & c8==1 & c9==1) {
            b1.setText("GO");



            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c1= 0;
                    c2=0;
                    c3=0;
                    c4=0;
                    c5=0;
                    c6=0;
                    c7=0;
                    c8=0;
                    c9=0;
                    end = false;

                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });


        }
    }
}
