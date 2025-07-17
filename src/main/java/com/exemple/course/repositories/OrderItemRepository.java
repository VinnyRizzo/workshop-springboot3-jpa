package com.exemple.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.course.entities.OrderItem;
import com.exemple.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
