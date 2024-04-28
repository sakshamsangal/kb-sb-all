package com.app.persistant.repo;

import com.app.persistant.entity.UserInfo;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	
	
    Optional<UserInfo> findByName(String username);

}
