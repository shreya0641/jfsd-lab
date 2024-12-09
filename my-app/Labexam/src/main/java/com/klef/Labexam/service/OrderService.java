package com.klef.Labexam.service;

import com.klef.Labexam.Order;
import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
} 