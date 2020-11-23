package com.example.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NeoProperties {

    @Value("${com.example.title}")
    private String title;

    @Value("${com.example.description}")
    private String description;
}
