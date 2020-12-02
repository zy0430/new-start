package com.example;

import com.example.impl.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;

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

//    @Test
    public void sendInlineResourceMail() {
        String rscId = "neo666";
        String rscId2 = "777";
        List<String> rscIds = new ArrayList<>();
        rscIds.add(rscId);
        rscIds.add(rscId2);

        String content = "<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ><img src=\'cid:" + rscId2 + "\' ></body></html>";
        String imgPath = "C:\\Users\\hsrg\\Desktop\\free呼吸1.5\\0915\\3.png";
        String imgPath2 = "C:\\Users\\hsrg\\Desktop\\free呼吸1.5\\0915\\4.png";

        List<String> imgPaths = new ArrayList<>();
        imgPaths.add(imgPath);
        imgPaths.add(imgPath2);
        mailService.sendInlineResourceMail("z6488834134@163.com", "主题：这是有图片的邮件", content, rscIds, imgPaths);
    }

    @Test
    public void sendTemplateMail() {
        Context context = new Context();
        context.setVariable("id", "006");
        String emailContent =templateEngine.process("emailTemplate", context);
        mailService.sendHtmlMail("z6488834134@163.com", "模板", emailContent);
    }
}
