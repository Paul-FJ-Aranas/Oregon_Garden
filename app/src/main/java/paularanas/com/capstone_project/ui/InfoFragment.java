package paularanas.com.capstone_project.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import paularanas.com.capstone_project.R;

/**
 * Created by Paul on 6/18/2016.
 */
public class InfoFragment extends android.support.v4.app.Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        Typeface corbelFont = Typeface.createFromAsset(getContext().getAssets(), "fonts/Corbel.ttf");
        Typeface candaraFont = Typeface.createFromAsset(getContext().getAssets(), "fonts/Candara.ttf");

        ImageView aboutGardenImage = (ImageView) view.findViewById(R.id.about_garden_image);
        aboutGardenImage.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.about_image));

        TextView aboutText = (TextView) view.findViewById(R.id.garden_about_text);
        aboutText.setText(getActivity().getResources().getString(R.string.about_body_text));

        aboutText.setTypeface(corbelFont);

        TextView _365DaysTextView = (TextView) view.findViewById(R.id._365days_text);

        _365DaysTextView.setText(getActivity().getResources().getString(R.string.about_365days_text));

        _365DaysTextView.setTypeface(candaraFont);

        FloatingActionButton infoFab = (FloatingActionButton) view.findViewById(R.id.info_fab);
        infoFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.app.FragmentManager manager = getActivity().getFragmentManager();
                ContactAdmissionDialogFragment dialogFragment = new ContactAdmissionDialogFragment();
                dialogFragment.show(manager, "contactAdmissionDialog");
            }
        });

        return view;

    }
}


