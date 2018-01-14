package kola.com.tictactoe;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static kola.com.tictactoe.R.drawable.tic;

public class MainActivity extends AppCompatActivity {int c=1;int a=0;int b=0;int d=0;int f=0;int g=0;int h=0;int i=0;int j=0;
   int k=0;int l=0;int m=0; int n=0;int o=0;int p=0;int q=0;int r=0;int s=0;int e=0;
   ImageButton b1; ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5; ImageButton b6; ImageButton b7; ImageButton b8;Button re;
    ImageButton b9;//TextView tx=(TextView)findViewById(R.id.txt);
    //TextView tx=(TextView) findViewById(R.id.tx);
    Button ai;int z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (ImageButton) findViewById(R.id.b1);re=(Button)findViewById(R.id.re);
        b2 = (ImageButton) findViewById(R.id.b2);ai=(Button)findViewById(R.id.singl);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compu();

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0&&b==0)
                { if (c % 2 == 0) {
                    b1.setImageResource(R.drawable.toe);a=1;}
                else {
                    b1.setImageResource(R.drawable.tic);b=1;
                }

                c++;win();

                }}
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(d==0&&e==0){
                if (c % 2 == 0) {
                    b2.setImageResource(R.drawable.toe);d=1;
                } else {
                    b2.setImageResource(R.drawable.tic);e=1;
                }

                c++;win();


            }}
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(f==0&&g==0)
                {
                if (c % 2 == 0) {
                    b3.setImageResource(R.drawable.toe);f=1;
                } else {
                    b3.setImageResource(R.drawable.tic);g=1;
                }

                c++;win();}

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(h==0&&i==0)
                {  if (c % 2 == 0)
                    { b4.setImageResource(R.drawable.toe);h=1;}
                 else {
                    b4.setImageResource(R.drawable.tic);i=1;
                }

                c++;win();}

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(j==0&&k==0){
                if (c % 2 == 0) {
                    b5.setImageResource(R.drawable.toe);j=1;
                } else {
                    b5.setImageResource(R.drawable.tic);k=1;
                }

                c++;win();}}

            });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l==0&&m==0){
                if (c % 2 == 0) {
                    b6.setImageResource(R.drawable.toe);l=1;
                } else {
                    b6.setImageResource(R.drawable.tic);m=1;
                }

                c++;win();}}


        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r==0&&s==0){
                if (c % 2 == 0) {
                    b7.setImageResource(R.drawable.toe);r=1;
                } else {
                    b7.setImageResource(R.drawable.tic);s=1;
                }

                c++;win();}

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0&&o==0)
                {
                if (c % 2 == 0) {
                    b8.setImageResource(R.drawable.toe);n=1;
                } else {
                    b8.setImageResource(R.drawable.tic);o=1;
                }

                c++;win();}

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p==0&&q==0){
                if (c % 2 == 0) {
                    b9.setImageResource(R.drawable.toe);p=1;
                } else {
                    b9.setImageResource(R.drawable.tic);q=1;
                }

                c++;win();}

            }
        });

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { TextView tx=(TextView) findViewById(R.id.tx);
                 c=1; a=0; b=0; d=0; f=0; g=0; h=0; i=0; j=0;
                 k=0; l=0; m=0; n=0; o=0; p=0; q=0; r=0; s=0; e=0;z=0;
               b1.setImageResource(R.drawable.white);
                b2.setImageResource(R.drawable.white);
                b3.setImageResource(R.drawable.white);
                b4.setImageResource(R.drawable.white);
                b5.setImageResource(R.drawable.white);
                b6.setImageResource(R.drawable.white);
                b7.setImageResource(R.drawable.white);
                b8.setImageResource(R.drawable.white);
                b9.setImageResource(R.drawable.white);
               b1.setBackgroundResource(R.drawable.white);
                b2.setBackgroundResource(R.drawable.white);
                b3.setBackgroundResource(R.drawable.white);
                b4.setBackgroundResource(R.drawable.white);
                b5.setBackgroundResource(R.drawable.white);
                b6.setBackgroundResource(R.drawable.white);
                b7.setBackgroundResource(R.drawable.white);
                b8.setBackgroundResource(R.drawable.white);
                b9.setBackgroundResource(R.drawable.white);


           tx.setText("");

            }
        });




    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void win()
    { TextView tx=(TextView) findViewById(R.id.tx);
       if(z==0)
       {
        if(h==1&&j==1&&p==1)
       { tx.setText("p2 win");b4.setBackgroundResource(R.drawable.red);
           b5.setBackgroundResource(R.drawable.red);
           b9.setBackgroundResource(R.drawable.red);z++;
       }
        else if (i==1&&k==1&&q==1)
       {tx.setText("p1 win");
           b4.setBackgroundResource(R.drawable.red);b5.setBackgroundResource(R.drawable.red);z++;b9.setBackgroundResource(R.drawable.red);z++;}
        else if (r==1&&d==1&&a==1)
       {  tx.setText("p2 win");b7.setBackgroundResource(R.drawable.red);b2.setBackgroundResource(R.drawable.red);
           b1.setBackgroundResource(R.drawable.red);z++;}
        else if(s==1&&e==1&&b==1)
       {  tx.setText("p1 win");b7.setBackgroundResource(R.drawable.red);b2.setBackgroundResource(R.drawable.red);
           b1.setBackgroundResource(R.drawable.red); z++;}
        else if(f==1&&n==1&&l==1)
       {   tx.setText("p2 win");b3.setBackgroundResource(R.drawable.red);b6.setBackgroundResource(R.drawable.red);
           b8.setBackgroundResource(R.drawable.red); z++;}
        else if(g==1&&o==1&&m==1)
       { tx.setText("p1 win");b3.setBackgroundResource(R.drawable.red);b6.setBackgroundResource(R.drawable.red);
           b8.setBackgroundResource(R.drawable.red);z++;}
        else if(h==1&&r==1&&f==1)
       {    tx.setText("p2 win");b4.setBackgroundResource(R.drawable.red);b7.setBackgroundResource(R.drawable.red);
           b3.setBackgroundResource(R.drawable.red);z++;}
        else if(i==1&&s==1&&g==1)
       {   tx.setText("p1 win");b4.setBackgroundResource(R.drawable.red);b7.setBackgroundResource(R.drawable.red);
           b3.setBackgroundResource(R.drawable.red);z++;}
        else if(j==1&&d==1&&n==1)
       {       tx.setText("p2 win");b5.setBackgroundResource(R.drawable.red);b2.setBackgroundResource(R.drawable.red);
           b8.setBackgroundResource(R.drawable.red); z++;}
        else if(k==1&&e==1&&o==1)
       {     tx.setText("p1 win");b5.setBackgroundResource(R.drawable.red);b8.setBackgroundResource(R.drawable.red);
           b2.setBackgroundResource(R.drawable.red); z++;}
        else if(p==1&&a==1&&l==1)
       {   tx.setText("p2 win");b9.setBackgroundResource(R.drawable.red);b1.setBackgroundResource(R.drawable.red);
           b6.setBackgroundResource(R.drawable.red); z++;}
        else if(q==1&&b==1&&m==1)
       {   tx.setText("p1 win");b9.setBackgroundResource(R.drawable.red);b1.setBackgroundResource(R.drawable.red);
           b6.setBackgroundResource(R.drawable.red); z++;}
        else if(h==1&&d==1&&l==1)
       {     tx.setText("p2 win");b4.setBackgroundResource(R.drawable.red);b2.setBackgroundResource(R.drawable.red);
           b6.setBackgroundResource(R.drawable.red); z++;}
        else if(i==1&&e==1&&m==1)
       {   tx.setText("p1 win");b4.setBackgroundResource(R.drawable.red);b2.setBackgroundResource(R.drawable.red);
           b6.setBackgroundResource(R.drawable.red); z++;}
        else if(p==1&&d==1&&f==1)
       {     tx.setText("p2 win");b9.setBackgroundResource(R.drawable.red);b2.setBackgroundResource(R.drawable.red);
           b3.setBackgroundResource(R.drawable.red); z++;}
       else if (q==1&&e==1&&g==1)
       {   tx.setText("p1 win");b9.setBackgroundResource(R.drawable.red);b2.setBackgroundResource(R.drawable.red);
           b3.setBackgroundResource(R.drawable.red);    z++;}
        else if(c==10)
            tx.setText("KHICHADHI    PAKI");
        }}



public  void compu()
{Intent intent=new Intent(this,comp.class);
startActivity(intent);}





    }

