package store.product;
import lombok.Builder;
import java.util.UUID;
import java.math.BigDecimal;

@Builder
public record ProductOut(
    String id,
    String name,
    BigDecimal price,
    String unit
) {
    
}
