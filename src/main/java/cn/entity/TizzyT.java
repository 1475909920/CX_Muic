package cn.entity;

/**
 * Tizzy T歌曲实体类
 */
public class TizzyT {
    /**
     * 歌曲编号
     */
    private int id;
    /**
     *歌曲名称
     */
    private String songname;
    /**
     *歌手
     */
    private String singer;
    /**
     *图片
     */
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
