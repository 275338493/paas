package com.xiaoneng.paas.domian;

/**
 * Created by Adam on 2016/11/21.
 */

import lombok.Getter;
import lombok.Setter;

/**
 * 角色
 */
@Setter
@Getter
public class Role extends BaseDomain{

    private String sn;//角色编码
    private String name;
}
