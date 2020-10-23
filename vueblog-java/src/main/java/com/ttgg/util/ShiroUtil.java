package com.ttgg.util;

import com.ttgg.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author LTX
 * @create 2020-10-15 19:26
 */
public class ShiroUtil {

    public static AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
