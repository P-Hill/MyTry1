package org.psms.mytry1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class SpeciesFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public SpeciesFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SpeciesFragment newInstance(int sectionNumber) {
        SpeciesFragment fragment = new SpeciesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_species, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.species_label);
        textView.setText(getString(R.string.species_label_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}
