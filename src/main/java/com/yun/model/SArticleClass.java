package com.yun.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;

/**
 * TODO 文章分类
 * @date 2021/2/19
 */
@Entity
@Table
@DynamicInsert
@Data
public class SArticleClass implements Serializable {

    private static final long serialVersionUID = -5644518697271427371L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String className;


}
