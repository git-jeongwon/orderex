package orderex.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import orderex.domain.*;
import orderex.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventorDecreased extends AbstractEvent {

    private Long id;

    public InventorDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventorDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
