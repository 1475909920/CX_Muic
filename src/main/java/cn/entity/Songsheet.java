package cn.entity;

/**
 * 歌单实体类
 */
public class Songsheet {
    /**
     * 歌单编号
     */
    private int id;
    /**
     * 歌单名称
     */
    private String songSheetName;
    /**
     * 播放次数
     */
    private String play;
    /**
     * 图片地址
     */
    private String image;
    /**
     * 点击事件
     */
    private String bindtap;

    public String getBindtap() {
        return bindtap;
    }

    public void setBindtap(String bindtap) {
        this.bindtap = bindtap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongSheetName() {
        return songSheetName;
    }

    public void setSongSheetName(String songSheetName) {
        this.songSheetName = songSheetName;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
