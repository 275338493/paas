package com.xiaoneng.paas.service;

/**
 * Created by Adam on 2016/11/21.
 */

import com.xiaoneng.paas.domian.AccountNumber;

import java.util.List;

/**
 * 账户服务
 */
public interface IAccountNumberService {

    int insert(AccountNumber accountNumber);

    int update(AccountNumber accountNumber);

    int delete(Long id);

    AccountNumber get(Long id);

    List<AccountNumber> list();


}
