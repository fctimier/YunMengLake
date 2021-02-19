package com.yun.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * TODO 评论
 *
 * @date 2021/2/19
 */
@Entity
@Table
@DynamicInsert
@Data
public class SComment implements Serializable {

    private static final long serialVersionUID = -6029190864254556079L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer releaseUserId;

    private Integer articleId;

    private String content;// 评论内容

    private Integer seq;

    private Date dt;

}
