package com.example.jiayuanfa.androidlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    水果数据
    private String[] data = {"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango",
            "Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        初始化水果数据
        initFruits();

//        初始化水果Adapter 传入主控制器 Layout_item 数据源
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);

//        获取ListView
        ListView listView = findViewById(R.id.list_view);

//        设置Adapter
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = fruitList.get(i);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {

//        For循环添加两遍数据
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.mipmap.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("banana", R.mipmap.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("orange", R.mipmap.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("watermelon", R.mipmap.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("pear", R.mipmap.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("grape", R.mipmap.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("pineapple", R.mipmap.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("strawberry", R.mipmap.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("cherry", R.mipmap.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("mango", R.mipmap.mango_pic);
            fruitList.add(mango);
        }
    }
}
