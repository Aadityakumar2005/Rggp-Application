package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    MainActivity mainActivity;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View view = inflater.inflate(R.layout.fragment_gallery,container,false);
        mainActivity = (MainActivity)getActivity();
        ImageButton ayush = view.findViewById(R.id.ayush);
        ayush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),MainActivity2.class);
                startActivity(i);
            }

        });

        ImageButton aadi = view.findViewById(R.id.aadi);
        aadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getActivity(),MainActivity3.class);
                startActivity(a);
            }
        });

        ImageButton aaditya = view.findViewById(R.id.aaditya);
        aaditya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aa = new Intent(getActivity(),MainActivity4.class);
                startActivity(aa);
            }
        });

        ImageButton p = view.findViewById(R.id.p);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getActivity(), Comp.class);
                startActivity(p);
            }
        });

        ImageButton r = view.findViewById(R.id.r);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(getActivity(), Civil.class);
                startActivity(r);
            }
        });

        ImageButton singla = view.findViewById(R.id.singla);
        singla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singla = new Intent(getActivity(), Electrical.class);
                startActivity(singla);
            }
        });

        ImageButton a = view.findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getActivity(), Mechanical.class);
                startActivity(a);
            }
        });


        ImageButton s1 = view.findViewById(R.id.s1);
        s1.setOnClickListener(view1 -> {
            Intent s11 = new Intent(getActivity(), Textile.class);
            startActivity(s11);
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}