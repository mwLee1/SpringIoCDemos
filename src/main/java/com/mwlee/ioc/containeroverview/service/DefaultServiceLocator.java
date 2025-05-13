package com.mwlee.ioc.containeroverview.service;

import org.springframework.context.annotation.Bean;


class DefaultServiceLocator {
    private static final ServerService serverService = new ServerService();
    private static final AccountService accountService = new AccountService();

    public ServerService createServerServiceInstance() {
        return serverService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}

class ServerService {
    public ServerService() {
        System.out.println("ServerService created.");
    }
}

class AccountService {
    public AccountService() {
        System.out.println("AccountService created.");
    }
}




