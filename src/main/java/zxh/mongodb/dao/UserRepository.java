package zxh.mongodb.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import zxh.mongodb.entity.User;

public interface UserRepository extends MongoRepository<User,Long> {
    User findByUsername(String username);
}
