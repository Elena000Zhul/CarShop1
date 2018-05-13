package ua.com.me.services.impl;

//@Service
//public class MailServiceImpl implements MailService {
//    @Autowired
//    JavaMailSender javaMailSender;
//    @Autowired
//    Environment environment;

//    @Override
//    public void send(User user) {
//        MimeMessage massage = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(massage);
//        try {
//            massage.setFrom(new InternetAddress("email.username"));
//            helper.setTo(user.getEmail());
//            helper.setText("hi, " + user.getUsername() , true);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//        javaMailSender.send(massage);
//    }
//}
