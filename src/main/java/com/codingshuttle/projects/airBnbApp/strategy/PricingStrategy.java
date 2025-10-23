package com.codingshuttle.projects.airBnbApp.strategy;

import com.codingshuttle.projects.airBnbApp.entity.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calcPrice(Inventory inventory);
}
