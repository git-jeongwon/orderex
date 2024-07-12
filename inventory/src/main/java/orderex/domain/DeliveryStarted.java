package orderex.domain;

import java.util.*;
import lombok.*;
import orderex.domain.*;
import orderex.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
}
