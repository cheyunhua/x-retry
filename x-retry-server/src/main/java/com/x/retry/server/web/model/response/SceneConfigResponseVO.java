package com.x.retry.server.web.model.response;

import com.x.retry.server.web.model.base.BaseQueryVO;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: www.byteblogs.com
 * @date : 2022-03-03 10:56
 */
@Data
public class SceneConfigResponseVO {

    private Long id;

    private String groupName;

    private String sceneName;

    private Integer sceneStatus;

    private Integer maxRetryCount;

    private Integer backOff;

    private String triggerInterval;

    private String description;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;

}
