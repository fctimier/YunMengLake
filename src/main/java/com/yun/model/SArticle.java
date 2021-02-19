package com.yun.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * TODO
 * 文章
 * @date 2021/2/19
 */
@Entity
@Table
@DynamicInsert
@Data
public class SArticle implements Serializable {

    private static final long serialVersionUID = 8743306838860515979L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(length=2048)
    private String content;

    private Date releaseDt;

    private Date lastUpdateDt;

    private Integer classId;// 所属分类


}
