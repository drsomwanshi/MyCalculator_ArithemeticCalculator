package com.example.mycalcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num="";
    var n1=0
    var n2=0;
    var ans=0;
    var op=""
    var txt1:TextView?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt1=findViewById(R.id.txt1) as TextView
    }

    fun numfun(view: View) {
        view as Button
        num=num+view.text.toString();
        txt1?.setText(num);

    }
    fun opfun(view: View) {
        view as Button
        op=view.text.toString();
        //n1=num.toInt();
        n1=txt1?.text.toString().toInt()
        num=""
    }
    fun eqfun(view: View) {
       // n2=num.toInt();
        n2=txt1?.text.toString().toInt()
        if(op=="+")
        {
            ans=n1+n2;
        }
        if(op=="-")
        {
            ans=n1-n2;
        }
        if(op=="*")
        {
            ans=n1*n2;
        }
        if(op=="/")
        {
            ans=n1/n2;
        }
        txt1?.setText("" + ans)

    }

    fun Clear(view: View) {
        num="";
         n1=0
         n2=0;
         ans=0;
         op=""
        txt1?.setText("")

    }
    fun Back(view: View) {
        if(txt1?.text.toString().length>0) {
            num = txt1?.text.toString().substring(0, txt1?.text.toString().length - 1)
            txt1?.setText("" + num)
        }
    }
}