package me.jcala.blog.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/2.
 */
@Service
@PropertySource("classpath:user.properties")
public class IndexSer {
    @Getter
    @Value("${info.userName}")
    private String userName;
}