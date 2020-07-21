package cn.dao;

import cn.entity.TizzyT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TizzyT歌曲数据访问层
 */
public interface TizzyTDao {
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
