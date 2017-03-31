package com.xiaoneng.paas.domian;

/**
 * Created by Adam on 2016/11/20.
 */

import lombok.Getter;
import lombok.Setter;

/**
 * 账户
 */
@Setter
@Getter
public class AccountNumber extends BaseDomain{

    public static final int PERSON = 0;//人工
    public static final int PRIMARY = 1;//初级机器人
    public static final int MIDDLE = 2;//中级
    public static final int HIGH = 3;//高级
    public static final int PER = 4;//售前

    private String username;//账户名
    private String password;//密码
    private int accountNature;//账户性质
    private Role role;//角色
    private AdministrativeOrganization organization;//行政组
    private String interiorName;//内部名称
    private String exteriorName;//外部名称


}
