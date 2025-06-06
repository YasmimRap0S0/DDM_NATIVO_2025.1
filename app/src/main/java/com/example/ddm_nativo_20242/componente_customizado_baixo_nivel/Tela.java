package com.example.ddm_nativo_20242.componente_customizado_baixo_nivel;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import com.example.ddm_nativo_20242.R;

public class Tela extends View implements Runnable{
    private float x = 500;
    private float y = 500;
    private final float xB = 100;
    private float yB = 100;
    private final float TAMANHO = 50;
    private final float x0 = TAMANHO;
    private final float y0 = TAMANHO;

    public Tela(Context c){
        super(c);
    }
    public void onDraw(Canvas c){
        super.onDraw(c);
        Paint p = new Paint();
        p.setColor(getContext().getColor(R.color.black));
        c.drawRect(x,y,x+TAMANHO,y+TAMANHO,p);

        p.setColor(Color.GREEN);
        c.drawCircle(xB, yB, TAMANHO, p);
    }

    //passo 2
    public boolean onTouchEvent(MotionEvent e){
        x = e.getX();
        y = e.getY();
        invalidate();
        return true;
    }

    //passo 3
    public void run(){
        while(true){
            yB+=10;
            invalidate();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}