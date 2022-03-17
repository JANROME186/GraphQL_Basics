package com.example.demo.context;

import graphql.kickstart.execution.context.GraphQLContext;
import graphql.kickstart.servlet.context.GraphQLServletContext;
import graphql.kickstart.servlet.context.GraphQLServletContextBuilder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.dataloader.DataLoaderRegistry;

import javax.security.auth.Subject;
import java.util.Optional;

@Getter
@RequiredArgsConstructor
public class CustomGraphQLContext implements GraphQLContext {

    private final String UUID;
    private final GraphQLServletContext context;

    @Override
    public Optional<Subject> getSubject() {
        return context.getSubject();
    }

    @Override
    public @NonNull DataLoaderRegistry getDataLoaderRegistry() {
        return context.getDataLoaderRegistry();
    }
}
