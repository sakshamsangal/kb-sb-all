package com.app.security.repo;

import com.app.security.model.UserInfo;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	
	
    Optional<UserInfo> findByName(String username);

}
