package com.example.jiayuanfa.androidlistviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JiaYuanFa on 2017/12/5.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        this.resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//        创建View 拿到数据 并赋值
        Fruit fruit = getItem(position);

        View view;

        ViewHolder viewHolder;

//        对View进行缓存以提升运行效率
        if (convertView == null) {

            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.imageView);
            viewHolder.textView = view.findViewById(R.id.textView);

//            将ViewHolder存储在View中
            view.setTag(viewHolder);

        }else {

            view = convertView;

//            重新获取ViewHolder
            viewHolder = (ViewHolder) view.getTag();
        }

//        直接使用缓存的ViewHolder进行赋值即可
        viewHolder.imageView.setImageResource(fruit.getImageId());
        viewHolder.textView.setText(fruit.getName());
        return view;
    }


    /**
     * 之所以创建一个ViewHolder是因为上面使用了FindViewById取得View 影响了性能
     */
    class ViewHolder {

        ImageView imageView;

        TextView textView;
    }
}
