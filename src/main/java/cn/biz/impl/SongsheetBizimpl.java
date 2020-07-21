package cn.biz.impl;

import cn.biz.SongsheetBiz;
import cn.dao.SongsheetDao;
import cn.entity.Songsheet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("SongsheetBiz")
public class SongsheetBizimpl implements SongsheetBiz {

    @Resource
    private SongsheetDao songsheetDao;

    /**
     * 查询歌单的歌曲
     * @return
     */
    public List<Songsheet> selectSongsheet(){
        List<Songsheet> songsheetList = null;
        try {
            songsheetList = songsheetDao.selectSongsheet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return songsheetList;
    }

    /**
     * 增加歌单的歌曲
     * @param songsheet
     * @return
     */
    public int addSongsheet(Songsheet songsheet){
        int count = 0;
        try {
            count = songsheetDao.addSongsheet(songsheet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 删除歌单的歌曲
     * @param id
     * @return
     */
    public int delectSongsheet(Integer id){
        int count = 0;
        try {
            count = songsheetDao.delectSongsheet(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }


    public SongsheetDao getSongsheetDao() {
        return songsheetDao;
    }

    public void setSongsheetDao(SongsheetDao songsheetDao) {
        this.songsheetDao = songsheetDao;
    }

}
