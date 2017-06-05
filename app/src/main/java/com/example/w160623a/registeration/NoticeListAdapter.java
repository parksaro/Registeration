package com.example.w160623a.registeration;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by w160623a on 2017-05-22.
 */



public class NoticeListAdapter extends BaseAdapter {

    private Context context;
    private List<Notice>  noticeList;



    @Override
    public int getCount() {
        return noticeList.size();
    }

    @Override
    public Object getItem(int position) {
        return noticeList.get(i);
    }

    @Override
    public long getItemId(int position) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return v = View.inflate(context.R.layout.notice. null);
        TextView noticeText= (TextView) v.findViewById(R.id.noticeText);
        TextView nameText= (TextView) v.findViewById(R.id.nameText);
        TextView dateText= (TextView) v.findViewById(R.id.dateText);

        noticeText.setText(noticeList.get(i).getNotice());
        nameText.setText(noticeList.get(i).getName());
        dateText.setText(noticeList.get(i).getDate());

        v.setTag(noticeList.get(i).getNotice());
        return v;

    }

    public NoticeListAdapter(Context context, List<Notice> noticeList) {
        this.context = context;
        this.noticeList = noticeList;
    }
}
