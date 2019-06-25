package com.gu.chatroom;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: com.gu.chatroom.User
 * @description: User - TODO
 * @version: v1.0.0
 * @date: 2019/6/25 18:09
 * @author: haoduor
 */
@Data
@AllArgsConstructor
public class User {
    private String username;
    private int id;
    private boolean is_deleted;
    private String gu;
}
