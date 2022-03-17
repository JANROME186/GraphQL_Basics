package com.example.demo.context;

import graphql.servlet.GraphQLContext;
import graphql.servlet.GraphQLContextBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.HandshakeRequest;

@Slf4j
@Component
public class CustomGraphQLContextBuilder implements GraphQLContextBuilder {

    @Override
    public GraphQLContext build(HttpServletRequest httpServletRequest) {
        String  uuid = httpServletRequest.getHeader("UUID");
        return new CustomGraphQLContext(uuid, httpServletRequest);
    }

    @Override
    public GraphQLContext build(HandshakeRequest handshakeRequest) {
        throw new IllegalStateException("Unsupported");
    }

    @Override
    public GraphQLContext build() {
        throw new IllegalStateException("Unsupported");
    }
}
