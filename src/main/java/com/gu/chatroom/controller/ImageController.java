package com.gu.chatroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @className: com.gu.chatroom.controller.ImageController
 * @description: ImageController - TODO
 * @version: v1.0.0
 * @date: 2019/6/14 13:07
 * @author: haoduor
 */
@Controller
@RequestMapping("/image")
public class ImageController {

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @ResponseBody
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        String name = file.getOriginalFilename();
        String path = "C:\\Users\\haoduor\\Desktop\\IDEA\\chatroom\\src\\main\\resources\\static\\image\\";

        File dest = new File(path + name);

        try {
            file.transferTo(dest);
            return "上传成功";
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return "失败";
    }

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        File file = new File("/static");
        String md5 = DigestUtils.md5DigestAsHex("asd".getBytes());
        return md5;
    }
}
