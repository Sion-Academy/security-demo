package org.example.common.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BaseEntity {

    @TableField(value = "create_by")
    private String createBy;

    @TableField(value = "update_by")
    private String updateBy;

    @TableField(value = "create_time")
    private LocalDate createTime;

    @TableField(value = "update_time")
    private LocalDate updateTime;
}
