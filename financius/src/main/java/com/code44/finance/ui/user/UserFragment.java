package com.code44.finance.ui.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.code44.finance.R;
import com.code44.finance.ui.BaseFragment;

public class UserFragment extends BaseFragment implements View.OnClickListener {
    private Button login_B;

    public static UserFragment newInstance() {
        return new UserFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Get views
        login_B = (Button) view.findViewById(R.id.login_B);

        // Setup
        login_B.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_B:
                LoginActivity.start(getActivity(), view);
                break;
        }
    }
}