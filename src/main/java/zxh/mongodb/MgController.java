package zxh.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zxh.mongodb.dao.UserRepository;
import zxh.mongodb.entity.User;


@RestController
@RequestMapping("/mongodb")
public class MgController {
    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/save")
    public String save(){
        userRepository.deleteAll();
        // 创建三个User，并验证User总数
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));

        User u = userRepository.findOne(1L);
        return u.toString();
    }

}
