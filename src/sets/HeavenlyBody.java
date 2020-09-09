package sets;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
   private final String name;
   private final double orbitalPeriod;
   private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public boolean addMon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }
    //
    // for security new hashSet
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
}
