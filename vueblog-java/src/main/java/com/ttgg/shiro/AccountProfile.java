package com.ttgg.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LTX
 * @create 2020-10-13 19:40
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String avatar;

    private String email;
}
