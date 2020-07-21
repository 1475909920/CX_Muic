package cn.controller;

import cn.biz.SongsheetBiz;
import cn.entity.Songsheet;
import cn.entity.TizzyT;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/songsheet")
public class SongsheetController {

    @Resource
    private SongsheetBiz songsheetBiz;

    @RequestMapping("/selectSongsheet")
    @ResponseBody
    protected List<Songsheet> selectSongsheet(Songsheet songsheet){
        List<Songsheet> songsheetList = songsheetBiz.selectSongsheet();
        return songsheetList;
    }
    @RequestMapping("/selectSongsheet2")
    protected String selectSongsheet2(Songsheet songsheet, Model model){
        List<Songsheet> songsheetList = songsheetBiz.selectSongsheet();
        model.addAttribute("songsheetList",songsheetList);
        return "SelectSongsheet";
    }

    @RequestMapping("/addSongsheet")
    protected String addSongsheet(Songsheet songsheet, Model model){
        int count = songsheetBiz.addSongsheet(songsheet);
        if(count>0){
            return "redirect:/songsheet/selectSongsheet2";
        }else{
            return "AddSongsheet";
        }
    }



    public SongsheetBiz getSongsheetBiz() {
        return songsheetBiz;
    }

    public void setSongsheetBiz(SongsheetBiz songsheetBiz) {
        this.songsheetBiz = songsheetBiz;
    }

}
