package com.heima.article.controller.v1;

import com.heima.article.service.APArticleService;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.heima.common.constants.ArticleConstants.LOADTYPE_LOAD_MORE;
import static com.heima.common.constants.ArticleConstants.LOADTYPE_LOAD_NEW;

/**
 * @Author liming
 * @Date 2023/10/12 17:48
 * @Description
 **/
@RestController
@RequestMapping("/api/v1/article")
public class ArticleHomeController {
    @Autowired
    private APArticleService apArticleService;

    /***
     * 加载首页
     * @param dto
     * @return
     */
    @PostMapping("/load")
    public ResponseResult load(@RequestBody ArticleHomeDto dto){
        return apArticleService.load(dto,LOADTYPE_LOAD_MORE);
    }

    /***
     * 加载更多
     * @param dto
     * @return
     */
    @PostMapping("/loadmore")
    public ResponseResult loadmore(@RequestBody ArticleHomeDto dto){
        return apArticleService.load(dto,LOADTYPE_LOAD_MORE);
    }

    /***
     * 加载最新
     * @param dto
     * @return
     */
    @PostMapping("/loadnew")
    public ResponseResult loadnew(@RequestBody ArticleHomeDto dto){
        return apArticleService.load(dto,LOADTYPE_LOAD_NEW);
    }
}
