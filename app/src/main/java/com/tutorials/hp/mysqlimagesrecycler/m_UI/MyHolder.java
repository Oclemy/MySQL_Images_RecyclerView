package com.tutorials.hp.mysqlimagesrecycler.m_UI;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.mysqlimagesrecycler.R;

/**
 * Created by Oclemy on 6/5/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyHolder extends RecyclerView.ViewHolder {

    TextView nametxt;
    ImageView img;

    public MyHolder(View itemView) {
        super(itemView);

        nametxt= (TextView) itemView.findViewById(R.id.nameTxt);
        img= (ImageView) itemView.findViewById(R.id.movieImage);
    }
}
