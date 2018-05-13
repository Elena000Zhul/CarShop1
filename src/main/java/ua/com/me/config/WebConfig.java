package ua.com.me.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.File;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan("ua.com.me.*")
@PropertySource("classpath:email.properties")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private Environment env;

    //
//    @Bean
//    public JavaMailSenderImpl javaMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost(env.getProperty("email.host"));
//        mailSender.setPort(Integer.parseInt(env.getProperty("email.port")));
//        mailSender.setUsername(env.getProperty("email.username"));
//        mailSender.setPassword(env.getProperty("email.password"));
//        Properties properties = mailSender.getJavaMailProperties();
//        properties.put(env.getProperty("email.protocol"), env.getProperty("email.protocol.val"));
//        properties.put(env.getProperty("email.auth"), env.getProperty("email.auth.val"));
//        properties.put(env.getProperty("email.starttls"), env.getProperty("email.starttls.val"));
//        properties.put(env.getProperty("email.mail.debug"), env.getProperty("email.mail.debug.val"));
//        return mailSender;
//    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**")
                .addResourceLocations("/static/img/");
        registry.addResourceHandler("/userAvatar/**")
                .addResourceLocations("file:" + System.getProperty("user.home") + File.separator + "usersImages\\");
        registry.addResourceHandler("/produktImages/**")
                .addResourceLocations("file:" + System.getProperty("user.home") + File.separator + "produktImg\\");
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/javascript/");
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
    }


}
