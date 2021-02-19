package com.yun.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

/**
 * TODO 个人信息
 * @date 2021/2/19
 */
@Entity
@Table
@DynamicInsert
@Data
public class SUser implements Serializable {

    private static final long serialVersionUID = 6773079377375984271L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String realName;

    private String password;

    private String salt;

    private String introduce;

    private File head;//

    private String contact;

    private String locate;

}
