package com.app.mock;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ExtField {

    @Value("classpath:filePartEmptyArr.json")
    Resource filePartEmptyArr;


    @Value("classpath:filePartErr.json")
    Resource filePartErr;

}
