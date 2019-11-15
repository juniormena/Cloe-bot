package com.example.junio.itlasiano;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class creadoresFragment extends Fragment {
    /*ImageView fbJunior;
    ImageView igJunior;
    ImageView fbBryant;
    ImageView igBryant;
    String direccion;*/

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_creadores, container, false);

      /*  fbJunior = (ImageView) container.findViewById(R.id.imageView3);
        igJunior = (ImageView) container.findViewById(R.id.imageView4);
        fbBryant = (ImageView)container.findViewById(R.id.imageView5);
        igBryant = (ImageView)container.findViewById(R.id.imageView6);
        direccion="";


        fbJunior.setOnClickListener(this);
        igJunior.setOnClickListener(this);
        fbBryant.setOnClickListener(this);
        igBryant.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case  R.id.imageView3:
                direccion="https://www.facebook.com/Junior28Mena";
                irweb(direccion);
                break;
            case  R.id.imageView4:
                direccion="https://www.instagram.com/juniormena_/?hl=es-la";
                irweb(direccion);
                break;
            case  R.id.imageView5:
                direccion="https://www.facebook.com/bryants.rijo";
                irweb(direccion);
                break;
            case  R.id.imageView6:
                direccion="https://www.instagram.com/_bryantr_/?hl=es-la";
                irweb(direccion);
                break;
        }

    }
    public void irweb (String d){
        Uri uri = Uri.parse(d);
        Intent intentNav =new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intentNav);

    }
*/
    }
}
