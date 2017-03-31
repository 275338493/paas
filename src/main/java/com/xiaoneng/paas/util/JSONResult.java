package com.xiaoneng.paas.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JSONResult {
    private boolean success = true;
    private String msg;

    public JSONResult() {
    }

    public JSONResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public JSONResult(boolean success) {
        this.success = success;
    }
}
