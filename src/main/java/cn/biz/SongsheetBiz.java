package cn.biz;

import cn.entity.Songsheet;

import java.util.List;

/**
 * 歌单业务逻辑层接口
 */
public interface SongsheetBiz {
    /**
     * 查询歌单的歌曲
     * @return
     */
    public List<Songsheet> selectSongsheet();

    /**
     * 增加歌单的歌曲
     * @param songsheet
     * @return
     */
    public int addSongsheet(Songsheet songsheet);

    /**
     * 删除歌单的歌曲
     * @param id
     * @return
     */
    public int delectSongsheet(Integer id);
}
