package com.hellfactory101.btnlikefb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ButtonLikeFacebook extends ViewGroup {

    private boolean isChecked = false;

    public ButtonLikeFacebook(Context context) {
        super(context, null);
    }

    public ButtonLikeFacebook(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public ButtonLikeFacebook(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
    }

    public ButtonLikeFacebook(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        inflateViewGroup();
        initFromAttributes(context, attrs, defStyleAttr, defStyleRes);
    }

    private void inflateViewGroup() {
        inflate(getContext(),R.layout.btn_like_fb,this);
    }

    private void initFromAttributes(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes){
        View bound = (View)findViewById(R.id.bound);
        bound.setOnClickListener(v -> {
            isChecked = !isChecked;
        });
    }

    private void terminateAnimation(){

    }

    private void startAnimation(){

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
