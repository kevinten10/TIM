package com.ten.cim.client.service.impl;

import com.ten.cim.client.service.CustomMsgHandleListener;
import com.ten.cim.client.service.MsgLogger;
import com.ten.cim.client.util.SpringBeanFactory;

/**
 * Function:自定义收到消息回调
 *
 * @author ten
 * Date: 2019/1/6 17:49
 * @since JDK 1.8
 */
public class MsgCallBackListener implements CustomMsgHandleListener {


    private MsgLogger msgLogger;

    public MsgCallBackListener() {
        this.msgLogger = SpringBeanFactory.getBean(MsgLogger.class);
    }

    @Override
    public void handle(String msg) {
        msgLogger.log(msg);
    }
}
