package jpabook.jpashop.repository.order.query;

import lombok.Data;

@Data
public class OrderItemQueryDto {

    private Long orderId;
    private String ItemName;
    private int orderPrice;
    private int orderCount;

    public OrderItemQueryDto(final Long orderId, final String itemName, final int orderPrice, final int orderCount) {
        this.orderId = orderId;
        ItemName = itemName;
        this.orderPrice = orderPrice;
        this.orderCount = orderCount;
    }
}
