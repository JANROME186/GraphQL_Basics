package com.example.demo.context;

import graphql.servlet.GraphQLContext;
import lombok.Getter;

import javax.servlet.http.HttpServletRequest;

@Getter
public class CustomGraphQLContext extends GraphQLContext {

    private final String uuid;

    public CustomGraphQLContext(String uuid, HttpServletRequest request){
        super(request);
        this.uuid = uuid;
    }

}
