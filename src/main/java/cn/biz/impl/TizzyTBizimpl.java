package cn.biz.impl;

import cn.biz.TizzyTBiz;
import cn.dao.TizzyTDao;
import cn.entity.TizzyT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("TizzyTBiz")
public class TizzyTBizimpl implements TizzyTBiz {

    @Resource
    private TizzyTDao tizzyTDao;

    /**
     * 查询tTizzyT的歌曲
     * @return
     */
    public List<TizzyT> selectTizzyT(){
        List<TizzyT> tizzytList = null;
        try {
            tizzytList = tizzyTDao.selectTizzyT();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tizzytList;
    }

    /**
     * 增加TizzyT的歌曲
     * @param tizzy
     * @return
     */
    public int addTizzyY(TizzyT tizzy){
        int count = 0;
        try {
            count = tizzyTDao.addTizzyY(tizzy);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 删除TizzyT的歌曲
     * @param id
     * @return
     */
    public int delectTizzyT(Integer id){
        int count = 0;
        try {
            count = tizzyTDao.delectTizzyT(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }



    public TizzyTDao getTizzyTDao() {
        return tizzyTDao;
    }

    public void setTizzyTDao(TizzyTDao tizzyTDao) {
        this.tizzyTDao = tizzyTDao;
    }

}
