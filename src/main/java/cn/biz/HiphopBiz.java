package cn.biz;

import cn.entity.Hiphop;

import java.util.List;

/**
 * 嘻哈歌曲业务逻辑层接口
 */
public interface HiphopBiz {
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
