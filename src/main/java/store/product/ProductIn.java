package store.product;
import lombok.Builder;
import java.math.BigDecimal;
@Builder
public record ProductIn (
    String name,
    BigDecimal price,
    String unit
){

}


