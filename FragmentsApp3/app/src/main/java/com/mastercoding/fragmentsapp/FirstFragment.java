package com.mastercoding.fragmentsapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FirstFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(context,
                "OnAttach() is Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),
                "OnCreate() is Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(),
                "OnResume() is Called", Toast.LENGTH_SHORT).show();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        /*
        The Oncreate view method is often overridden to inflate the fragments layout or construct UI components
programmatically. When a fragment is first attached to an activity or needs to display its UI, Android calls the Oncreate
view method.If we look at the method signature, we can see there are three parameters one of type inflator.
The second is type view group and the third is of type bundle.The first one the inflator.
It's an instance of layout inflator that can use to inflate a layout from an XML resource.
The container is the parent view that the fragments UI should be attached to.This parameter is useful when you want to determine the layout parent, but you should not attach the
UI to this container explicitly.Instead, the inflate method should be used to handle this job saved instance.
State a bundle that provides information about the previous state of the fragment which can be useful
for restoring the fragment state.And since our fragment contains one text view and one button, I need to define them here on Create
View method.You can get rid of these methods later on I'll add the others, but I want from you to focus with me
here the Oncreate view.It's similar to Oncreate method.You define the UI elements here.
I'll start by view instance equal to inflator dot inflate AR dot layout dot fragment.First here I need to inflate.
I want to display the layout.The second parameter is the container and the last parameter is false.
We talked about layout inflator and how to inflate layouts in the previous applications and the previous
section.But as an overview, this line is a common pattern used in Android to inflate an XML layout resource
file into a view object.Let's break down each part of this line to understand what it does inflator.
This is an instance of the layout inflator class.It's a system service provided by Android that allows you to take an XML layout resource file and convert
it into a corresponding view object in memory Inflate method is a method provided by the layout inflator
class and it is used to create a view object from an XML layout resource or dot layout dot fragment.
First.This is a reference to the XML layout resource file you want to inflate.The container is the parameter representing the parent view group.
Usually a frame layout that will be a parent to the inflated layout.It specifies where the inflated layout will be attached in the hierarchy.
The fragments UI will be added to this container.False is the final parameter.Indicates whether the inflated layout should be attached to the container immediately.
When? Set it to false, it means that you will manually add the inflated layout to the container, typically
by returning it from the Oncreate view method.
         */

      View view = inflater.inflate(R.layout.fragment_first, container, false);

      Button firstBtn = view.findViewById(R.id.btn_frag1);
      TextView text = view.findViewById(R.id.text_frag1);

      firstBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(getActivity(),
                      "Welcome to the First Fragment",
                      Toast.LENGTH_SHORT).show();
          }
      });

      return view;
    }
}