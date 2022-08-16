package com.example.rps;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.ContentView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class CreateRoom extends AppCompatDialogFragment {
    private Object ContentView;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Work in progress...")
                        .setMessage("CreateRoom will soon allow players using different devices" +
                                " to play against eachother with simply one click!" +
                                "                                                " +
                                "                                                " +
                                "Coming soon...!")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
        return builder.create();
    }

}
