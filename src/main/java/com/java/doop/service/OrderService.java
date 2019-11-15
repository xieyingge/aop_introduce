package com.java.doop.service;

import com.java.doop.model.Order;

public interface OrderService {
    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
