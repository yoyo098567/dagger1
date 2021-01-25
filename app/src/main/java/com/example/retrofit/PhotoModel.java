package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class PhotoModel {

    @SerializedName("albumId")
    private Integer albumId;
    @SerializedName("id")
    private  Integer id;
    @SerializedName("title")
    private  String tvtitle;
    @SerializedName("url")
    private String url;
    @SerializedName("thumbnailUrl")
    private String thumbnailUrl;

    public PhotoModel(Integer albumId,Integer id, String tvtitle, String url, String thumbnailUrl){
        this.albumId=albumId;
        this.id=id;
        this.tvtitle=tvtitle;
        this.url=url;
        this.thumbnailUrl=thumbnailUrl;
    }

    public Integer getAlbumId(){return albumId;}
    public void setAlbumId(Integer albumId){this.albumId=albumId;}

    public Integer getId(){return  id; }
    public void setId(Integer id){this.id=id;}

    public String getTvtitle(){return tvtitle;}
    public void  setTvTitle(String tvtitle){this.tvtitle=tvtitle;}

    public  String getUrl(){return url;}
    public void setUrl(String url){this.url=url;}

    public String getthumbnailUrl(){return thumbnailUrl;}
    public void setthumbnailUrl(String thumbnailUrl){this.thumbnailUrl=thumbnailUrl;}



}
