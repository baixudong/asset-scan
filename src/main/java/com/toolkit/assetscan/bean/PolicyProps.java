package com.toolkit.assetscan.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * PolicyProps 对应 policies 表
 * 各字段名称一致，各字段定义略，可参考 policies 表的各字段注释
 */
@Component
@Data
public class PolicyProps {
    private int id;
    private String uuid;
    private String name;
    private String code;
    private String group_uuid;
    private String type;
    private int risk_level;
    private String solutions;
    private String create_user_uuid;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.sql.Timestamp create_time;
    private int status;
}
