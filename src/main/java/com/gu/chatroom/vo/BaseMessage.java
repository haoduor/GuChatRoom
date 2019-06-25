package com.gu.chatroom.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: com.gu.chatroom.vo.BaseMessage
 * @description: BaseMessage - TODO
 * @version: v1.0.0
 * @date: 2019/6/22 22:03
 * @author: haoduor
 */
@Data
@AllArgsConstructor
public class BaseMessage {
    private int id;
    private String message;
}
