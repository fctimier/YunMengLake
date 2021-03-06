package com.yun.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;

/**
 * TODO 标签
 * @date 2021/2/19
 */
@Entity
@Table
@DynamicInsert
@Data
public class SArticleTag implements Serializable {

    private static final long serialVersionUID = 6537973313889912926L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer tagId;

    private Integer articleId;

}

