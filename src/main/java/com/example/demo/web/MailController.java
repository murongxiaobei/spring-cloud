package com.example.demo.web;

import com.example.demo.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;
    @RequestMapping("/sendMail")
    public void sendMail(){
        mailService.sendSimpleMail("453645647@qq.com","test simple mail"," hello this is simple mail");
    }
    @RequestMapping("/sendHtmlMail")
    public void sendHtmlMail(){
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("453645647@qq.com","test simple mail",content);
    }
    @RequestMapping("/sendAttachmentsMail")
    public void sendAttachmentsMail(){
        String filePath="c:\\info.txt";
        mailService.sendAttachmentsMail("453645647@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }
    @RequestMapping("/sendInlineResourceMail")
    public void sendInlineResourceMail(){
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "C:/meinv.jpeg";
        mailService.sendInlineResourceMail("ityouknow@126.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }
}
