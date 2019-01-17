package org.wlgzs.parttime.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Accept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应聘id
     */
    @TableId(value = "accept_id", type = IdType.AUTO)
    private Integer acceptId;

    /**
     * 招聘(工作)id
     */
    private Integer recruitId;

    /**
     * 应聘者id
     */
    private Integer accepterId;

    /**
     * 应聘者
     */
    private String accepterName;

    /**
     * 招聘者id
     */
    private Integer recruiterId;

    /**
     * 招聘者姓名
     */
    private String recruiterName;

    /**
     * 评价(招聘者)
     */
    private String recruitAppraise;

    /**
     * 评价(应聘者)
     */
    private String accepterAppraise;

    /**
     * 状态（是否被接取，完成与否）(1表示未完成，2表示已完成)
     */
    private String state;


}
