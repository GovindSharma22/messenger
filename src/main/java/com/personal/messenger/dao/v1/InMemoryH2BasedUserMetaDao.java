package com.personal.messenger.dao.v1;

import com.personal.messenger.dao.UserMetaDao;
import com.personal.messenger.dao.v1.entity.UserMetaEntity;
import com.personal.messenger.pojo.UserMeta;
import org.springframework.stereotype.Component;

@Component
public class InMemoryH2BasedUserMetaDao implements UserMetaDao {

    @Override
    public Long save(UserMeta userMeta) {
//        UserMetaEntity userMetaEntity = new UserMetaEntity(userMeta);
//        return userMetaRepo.save(userMetaEntity).getId();
        return null;
    }

    @Override
    public UserMeta getUserMetaById(String userId) {
        return null;
    }
}
