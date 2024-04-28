package com.app.apply_xslt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

@Getter
@Setter
public class ExtField {

    @Value("classpath:xslt/sak.xslt")
    Resource filePartEmptyArr;
}
