package cn.dao;

import cn.entity.Hiphop;

import java.util.List;

/**
 * 嘻哈歌曲数据访问层
 */
public interface HiphopDao {
    /**
     * 查询嘻哈的歌曲
     * @return
     */
    public List<Hiphop> selectHiphop();

    /**
     * 增加嘻哈的歌曲
     * @param hiphop
     * @return
     */
    public int addHiphop(Hiphop hiphop);

    /**
     * 删除嘻哈的歌曲
     * @param id
     * @return
     */
    public int delectHiphop(Integer id);
}
