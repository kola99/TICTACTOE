package kola.com.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class comp extends AppCompatActivity {
    Button me;
    int c = 1;
    int z = 0;String ss="";
    int kk;
    int a = 0;
    int arr[] = new int[9];
    int arr1[] = new int[9];

    int b = 0;
    int d = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    int m = 0;
    int n = 0;
    int o = 0;
    int p = 0;
    int q = 0;
    int r = 0;
    int s = 0;
    int e = 0;
    int count = 1;
    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5;
    ImageButton b6;String st="";
    ImageButton b7;
    ImageButton b8;
    Button re, singl;


    ImageButton b9;//TextView tx=(TextView)findViewById(R.id.txt);
    //TextView tx=(TextView) findViewById(R.id.tx);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);
       arr[0]=a;
        arr1[0]=b;
        arr[1]=d;
        arr1[1]=e;
        arr[2] =f;
        arr1[2]=g;
        arr[3] =h;
        arr1[3] =i;
        arr[4] =j;
        arr1[4] =k;
        arr[5] =l;
        arr1[5] =m;
        arr[6] =r;
        arr1[6] =s;
        arr[7] =n;
        arr1[7]=o;
        arr[8]=p;
        arr1[8]=q;
        for (int i=0;i<9;i++)
        {arr[i]=0;arr1[i]=0;}
     /* me = (Button) findViewById(R.id.I);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 1;*/


        b1 = (ImageButton) findViewById(R.id.b1);
        re = (Button) findViewById(R.id.re);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (b == 0 && a == 0) {
                        if (c % 2 == 0) {
                            // b1.setImageResource(R.drawable.toe);
                            a = 1;
                        } else {
                            b1.setImageResource(R.drawable.tic);
                            b = 1;
                            c++;
                        }

                        // c++;
                        iswin();

                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (e == 0 && d == 0) {
                        if (c % 2 == 0) {
                            // b2.setImageResource(R.drawable.toe);
                            d = 1;
                        } else {
                            b2.setImageResource(R.drawable.tic);
                            e = 1;
                            c++;


                        }

                        //   c++;
                        iswin();


                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (g == 0 && f == 0) {
                        if (c % 2 == 0) {
                            // b3.setImageResource(R.drawable.toe);
                            f = 1;
                        } else {
                            b3.setImageResource(R.drawable.tic);
                            g = 1;
                            c++;
                        }

                        // c++;
                        iswin();
                    }
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (i == 0 && h == 0) {
                        if (c % 2 == 0) {
                            // b4.setImageResource(R.drawable.toe);
                            h = 1;
                        } else {
                            b4.setImageResource(R.drawable.tic);
                            i = 1;
                            c++;
                        }

                        //  c++;
                        iswin();
                    }
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (k == 0 && j == 0) {
                        if (c % 2 == 0) {
                            // b5.setImageResource(R.drawable.toe);
                            j = 1;
                        } else {
                            b5.setImageResource(R.drawable.tic);
                            k = 1;
                            c++;
                        }

                        //  c++;
                        iswin();
                    }
                }
            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (m == 0 && l == 0) {
                        if (c % 2 == 0) {
                            //  b6.setImageResource(R.drawable.toe);
                            l = 1;
                        } else {
                            b6.setImageResource(R.drawable.tic);
                            m = 1;
                            c++;
                        }

                        // c++;
                        iswin();
                    }
                }
            }


        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (s == 0 && r == 0) {
                        if (c % 2 == 0) {
                            //   b7.setImageResource(R.drawable.toe);
                            r = 1;
                        } else {
                            b7.setImageResource(R.drawable.tic);
                            s = 1;
                            c++;
                        }

                        //  c++;
                        iswin();
                    }
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (o == 0 && n == 0) {
                        if (c % 2 == 0) {
                            //  b8.setImageResource(R.drawable.toe);
                            n = 1;
                        } else {
                            b8.setImageResource(R.drawable.tic);
                            o = 1;
                            c++;
                        }

                        //   c++;
                        iswin();
                    }
                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 != 0) {
                    if (q == 0 && p == 0) {
                        if (c % 2 == 0) {
                            //  b9.setImageResource(R.drawable.toe);
                            p = 1;
                        } else {
                            b9.setImageResource(R.drawable.tic);
                            q = 1;
                            c++;
                        }

                        //c++;
                        iswin();
                    }
                }

            }
        });


        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tx = (TextView) findViewById(R.id.tx);
                c = 1;
                a = 0;
                b = 0;
                d = 0;
                f = 0;
                g = 0;
                h = 0;
                i = 0;
                j = 0;
                k = 0;
                l = 0;
                m = 0;ss="";
                n = 0;
                o = 0;
                p = 0;
                q = 0;
                r = 0;
                s = 0;st="";
                kk = 0;
                e = 0;
                z = 0;
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


        //  }


        // });

    }

    public void chaal() {


    }

    public void iswin()

    {
        if (e != 1) {

            if (c == 2) {
                if (b == 1 || g == 1 || i == 1 || k == 1 || m == 1 || s == 1 || o == 1 || q == 1)


                {
                    b2.setImageResource(R.drawable.toe);
                    d = 1;
                    c++;
                    win();
                }
            }
            if (c == 4) {
                if (q == 1) {
                    if (m == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                    if(i==1)
                    {b5.setImageResource(R.drawable.toe);j=1;}
                    if (b == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (k == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                    if (h == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (s == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                    if (g == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (o == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                }

                if (i == 1) {
                    if (k == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (q == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (b == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (m == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (o == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (s == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                }
                if (g == 1) {
                    if (s == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                    if (i == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (k == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                    if (q == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (b == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (m == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (o == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                }
                if (m == 1) {
                    if (o == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (s == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (i == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (k == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (q == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                    if (b == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }
                if (b == 1) {
                    if (q == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (k == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (i == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (s == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (o == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (m == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }
                if (s == 1) {
                    if (i == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (k == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                    if (q == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                    if (b == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (m == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (o == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                }
                if (o == 1) {
                    if (g == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (s == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (i == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (k == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (q == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (b == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                    }
                    if (m == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                }
                if (k == 1) {
                    if (q == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                        b5.setImageResource(R.drawable.tic);
                    }
                    if (b == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (m == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (o == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                    if (s == 1) {
                        b4.setImageResource(R.drawable.toe);
                        h = 1;
                    }
                    if (i == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }
                c++;
                win(); TextView tx = (TextView) findViewById(R.id.tx);tx.setText(""+i);


            }




            if(c==6)
            { chal();TextView tx = (TextView) findViewById(R.id.tx);tx.setText(""+ss+"+st");

                int nn=ss.length();int cnt=0;
                for(int i=0;i<nn;i++)
                {char c=ss.charAt(i);
                    if(c=='a')

                    {a=1;

                          if(cwin()==true)
                        { b1.setImageResource(R.drawable.toe);win();cnt++;break;}
                        else
                            a=0;
                    }
                  else  if(c=='d'){d=1;

                        if(cwin()==true)
                        { b2.setImageResource(R.drawable.toe);win();cnt++;break;}
                        else
                            d=0;
                    }
                 else   if(c=='f'){f=1;

                        if(cwin()==true)
                        { b3.setImageResource(R.drawable.toe);win();cnt++;break;}
                        else
                            f=0;
                    }
                 else   if(c=='h'){h=1;

                        if(cwin()==true)
                        { b4.setImageResource(R.drawable.toe);win();cnt++;break;}
                        else
                            h=0;
                    }
                   else if(c=='j'){j=1;

                        if(cwin()==true)
                        { b5.setImageResource(R.drawable.toe);win();cnt++;break;}
                        else
                            j=0;
                    }
                 else   if(c=='l'){l=1;

                        if(cwin()==true)
                        { b6.setImageResource(R.drawable.toe);win();cnt++;break;}
                        else
                            l=0;
                    }
                 else   if(c=='r'){r=1;

                        if(cwin()==true)
                        { b7.setImageResource(R.drawable.toe);win();cnt++;break;}
                        else
                            r=0;
                    }
                   else if(c=='n'){n=1;

                        if(cwin()==true)
                        { b8.setImageResource(R.drawable.toe);win();cnt++;;break;}
                        else
                            n=0;
                    }
                  else  if(c=='p'){p=1;

                        if(cwin()==true)
                        { b9.setImageResource(R.drawable.toe);win();cnt++;break;}
                        else
                            p=0;
                    }
       char chh=st.charAt(i);
        if(chh=='b') {
             b = 1;
             if (cwin() == true) {
                 b1.setImageResource(R.drawable.toe);
             } else b = 0;
         }
      else   if(chh=='e') {
             e= 1;
             if (cwin() == true) {
                 b2.setImageResource(R.drawable.toe);
             } else e = 0;
         }
       else  if(chh=='g') {
             g = 1;
             if (cwin() == true) {
                 b3.setImageResource(R.drawable.toe);
             } else g = 0;
         }
      else   if(chh=='i') {
             i = 1;
             if (cwin() == true) {
                 b4.setImageResource(R.drawable.toe);
             } else i = 0;
         }
      else   if(chh=='k') {
             k= 1;
             if (cwin() == true) {
                 b5.setImageResource(R.drawable.toe);
             } else k = 0;
         }
      else   if(chh=='m') {
             m= 1;
             if (cwin() == true) {
                 b6.setImageResource(R.drawable.toe);
             } else m = 0;
         }
      else   if(chh=='s') {
             s = 1;
             if (cwin() == true) {
                 b7.setImageResource(R.drawable.toe);
             } else s= 0;
         }
        else if(chh=='o') {
             o= 1;
             if (cwin() == true) {
                 b8.setImageResource(R.drawable.toe);
             } else o = 0;
         }
        else if(chh=='q') {
             q = 1;
             if (cwin() == true) {
                 b9.setImageResource(R.drawable.toe);
             } else q = 0;
         }
         if(cnt==0)
         {


           if(c=='a'){a=1;


                 { b1.setImageResource(R.drawable.toe);win();break;}

             }
             if(c=='d'){d=1;


                 { b2.setImageResource(R.drawable.toe);win();break;}

             }
             if(c=='f'){f=1;


                 { b3.setImageResource(R.drawable.toe);win();break;}

             }


             if(c=='h'){h=1;


                 { b4.setImageResource(R.drawable.toe);win();break;}

             }
             if(c=='j'){j=1;


                 { b5.setImageResource(R.drawable.toe);win();break;}

             }
             if(c=='l'){l=1;

                 { b6.setImageResource(R.drawable.toe);win();break;}

             }

             if(c=='r'){r=1;


                 { b7.setImageResource(R.drawable.toe);win();break;}

             }
             if(c=='n'){n=1;


                 { b8.setImageResource(R.drawable.toe);win();break;}

             }
             if(c=='p'){p=1;


                 { b9.setImageResource(R.drawable.toe);win();break;}

             }










            }
                }}}























        if (e == 1)//agar user choose middlw wala firat chaal
        {
            if (c == 2) {
                b4.setImageResource(R.drawable.toe);
                h = 1;

                c++;
                win();
            }
            if (c == 4) {//Random use
                if (k == 1) {
                    b8.setImageResource(R.drawable.toe);
                    n = 1;
                }

                if (q == 1) {
                    b3.setImageResource(R.drawable.toe);
                    f = 1;
                }
                if (b == 1) {
                    b7.setImageResource(R.drawable.toe);
                    r = 1;
                }
                if (m == 1) {
                    b9.setImageResource(R.drawable.toe);
                    p = 1;
                }
                if (o == 1) {
                    b5.setImageResource(R.drawable.toe);
                    j = 1;
                }
                if (g == 1) {
                    b9.setImageResource(R.drawable.toe);
                    p = 1;
                }
                if (s == 1) {
                    b1.setImageResource(R.drawable.toe);
                    a = 1;
                }
                c++;
                win();

            }


            if (c == 6) {
                if (k == 1)//4 chaal m k=i k corres
                {

                    if (q == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }//random can be used
                    if (b == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }

                    if (m == 1)//cases can be made259cross
                    {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }

                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (s == 1)//e1 k1 s=1
                    {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                }

                if (q == 1)//second case35 cross
                {
                    if (k == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (b == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (m == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (o == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (s == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                }//end of second case
                if (b == 1)//third case
                {
                    if (k == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (q == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (m == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (o == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }//end of third case
                if (m == 1) {
                    if (k == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (b == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (o == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (g == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (s == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                }//end of this loop
                if (o == 1) {
                    if (q == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (b == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (m == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (s == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                }
                if (g == 1) {
                    if (k == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (b == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (m == 1) {
                        b5.setImageResource(R.drawable.toe);
                        k = 1;
                    }
                    if (o == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (s == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                }//end of
                if (s == 1) {
                    if (k == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (q == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (m == 1)//cases can be generated
                    {
                        b5.setImageResource(R.drawable.toe);
                        k = 1;
                               /* Random rand = new Random();
                                int value = rand.nextInt(4);
                                if (value == 0) {
                                    b5.setImageResource(R.drawable.toe);
                                    j = 1;
                                }
                                if (value == 1) {
                                    b9.setImageResource(R.drawable.toe);
                                    p = 1;
                                }
                                if (value == 2) {
                                    b3.setImageResource(R.drawable.toe);
                                    f = 1;
                                }
                                if (value == 3) {
                                    b8.setImageResource(R.drawable.toe);
                                    n = 1;
                                }*/


                    }
                    if (o == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }
                c++;
                win();
            }      //end of 6 chance


            if (c == 8)//oewmwemgowepokgkow
            {


                if (k == 1 && q == 1) {
                    if (s == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                    if (b == 1) {
                        b6.setImageResource(R.drawable.toe);
                        l = 1;
                        win();
                    }
                    if (m == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                }

                if (k == 1 && b == 1) {
                    if (q == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;//lb6.setImageResource(R.drawable.white);////error
                    }
                    if (m == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }
                if (k == 1 && m == 1) {
                    if (s == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                    if (b == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                }
                if (k == 1 && g == 1) {
                    if (s == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                    if (b == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (m == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                }
                if (k == 1 && s == 1) {
                    if (q == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (m == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }
                //end of k combinations

                if (q == 1 && b == 1) {
                    win();//game over
                }
                if (q == 1 && m == 1) {
                               /* if (k == 1) {
                                    b8.setImageResource(R.drawable.toe);
                                    n = 1;
                                }
                                if (o == 1) {
                                    b5.setImageResource(R.drawable.toe);
                                    j = 1;
                                }
                                if (s == 1) {
                                    b8.setImageResource(R.drawable.toe);
                                    n = 1;
                                }*/
                    win();
                }
                if (q == 1 && o == 1) {
                    if (b == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (m == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                    if (s == 1) {
                        b1.setImageResource(R.drawable.toe);
                        a = 1;
                    }
                }
                if (q == 1 && s == 1) {
                    //if (k == 1) {
                    //   b8.setImageResource(R.drawable.toe);
                    // n = 1;
                    //}
                    if (o == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (m == 1) {
                        b5.setImageResource(R.drawable.toe);
                        p = 1;
                    }

                }
                //q ends here

                if (b == 1 && m == 1) {
                    if (q == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (o == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }


                if (b == 1 && o == 1) {
                    if (q == 1) ;
                    {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (m == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;

                    }
                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }

                }
                if (b == 1 && g == 1) {
                    if (k == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (m == 1 || o == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                }


                //end of b

                if (m == 1 && o == 1) {
                    win();
                }
                if (m == 1 && s == 1) {
                    win();
                }
                if (m == 1 && g == 1) {
                    win();
                }
                if (m == 1 && s == 1 && q == 1) {
                    b3.setImageResource(R.drawable.toe);
                    f = 1;
                }


                //end of m

                if (o == 1 && g == 1) {
                    win();
                }

                if (o == 1 && s == 1) {
                    if (q == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (b == 1) {
                        b7.setImageResource(R.drawable.toe);
                        r = 1;
                    }
                    if (m == 1) {
                        b3.setImageResource(R.drawable.toe);
                        f = 1;
                    }
                    if (g == 1) {
                        b9.setImageResource(R.drawable.toe);
                        p = 1;
                    }
                }//end of o

                if (g == 1 && s == 1) {
                    if (k == 1) {
                        b8.setImageResource(R.drawable.toe);
                        n = 1;
                    }
                    if (o == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }
                    if (m == 1) {
                        b5.setImageResource(R.drawable.toe);
                        j = 1;
                    }


                }

                      /*  if (s == 1) {
                            if (g == 1) {
                                b1.setImageResource(R.drawable.toe);
                                a = 1;
                            }
                            if(o==1){b9.setImageResource(R.drawable.toe);p=1;}}
                           /* if(m==1)
                            {
                            if(q==1){b3.setImageResource(R.drawable.toe);f=1;}
                                if(o==1){b9.setImageResource(R.drawable.toe);p=1;}
                                if(g==1){b9.setImageResource(R.drawable.toe);p=1;}}*/


                c++;
                win();
            }
        }}



    public void chal()

    {

        if(a==0&&b==0){ss+="a";st+=b;}

        if(d==0&&e==0){ss+="d";st+=e;}

        if(f==0&&g==0){ss+="f";st+=g;}

        if(h==0&&i==0){ss+="h";st+=i;}

        if(j==0&&k==0){ss+="j";st+=k;}

        if(l==0&&m==0){ss+="l";st+=m;}

        if(r==0&&s==0){ss+="r";st+=s;}

        if(n==0&&o==0){ss+="n";st+=o;}

        if(p==0&&q==0){ss+="p";st+=q;}
    }

public void find()
{for(int i=0;i<9;i++)
{if(arr[0]==1)a=1;
    if(arr[1]==1)d=1;
    if(arr[2]==1)f=1;
    if(arr[3]==1)h=1;
    if(arr[4]==1)j=1;
    if(arr[5]==1)l=1;
    if(arr[6]==1)r=1;
    if(arr[7]==1)n=1;
    if(arr[8]==1)p=1;

    if(arr[0]==0)a=0;
    if(arr[1]==0)d=0;
    if(arr[2]==0)f=0;
    if(arr[3]==0)h=0;
    if(arr[4]==0)j=0;
    if(arr[5]==0)l=0;
    if(arr[6]==0)r=0;
    if(arr[7]==0)n=0;
    if(arr[8]==0)p=0;







}
}






    public boolean cwin()
    {
        TextView tx = (TextView) findViewById(R.id.tx);

        if (h == 1 && j == 1 && p == 1)
        return true;
    else if (i == 1 && k == 1 && q == 1)
        return true;
    else if (r == 1 && d == 1 && a == 1)
        return true;
    else if (s == 1 && e == 1 && b == 1)
        return true;
    else if (f == 1 && n == 1 && l == 1)
        return true;
    else if (g == 1 && o == 1 && m == 1)
        return true;
    else if (h == 1 && r == 1 && f == 1)
        return true;
    else if (i == 1 && s == 1 && g == 1)
        return true;
    else if  (j == 1 && d == 1 && n == 1)
    {tx.setText("hello"); return true;}
    else if (k == 1 && e == 1 && o == 1)
        return true;
    else if (p == 1 && a == 1 && l == 1)
        return true;
    else if (q == 1 && b == 1 && m == 1)
        return true;
    else if (h == 1 && d == 1 && l == 1)
        return true;
    else if (i == 1 && e == 1 && m == 1)
        return true;
    else if (p == 1 && d == 1 && f == 1)
        return true;
    else if (q == 1 && e == 1 && g == 1)
        return true;
    else
        return false;
    }








    public void win() {
        if (z == 0) {
            TextView tx = (TextView) findViewById(R.id.tx);
            if (h == 1 && j == 1 && p == 1) {
                tx.setText("Computer win");
                b4.setBackgroundResource(R.drawable.red);
                b5.setBackgroundResource(R.drawable.red);z=1;
                b9.setBackgroundResource(R.drawable.red);
            } else if (i == 1 && k == 1 && q == 1) {
                tx.setText("You win");
                b4.setBackgroundResource(R.drawable.red);
                b5.setBackgroundResource(R.drawable.red);z++;
                b9.setBackgroundResource(R.drawable.red);

            } else if (r == 1 && d == 1 && a == 1) {
                tx.setText("Computer win");
                b7.setBackgroundResource(R.drawable.red);
                b2.setBackgroundResource(R.drawable.red);z++;
                b1.setBackgroundResource(R.drawable.red);

            } else if (s == 1 && e == 1 && b == 1) {
                tx.setText("You win");
                b7.setBackgroundResource(R.drawable.red);
                b2.setBackgroundResource(R.drawable.red);z++;
                b1.setBackgroundResource(R.drawable.red);

            } else if (f == 1 && n == 1 && l == 1) {
                tx.setText("Computer win");
                b3.setBackgroundResource(R.drawable.red);
                b6.setBackgroundResource(R.drawable.red);
                b8.setBackgroundResource(R.drawable.red);z++;

            } else if (g == 1 && o == 1 && m == 1) {
                tx.setText("You win");
                b3.setBackgroundResource(R.drawable.red);
                b6.setBackgroundResource(R.drawable.red);
                b8.setBackgroundResource(R.drawable.red);z++;
                onStop();
            } else if (h == 1 && r == 1 && f == 1) {
                tx.setText("Computer win");
                b4.setBackgroundResource(R.drawable.red);
                b7.setBackgroundResource(R.drawable.red);z++;
                b3.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (i == 1 && s == 1 && g == 1) {
                tx.setText("You win");
                b4.setBackgroundResource(R.drawable.red);
                b7.setBackgroundResource(R.drawable.red);
                b3.setBackgroundResource(R.drawable.red);z++;
                onStop();
            } else if (j == 1 && d == 1 && n == 1) {
                tx.setText("Computer win");
                b5.setBackgroundResource(R.drawable.red);
                b2.setBackgroundResource(R.drawable.red);z++;
                b8.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (k == 1 && e == 1 && o == 1) {
                tx.setText("You win");
                b5.setBackgroundResource(R.drawable.red);
                b8.setBackgroundResource(R.drawable.red);z++;
                b2.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (p == 1 && a == 1 && l == 1) {
                tx.setText("Computer win");
                b9.setBackgroundResource(R.drawable.red);
                b1.setBackgroundResource(R.drawable.red);z++;
                b6.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (q == 1 && b == 1 && m == 1) {
                tx.setText("You win");
                b9.setBackgroundResource(R.drawable.red);
                b1.setBackgroundResource(R.drawable.red);z++;
                b6.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (h == 1 && d == 1 && l == 1) {
                tx.setText("Computer win");
                b4.setBackgroundResource(R.drawable.red);
                b2.setBackgroundResource(R.drawable.red);z++;
                b6.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (i == 1 && e == 1 && m == 1) {
                tx.setText("You win");
                b4.setBackgroundResource(R.drawable.red);
                b2.setBackgroundResource(R.drawable.red);z++;
                b6.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (p == 1 && d == 1 && f == 1) {
                tx.setText("Computer win");
                b9.setBackgroundResource(R.drawable.red);
                b2.setBackgroundResource(R.drawable.red);z++;
                b3.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (q == 1 && e == 1 && g == 1) {
                tx.setText("You win");
                b9.setBackgroundResource(R.drawable.red);
                b2.setBackgroundResource(R.drawable.red);z++;
                b3.setBackgroundResource(R.drawable.red);
                onStop();
            } else if (c == 10)
                tx.setText("KHICHADHI    PAKI");
        }


    }

}


















