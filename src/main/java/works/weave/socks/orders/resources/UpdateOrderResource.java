package works.weave.socks.orders.resources;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UpdateOrderResource {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    public Date arrivalDate;
}
