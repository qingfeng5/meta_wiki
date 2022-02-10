package com.wiki_cloud.meta_wiki.dto.req;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
public class DocDeleteReqDto {

    @NotNull(message = "ids 字段不能为 null")
    private List<Long> ids;  // 所有需要被删除的文档id
}
