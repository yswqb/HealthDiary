package com.tz.healthdiary.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tz.healthdiary.BaseActivity;
import com.tz.healthdiary.BodyActivity;
import com.tz.healthdiary.R;
import com.tz.healthdiary.WaistlineActivity;

/**
 * Created by 西野七濑 on 2016/10/18.
 * Other页面的Fragment
 */
public class OtherFragment extends Fragment implements View.OnClickListener {
    TextView tv_waist_other;
    TextView tv_body_other;
    TextView tv_base_other;
    Intent intent;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.oter_layout,null);
        tv_waist_other= (TextView) view.findViewById(R.id.tv_waist_other);
        tv_body_other= (TextView) view.findViewById(R.id.tv_body_other);
        tv_base_other= (TextView) view.findViewById(R.id.tv_base_other);
        tv_waist_other.setOnClickListener(this);
        tv_body_other.setOnClickListener(this);
        tv_base_other.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_waist_other:
                intent=new Intent(getActivity(), WaistlineActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_body_other:
                intent=new Intent(getActivity(), BodyActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_base_other:
                intent=new Intent(getActivity(), BaseActivity.class);
                startActivity(intent);
                break;

        }


    }
}
