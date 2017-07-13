package itproject.com.hitch.GoogleMap;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by HP on 7/9/2017.
 */

public class Route {
    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}