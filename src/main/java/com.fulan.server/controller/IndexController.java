package com.fulan.server.controller;

import com.fulan.server.enums.ResultEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen
 * 2020/3/13.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String Index(){
        return "car";
    }

    @RequestMapping("/insure")
    public String insure(){
        return "insure";
    }


    @RequestMapping("/search")
    public String search(){
        return "insureInfo";
    }


    @RequestMapping("/list")
    public String index(HttpSession session){
        ResultEnum.JOBNUMER_OR_IDCARD_NULL.getMessage();
        List<Classes> list = new ArrayList<>();
        Classes classes = new Classes();
        classes.setCid("1");
        classes.setCname("高一1班");
        list.add(classes);
        classes.setCid("2");
        classes.setCname("高一2班");
        list.add(classes);
        classes.setCid("3");
        classes.setCname("高一3班");
        list.add(classes);
        session.setAttribute("list",list);
        return "index";
    }

    public static class Classes implements Serializable {
        private String cid;
        private String cname;

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }
    }


}
