package peak.chao.apiopen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peak.chao.apiopen.dao.BuDeJieMapper;
import peak.chao.apiopen.domain.BuDeJieContent;

import java.util.List;

/**
 * Created by Chao on 2018-09-02.
 */
@RestController
public class BuDeJieController {

    @Autowired
    BuDeJieMapper buDeJieMapper;

    @RequestMapping(value = "budejie")
    public List<BuDeJieContent> getBuDeJieContent() {
        List<BuDeJieContent> buDeJieContent = buDeJieMapper.selectBuDeJieContent(0, 20);
        return buDeJieContent;
    }

}
