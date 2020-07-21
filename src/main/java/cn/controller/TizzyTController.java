package cn.controller;

import cn.biz.TizzyTBiz;
import cn.entity.TizzyT;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/tizzyt")
public class TizzyTController {

    @Resource
    private TizzyTBiz tizzyTBiz;

    @RequestMapping("/selectTizzyT")
    @ResponseBody
    protected List<TizzyT> selectTizzyT(TizzyT tizzyT, Model model){
        List<TizzyT> tizzyTList = tizzyTBiz.selectTizzyT();
//		model.addAttribute("tizzyTList", tizzyTList);
        return tizzyTList;
    }
    @RequestMapping("/selectTizzyT2")
    protected String selectTizzyT2(TizzyT tizzyT, Model model){
        List<TizzyT> tizzyTList = tizzyTBiz.selectTizzyT();
		model.addAttribute("tizzyTList", tizzyTList);
        return "SelectTizzyT";
    }
    @RequestMapping("/addTizzyY")
    protected String addTizzyY(TizzyT tizzyT, Model model){
        int count = tizzyTBiz.addTizzyY(tizzyT);
        if(count>0){
            return "redirect:/tizzyt/selectTizzyT2";
        }else{
            return "AddTizzyT";
        }
    }



    public TizzyTBiz getTizzyTBiz() {
        return tizzyTBiz;
    }

    public void setTizzyTBiz(TizzyTBiz tizzyTBiz) {
        this.tizzyTBiz = tizzyTBiz;
    }

}

