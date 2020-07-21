package cn.biz;

import cn.entity.TizzyT;

import java.util.List;

/**
 * TizzyT歌曲业务逻辑层
 */
public interface TizzyTBiz {
    /**
     * 查询tTizzyT的歌曲
     * @return
     */
    public List<TizzyT> selectTizzyT();

    /**
     * 增加TizzyT的歌曲
     * @param tizzy
     * @return
     */
    public int addTizzyY(TizzyT tizzy);

    /**
     * 删除TizzyT的歌曲
     * @param id
     * @return
     */
    public int delectTizzyT(Integer id);
}
