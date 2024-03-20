package com.personal.messenger.dao;

import com.personal.messenger.pojo.UserMeta;

public interface UserMetaDao {
    Long save(final UserMeta userMeta);

    UserMeta getUserMetaById(String userId);
}
