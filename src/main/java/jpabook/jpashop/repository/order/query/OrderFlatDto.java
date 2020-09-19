package jpabook.jpashop.repository.order.query;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.order.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderFlatDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    private String ItemName;
    private int orderPrice;
    private int orderCount;

    public OrderFlatDto(final Long orderId, final String name, final LocalDateTime orderDate, final OrderStatus orderStatus, final Address address, final String itemName, final int orderPrice, final int orderCount) {
        this.orderId = orderId;
        this.name = name;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.address = address;
        this.ItemName = itemName;
        this.orderPrice = orderPrice;
        this.orderCount = orderCount;
    }
}
