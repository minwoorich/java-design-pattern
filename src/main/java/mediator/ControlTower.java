package mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower {
    private final List<Flight> flights = new ArrayList<>();
    private final Runway runway;

    public ControlTower(Runway runway) {
        this.runway = runway;
    }

    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    public boolean isAvailable() {
        if (runway.isEmpty()) {
            runway.setEmpty(false);
            return true;
        }
        return false;
    }

    public void setRunwayAvailable() {
        runway.setEmpty(true);
    }

}
