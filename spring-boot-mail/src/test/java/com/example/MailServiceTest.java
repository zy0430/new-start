package com.example;

import com.example.impl.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    MailService mailService;

    //    @Test
    public void sendMail() {
        mailService.sendSimpleMail("z6488834134@163.com", "test simple mail", " hello this is simple mail");
    }

//    @Test
    public void testHtmlMail() {
        String content = "<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("z6488834134@163.com", "html", content);
    }

//    @Test
    public void sendAttachmentsMail() {
        String filePath = "C:\\Users\\章鱼哥\\Desktop\\hello.txt";
        mailService.sendAttachmentsMail("z6488834134@163.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @Test
    public void sendInlineResourceMail() {
        String rscId = "neo666";

        String content = "<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ><img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "C:\\Users\\章鱼哥\\Desktop\\Capture001.png";
        mailService.sendInlineResourceMail("z6488834134@163.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }
}
