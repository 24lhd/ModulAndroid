package duong;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;

/**
 * Created by D on 15/01/2017.
 */

public class DiaLogThongBao {
    public void showDiaLogThongBao(Context context,String title,String msg
            ,String nameBtnYes,String nameBtnNo,int colorBtn,View.OnClickListener yesListener){
        AlertDialog.Builder turnOnLoactionDialog=new AlertDialog.Builder(context);
        turnOnLoactionDialog.setTitle(title);
        turnOnLoactionDialog.setMessage(msg);
        turnOnLoactionDialog.setPositiveButton(nameBtnYes,null);
        AlertDialog alertDialog=turnOnLoactionDialog.create();
        Button yes=alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        yes.setTextColor(colorBtn);
        yes.setOnClickListener(yesListener);
        alertDialog.show();
    }
    public void showDiaLogLuaChon(Context context,String title,String msg
            ,String nameBtnYes,String nameBtnNo,int colorBtn,View.OnClickListener yesListener
            ,View.OnClickListener noListener){
        AlertDialog.Builder turnOnLoactionDialog=new AlertDialog.Builder(context);
        turnOnLoactionDialog.setTitle(title);
        turnOnLoactionDialog.setMessage(msg);
        turnOnLoactionDialog.setPositiveButton(nameBtnYes,null);
        turnOnLoactionDialog.setNeutralButton(nameBtnNo,null);
        AlertDialog alertDialog=turnOnLoactionDialog.create();
        Button yes=alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        Button no=alertDialog.getButton(DialogInterface.BUTTON_NEUTRAL);
        yes.setTextColor(colorBtn);
        no.setTextColor(colorBtn);
        yes.setOnClickListener(yesListener);
        no.setOnClickListener(noListener);
        alertDialog.show();
    }
    public void showDiaLogView(Context context,View view,String title,String msg
            ,String nameBtnYes,String nameBtnNo,int colorBtn,View.OnClickListener yesListener
            ,View.OnClickListener noListener){
        AlertDialog.Builder turnOnLoactionDialog=new AlertDialog.Builder(context);
        turnOnLoactionDialog.setTitle(title);
        turnOnLoactionDialog.setMessage(msg);
        turnOnLoactionDialog.setPositiveButton(nameBtnYes,null);
        turnOnLoactionDialog.setNeutralButton(nameBtnNo,null);
        turnOnLoactionDialog.setView(view);
        AlertDialog alertDialog=turnOnLoactionDialog.create();
        Button yes=alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        Button no=alertDialog.getButton(DialogInterface.BUTTON_NEUTRAL);
        yes.setTextColor(colorBtn);
        no.setTextColor(colorBtn);
        yes.setOnClickListener(yesListener);
        no.setOnClickListener(noListener);
        alertDialog.show();
    }
    public void showDiaLogView(Context context,View view,String title,String msg
            ,String nameBtnYes,String nameBtnNo,int colorBtn,View.OnClickListener yesListener){
        AlertDialog.Builder turnOnLoactionDialog=new AlertDialog.Builder(context);
        turnOnLoactionDialog.setTitle(title);
        turnOnLoactionDialog.setMessage(msg);
        turnOnLoactionDialog.setPositiveButton(nameBtnYes,null);
        turnOnLoactionDialog.setNeutralButton(nameBtnNo,null);
        AlertDialog alertDialog=turnOnLoactionDialog.create();

        Button yes=alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        yes.setTextColor(colorBtn);
        yes.setOnClickListener(yesListener);
        alertDialog.setView(view);
        alertDialog.show();
    }
    public AlertDialog showDiaLogCustemView(Context context,View view ,
                                            String nameBtnYes,String nameBtnNo,
                                            int colorBtn,View.OnClickListener yesListener,
                                            View.OnClickListener noListener){
        AlertDialog.Builder turnOnLoactionDialog=new AlertDialog.Builder(context);
        turnOnLoactionDialog.setPositiveButton(nameBtnYes,null);
        turnOnLoactionDialog.setNeutralButton(nameBtnNo,null);
        AlertDialog alertDialog=turnOnLoactionDialog.create();

        Button yes=alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        yes.setTextColor(colorBtn);
        yes.setOnClickListener(yesListener);

        Button no=alertDialog.getButton(DialogInterface.BUTTON_NEUTRAL);
        yes.setTextColor(colorBtn);
        no.setOnClickListener(noListener);

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        alertDialog.setView(view);
        return alertDialog;
    }

    public AlertDialog showDiaLogCustemView(Context context,
                                            View view ,
                                            String nameBtnYes,
                                            String nameBtnNo,
                                            int colorBtn,
                                            View.OnClickListener yesListener){
        AlertDialog.Builder turnOnLoactionDialog=new AlertDialog.Builder(context);
        turnOnLoactionDialog.setPositiveButton(nameBtnYes,null);
        turnOnLoactionDialog.setNeutralButton(nameBtnNo,null);
        AlertDialog alertDialog=turnOnLoactionDialog.create();

        Button yes=alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        yes.setTextColor(colorBtn);
        yes.setOnClickListener(yesListener);

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        alertDialog.setView(view);
        return alertDialog;
    }

    public AlertDialog showDiaLogCustemView(Context context,View view){
        AlertDialog.Builder turnOnLoactionDialog=new AlertDialog.Builder(context);
        AlertDialog alertDialog=turnOnLoactionDialog.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        alertDialog.setView(view);
        return alertDialog;
    }
}
