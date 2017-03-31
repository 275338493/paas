package com.xiaoneng.paas.web.controller;

/**
 * Created by Adam on 2016/11/21.
 */

import com.xiaoneng.paas.domian.AccountNumber;
import com.xiaoneng.paas.service.IAccountNumberService;
import com.xiaoneng.paas.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 账户控制
 */
@Controller
public class AccountNumberController {

    @Autowired
    private IAccountNumberService accountNumberService;

    @RequestMapping("/accountNumber_list")
    public String list() {
        return "list";
    }

    //保存
    @RequestMapping("/accountNumber_save")
    @ResponseBody
    public JSONResult save(AccountNumber accountNumber) {
        JSONResult result = null;
        try {
            int effectRow = accountNumberService.insert(accountNumber);
            if(effectRow > 0){
                result = new JSONResult(true,"保存成功");
            }else{
                result = new JSONResult(false,"保存失败");
            }
        } catch (Exception e) {
            result = new JSONResult(false,"保存异常");
        }
        return result;
    }

    //编辑
    @RequestMapping("/accountNumber_update")
    @ResponseBody
    public JSONResult update(AccountNumber accountNumber) {
        JSONResult result = null;
        try {
            int effectRow = accountNumberService.update(accountNumber);
            if(effectRow > 0){
                result = new JSONResult(true,"更新成功");
            }else{
                result = new JSONResult(false,"更新失败");
            }
        } catch (Exception e) {
            result = new JSONResult(false,"更新异常");
        }
        return result;
    }


}
