package mastering.business;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Currency;
import java.util.Objects;

public record Money(Currency currency, BigDecimal value) {
    public Money add(Money money) {
        Objects.requireNonNull(money, "money is required");
        if (currency.equals((money.currency))) {
            BigDecimal result = this.value.add(money.value, MathContext.DECIMAL128);
            return new Money(currency, result);
        }
        throw new RuntimeException("You can't sum money amount with different currency");
    }
}
