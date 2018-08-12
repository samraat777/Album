package com.example.sam.album;

import com.google.firebase.database.Exclude;

public class upload {

    private String mName;
    private String mImageUrl;
    private static String mKey;

    public upload()
    {
   //Empty Constructor needed
    }
    public upload(String name,String imageUrl)
    {
        if(name.trim().equals(""))
        {
            name="no name";
            }
        mName=name;
        mImageUrl=imageUrl;
    }

    public String getName()
    {
        return mName;
    }

    public void setName(String name)
    {
        mName=name;
    }
    public String getImageUrl()
    {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl)
    {
        mImageUrl=imageUrl;
    }

    @Exclude
    public String getKey()
    {
        return mKey;
    }

    @Exclude
    public static void setKey(String key)
    {
        mKey=key;
    }

}
