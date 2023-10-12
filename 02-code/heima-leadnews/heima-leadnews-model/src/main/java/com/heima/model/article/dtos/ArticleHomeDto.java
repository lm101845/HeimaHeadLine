package com.heima.model.article.dtos;

/**
 * @Author liming
 * @Date 2023/10/12 17:50
 * @Description
 **/
import lombok.Data;

import java.util.Date;

@Data
public class ArticleHomeDto {

    // 最大时间
    Date maxBehotTime;
    // 最小时间
    Date minBehotTime;
    // 分页size
    Integer size;
    // 频道ID
    String tag;
}
