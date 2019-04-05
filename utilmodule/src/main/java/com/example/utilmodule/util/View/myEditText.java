package com.example.utilmodule.util.View;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

/**
 * Created by Hossein on 05/04/2019.
 */

public class myEditText extends AppCompatEditText {
    public myEditText ( Context context, AttributeSet attrs ) {
        super ( context, attrs );
    }
    public String Text(){
        return this.getText ().toString ();
    }
}
