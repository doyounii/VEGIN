package com.example.vegan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TypeActivity extends Fragment {
    TextView textView, textView3, textView4, frag1_tv;
    RadioButton radio_0,radio_1,radio_2,radio_3,radio_4,radio_5,radio_6;
    Button result_bt;
    String result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.activity_type, container, false);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);


        RadioGroup rg = (RadioGroup)v.findViewById(R.id.typegroup);
        final TextView textView4 = (TextView)v.findViewById(R.id.textView4);
        radio_0 = (RadioButton)v.findViewById(R.id.radio1);
        radio_1 = (RadioButton)v.findViewById(R.id.radio2);
        radio_2 = (RadioButton)v.findViewById(R.id.radio3);
        radio_3 = (RadioButton)v.findViewById(R.id.radio4);
        radio_4 = (RadioButton)v.findViewById(R.id.radio5);
        radio_5 = (RadioButton)v.findViewById(R.id.radio6);
        radio_6 = (RadioButton)v.findViewById(R.id.radio7);
        result_bt = (Button)v.findViewById(R.id.result);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radio1){
                    result = "플렉시테리언";
                }
                else if (checkedId == R.id.radio2){
                    result ="플로 베지테리언";
                }
                else if (checkedId == R.id.radio3){
                    result ="페스코 베지테리언";
                }
                else if (checkedId == R.id.radio4){
                    result ="락토 오보 베지테리언";
                }
                else if (checkedId == R.id.radio5){
                    result ="오보 베지테리언";
                }
                else if (checkedId == R.id.radio6) {
                    result ="락토 베지테리언";
                }
                else
                {
                    result ="비건";
                }
            }
        });

        result_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result_bt != null){
                    textView4.setText(result);
                } else {
                    textView4.setText("유형을 선택하세요");

                }
            }
        });

        String userType = result;

        return v;
    }

    private void setContentView(int activity_type) {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}