package com.rahulverlekar.nativelist.adapter;


import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.joanzapata.iconify.IconDrawable;
import com.rahulverlekar.nativelist.IconMoon.IconMoonIcons;
import com.rahulverlekar.nativelist.Model.Broadcast;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class BroadcastAdapter extends RecyclerView.Adapter<BroadcastAdapter.BillViewHolder> {

    List<Broadcast> bills;
    Context context;
    private BroadcastiewHolderListener mcallback;

    public enum BillHolderType {CashCounter, Delivery}

    public interface BroadcastiewHolderListener {
        void onChildClicked(Broadcast broadcast);

        void onFavoriteClicked(Broadcast broadcast);
    }

    public BroadcastAdapter(Context context, List<Broadcast> bills, BroadcastiewHolderListener listener) {
        this.context = context;
        this.bills = bills;
        this.mcallback = listener;
    }

    public void setListener(BroadcastiewHolderListener listener) {
        this.mcallback = listener;
    }

    @Override
    public BillViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        BillViewHolder holder = null;
        com.rahulverlekar.animations.FakeR fakeR = new com.rahulverlekar.animations.FakeR((Activity)context);
        v = LayoutInflater.from((Activity)context).inflate(fakeR.getId("layout", "list_tile_broadcast"),null,false);
        //v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tile_broadcast, parent, false);
        holder = new BillViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(BillViewHolder holder, int position) {
        final Broadcast broadcast = bills.get(position);
        /*populate the current details here*/
        Picasso.with(context)
                .load(broadcast.getProfilePhotoThumb())
                .into(holder.ivAvatar);
        holder.txtBroadcastDescription.setText(broadcast.getProfileDescription());
        holder.txtBroadcastName.setText(broadcast.getUsername());
        holder.txtInfluencerScore.setText(broadcast.getPoiInfluencerScore());
        holder.txtBroadcastLikes.setText(broadcast.getLikesCount());
        holder.txtBroadcastTag.setText(broadcast.getHashTag1() + broadcast.getHashTag1());
        holder.parentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mcallback != null)
                {
                    mcallback.onChildClicked(broadcast);
                }
            }
        });
        holder.ivFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mcallback != null)
                {
                    mcallback.onFavoriteClicked(broadcast);
                }
            }
        });
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        //Todo: need to find out what this can be used for(Performance improvement)
    }

    @Override
    public int getItemCount() {
        return bills.size();
    }

    static class BillViewHolder extends RecyclerView.ViewHolder {

        ImageView ivCheckBox;
        CircleImageView ivAvatar;
        RelativeLayout rlAvatar;
        TextView txtBroadcastName;
        TextView txtBroadcastTag;
        TextView txtBroadcastDescription;
        TextView txtInfluencerScoreIcon;
        TextView txtInfluencerScore;
        TextView txtBroadcastLikesIcon;
        TextView txtBroadcastLikes;
        LinearLayout llBroadcastData;
        TextView ivFavorite;
        View parentView;

        BillViewHolder(View view) {
            super(view);
            parentView = view;
            initAllViews();
            Typeface type = Typeface.createFromAsset(txtBroadcastLikesIcon.getContext().getAssets(), "icomoon.ttf");
            txtBroadcastLikesIcon.setTypeface(type);
            txtBroadcastLikesIcon.setText("\ue903");
            txtInfluencerScoreIcon.setTypeface(type);
            txtInfluencerScoreIcon.setText("\ue905");
            ivFavorite.setTypeface(type);
            ivFavorite.setText("\ue905");
        }

        public void initAllViews()
        {
            ivCheckBox = (ImageView) findViewByTag("iv_check_box");
            ivAvatar = (CircleImageView) findViewByTag("iv_avatar");
            rlAvatar = (RelativeLayout) findViewByTag("rl_avatar");
            txtBroadcastName = (TextView) findViewByTag("txt_broadcast_name");
            txtBroadcastTag = (TextView) findViewByTag("txt_broadcast_tag");
            txtBroadcastDescription = (TextView) findViewByTag("txt_broadcast_description");
            txtInfluencerScoreIcon = (TextView) findViewByTag("txt_influencer_score_icon");
            txtInfluencerScore = (TextView) findViewByTag("txt_influencer_score");
            txtBroadcastLikesIcon = (TextView) findViewByTag("txt_broadcast_likes_icon");
            txtBroadcastLikes = (TextView) findViewByTag("txt_broadcast_likes");
            llBroadcastData = (LinearLayout) findViewByTag("ll_broadcast_data");
            ivFavorite = (TextView) findViewByTag("iv_favorite");
        }

        public View findViewByTag(String tag)
        {
            return parentView.findViewWithTag(tag);
        }
    }

    public void addMoreItems(List<Broadcast> newBroadcasts) {
        bills.addAll(newBroadcasts);
    }

}