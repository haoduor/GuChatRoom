package com.gu.chatroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @className: com.gu.chatroom.controller.ChatRoomController
 * @description: ChatRoomController - TODO
 * @version: v1.0.0
 * @date: 2019/6/24 15:43
 * @author: haoduor
 */
@Controller
public class ChatRoomController {

    @GetMapping("/chatroom")
    public String getChatRoom() {
        return "chatroom";
    }
}
