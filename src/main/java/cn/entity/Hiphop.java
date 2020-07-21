package cn.entity;

/**
 * 嘻哈歌曲排行实体类
 */
public class Hiphop {
    /**
     * 歌曲id
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
     *热度
     */
    private String degree;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
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

}
